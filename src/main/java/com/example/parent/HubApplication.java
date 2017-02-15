package com.example.parent;

import com.example.amodule.Service1Application;
import com.example.bmodule.Service2Application;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/hub.properties")
public class HubApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(Service1Application.class).bannerMode(Banner.Mode.OFF).run(args);

        //SpringApplication.run(Service1Application.class, args);

//		final SpringApplicationBuilder app = new SpringApplicationBuilder().parent(Service1Application.class);
//				//.child(Service1Application.class);//.sibling(Service2Application.class);
//		final ConfigurableApplicationContext context = app.run(args);

        System.out.println("Test");

        SpringApplication.run(Service2Application.class, args);

//		final SpringApplicationBuilder app1 = new SpringApplicationBuilder().parent(Service2Application.class);
//				//.child(Service1Application.class);//.sibling(Service2Application.class);
//		final ConfigurableApplicationContext context1 = app1.run(args);

        System.out.println("Test1");
    }
}
