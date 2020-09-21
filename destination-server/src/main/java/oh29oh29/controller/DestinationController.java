package oh29oh29.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DestinationController {

    @GetMapping("/way01")
    public String way01() {
        return "way01";
    }

    @GetMapping({"/way02", "way03"})
    public User way02way03() {
        return new User("oh29oh29", 32);
    }

    @PostMapping({"/way04", "/way05"})
    public Item way04way05(@RequestBody Item request) {
        return new Item(request.getName());
    }

    @PostMapping("/way06")
    public Item way06(Item request) {
        return new Item(request.getName());
    }

    @GetMapping("/way07")
    public String way07() throws InterruptedException {
        Thread.sleep(3_000);
        return "way07";
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

    private static class Item {
        private String name;

        /**
         * 만약 인자 없는 constructor 추가 하지 않으면 아래와 같은 로그를 보게 된다.
         * <p>
         * Resolved [org.springframework.http.converter.HttpMessageNotReadableException:
         * Invalid JSON input: Cannot construct instance of `oh29oh29.controller.DestinationController$Item` (although at least one Creator exists):
         * cannot deserialize from Object value (no delegate- or property-based Creator); nested exception is com.fasterxml.jackson.databind.exc.MismatchedInputException:
         * Cannot construct instance of `oh29oh29.controller.DestinationController$Item` (although at least one Creator exists):
         * cannot deserialize from Object value (no delegate- or property-based Creator) at [Source: (PushbackInputStream); line: 1, column: 2]]
         */
        public Item() {
        }

        public Item(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
