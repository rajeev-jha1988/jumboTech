package com.jumbotech.amazonaws.apigateway;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.slf4j.LoggerFactory;

import com.amazonaws.serverless.proxy.internal.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.internal.model.AwsProxyResponse;
import com.amazonaws.serverless.proxy.spring.SpringLambdaContainerHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LambdaApiFunctionHandler implements RequestStreamHandler {
	private SpringLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> handler;
	private static ObjectMapper mapper = new ObjectMapper();
	private org.slf4j.Logger log = LoggerFactory.getLogger(LambdaApiFunctionHandler.class);
	@Override
	public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {
	}

}
