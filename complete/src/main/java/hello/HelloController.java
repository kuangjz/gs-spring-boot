package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;

@RestController
public class HelloController {
    @Autowired
    private LoadService loadService;
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/load")
    public String load(){
        loadService.register(new File("D:\\mypoc\\production\\gs-spring-boot\\hello2\\out\\artifacts\\hello2_jar\\hello2.jar"));
        return "load service hello2( url =/2) success!";
    }
    
}
