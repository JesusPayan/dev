package springdemoexample.springdemoexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloWorldController {
    @GetMapping("/hello")
    public String Greetings(){
        return "Never Stop Learning :)";
    }
}
