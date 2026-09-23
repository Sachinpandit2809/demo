package com.example.demo.Demo;

// import org.springframework.core.io.ClassPathResource;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class PortFolioRendring {
     @GetMapping(value = "/portfolio", produces = MediaType.TEXT_HTML_VALUE)
    public Resource hello() {
        System.out.println(" Rendring PortFolio");
        return new ClassPathResource("./static/portfolio.html");
    }
}

