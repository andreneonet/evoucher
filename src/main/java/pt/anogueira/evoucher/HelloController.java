package pt.anogueira.evoucher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping(path="/", produces = "application/json")
    public String hello() {
        return "Hello world!!!";
    }
}
