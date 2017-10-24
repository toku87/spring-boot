package com.github.xenteros;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    RestTemplate restTemplate (){
        return new
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping("/hello-name/ {name}")
    public String helloName(@PathVariable String name) {
        return "hello" + name;
    }
    @GetMapping("hello-param")
    public String helloParam(@RequestParam("name") String name) {
        return "Hello" + name + "via param";
    }
    @PostMapping("/hello-body")
    public String helloBody(@RequestBody String name) {
        return "Hello" + name;
    }
}
