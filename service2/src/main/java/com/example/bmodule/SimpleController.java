package com.example.bmodule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.String.format;

@RestController
@RequestMapping("/")
public class SimpleController {

    @Autowired
    private ApplicationContext context;

    @RequestMapping(method = RequestMethod.GET)
    public String info() {
        for (String beanDef : context.getBeanDefinitionNames()) {
            System.out.println(format("Bean def name %s", beanDef));
        }
        return format("Service 2 - name:%s, id:%s, ref:%s", context.getApplicationName(), context.getId(), context);
    }
}
