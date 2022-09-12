package com.pack.org;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogToCloudWatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogToCloudWatchApplication.class, args);
		LogToCloudWatchApplication ss = new LogToCloudWatchApplication();
		ss.doSomething("Hello");
	}
	
	public void doSomething(String message) {
        Logger logger = LoggerFactory.getLogger(LogToCloudWatchApplication.class);
        logger.info("message -> " + message);
        try {
            Thread.sleep(20000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Finish execution.");

    }

}
