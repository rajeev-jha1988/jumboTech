package com.jumbotech.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;

@Configuration
public class AwsServiceConfig {

	@Bean
    public AmazonDynamoDB amazonDynamoDB() {
		AmazonDynamoDB amazonDynamoDB =	AmazonDynamoDBClientBuilder.standard().build();
        return amazonDynamoDB;
    }
	
	@Bean
	public DynamoDB dynamoDB(AmazonDynamoDB amazonDynamoDB) {
		DynamoDB dynamoDB = new DynamoDB(amazonDynamoDB);
		return dynamoDB;
	}
	
	@Bean
	public DynamoDBMapper dynamoDbMapper(AmazonDynamoDB amazonDynamoDB) {
		DynamoDBMapper dynamoDBMapper = new  DynamoDBMapper(amazonDynamoDB);
		return dynamoDBMapper;
		
	}
	
}
