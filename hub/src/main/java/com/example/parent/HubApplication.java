package com.example.parent;

import com.example.amodule.Service1Application;
import com.example.bmodule.Service2Application;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import static java.lang.String.format;

@SpringBootApplication
@PropertySource("classpath:/hub.properties")
public class HubApplication {

    public static void main(String[] args) {

        final ConfigurableApplicationContext service1 = new SpringApplicationBuilder(Service1Application.class).bannerMode(Banner.Mode.OFF).run(args);
        final ConfigurableApplicationContext service2 = new SpringApplicationBuilder(Service2Application.class).bannerMode(Banner.Mode.OFF).run(args);


        System.out.println(format(" service 1 at port: %s", ((AnnotationConfigEmbeddedWebApplicationContext)service1).getEmbeddedServletContainer().getPort()));
        System.out.println(format(" service 2 at port: %s", ((AnnotationConfigEmbeddedWebApplicationContext)service2).getEmbeddedServletContainer().getPort()));
    }
}
