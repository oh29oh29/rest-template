package oh29oh29.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DestinationController {

    @GetMapping("/string")
    public String getString() {
        return "string";
    }

    @GetMapping("/object")
    public User getUser() {
        return new User("oh29oh29", 32);
    }

    private static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
