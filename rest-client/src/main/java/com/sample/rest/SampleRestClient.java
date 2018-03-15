package com.sample.rest;

public class SampleRestClient {

	@SpringBootApplication
	public class Application {
	    public static void main(String[] args) {
	        System.out.println("main()");
	        try (ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args)) {
	            Application app = ctx.getBean(Application.class);
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

	// a
}
