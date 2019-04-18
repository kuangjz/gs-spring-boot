package hello2;

import org.springframework.stereotype.Service;

@Service
public class Hello2Service {
    public String sayHello(String name){
        return "Hello "+ name;
    }
}
