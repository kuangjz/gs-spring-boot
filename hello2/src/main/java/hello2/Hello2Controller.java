package hello2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Hello2Controller {
    @Autowired
    private Hello2Service service;
    @RequestMapping("/2")
    public String index() {
        return service.sayHello("kuang jian zhong!");
    }

    @RequestMapping("/3")
    public String other() {
        return service.sayHello("baby!");
    }

    @RequestMapping("/4")
    public String other2() {
        return service.sayHello("baby, my baby!");
    }
}
