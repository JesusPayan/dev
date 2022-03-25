package springdemoexample.springdemoexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operations")
public class OperationController {

    @GetMapping("/add")
    private int add(){
        return 10 + 20;
    }
    @GetMapping("/diference")
    private int diference(){
        return 20 - 10;
    }

}
