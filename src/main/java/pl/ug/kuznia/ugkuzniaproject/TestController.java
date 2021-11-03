package pl.ug.kuznia.ugkuzniaproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/helloWorld")
    public String helloWorld(@RequestParam(defaultValue = "user") String user) {
        return "Hello " + user + "!";
    }
}
