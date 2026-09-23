package com.example.demo.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return " <!DOCTYPE html>  <html lang='en'>  <head> <meta charset='UTF-8'> <meta name='viewport' content='width=device-width, initial-scale=1.0'> <title>My First HTML Page</title> </head> <body > <h1>Welcome to My Website</h1>  <p>Hello! This is my first HTML page.</p> <h2>About Me</h2>  <p>My name is Sachin. I am learning web development.</p> <button>Click Me</button> </body> </html>  ";
    }
}
