package srm.com.bootcurd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/main")
public class Controller {

    @GetMapping("/home")
    public String welcome(){
        return "Welcome";
    }
}
