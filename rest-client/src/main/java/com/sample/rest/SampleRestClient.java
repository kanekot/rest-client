package com.sample.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SampleRestClient {

	public static void main(String[] args) {
		System.out.println("main()");
		try (ConfigurableApplicationContext ctx = SpringApplication.run(SampleRestClient.class, args)) {
			SampleRestClient app = ctx.getBean(SampleRestClient.class);
			app.run(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void run(String... args) throws Exception {
		System.out.println("処理開始");
		//アプリの処理
		System.out.println("処理終了");
	}
}

