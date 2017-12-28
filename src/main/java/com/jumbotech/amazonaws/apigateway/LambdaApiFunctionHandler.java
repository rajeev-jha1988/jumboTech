package com.jumbotech.amazonaws.apigateway;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.slf4j.LoggerFactory;

import com.amazonaws.serverless.exceptions.ContainerInitializationException;
import com.amazonaws.serverless.proxy.internal.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.internal.model.AwsProxyResponse;
import com.amazonaws.serverless.proxy.spring.SpringLambdaContainerHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jumbotech.configure.JumboTechApi;

public class LambdaApiFunctionHandler implements RequestStreamHandler {
	private SpringLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> handler;
	private static ObjectMapper mapper = new ObjectMapper();
	private org.slf4j.Logger log = LoggerFactory.getLogger(LambdaApiFunctionHandler.class);
	@Override
	public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
		
		  if (handler == null) {
	            try {
	                handler = SpringLambdaContainerHandler.getAwsProxyHandler(JumboTechApi.class);
	            } catch (ContainerInitializationException e) {
	                log.error("Cannot initialize Spring container", e);
	                outputStream.close();
	                throw new RuntimeException(e);
	            }
	        }

	        AwsProxyRequest request = mapper.readValue(inputStream, AwsProxyRequest.class);

	        AwsProxyResponse resp = handler.proxy(request, context);

	        mapper.writeValue(outputStream, resp);
	        // just in case it wasn't closed by the mapper
	        outputStream.close();
	}

}
