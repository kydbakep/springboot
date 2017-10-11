package springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ApplicationController {
    @RequestMapping("/")
    public String showIndexPage(){
        return "index-page";
    }

    @RequestMapping("/hello")
    public String printHello() {
        return "hello-world";
    }

    @RequestMapping("/test")
    public String sowTestPage(){
        return "test-page";
    }
}
