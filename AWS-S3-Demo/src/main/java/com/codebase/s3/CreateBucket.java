package com.codebase.s3;

import java.util.List;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;

public class CreateBucket {

	public static void main(String[] args) {
		
		String accessKey = "";
		String secretKey = "";


		AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
		AmazonS3 s3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials)).build();

		String bucket_name = "myfbww-raviguptacloud2020";
		
		try {
			
			List<Bucket> buckets = s3.listBuckets();
			
		}catch(AmazonS3Exception ex) {
			ex.printStackTrace();
		}
	}
	

}
