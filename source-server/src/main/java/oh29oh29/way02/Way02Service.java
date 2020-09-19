package oh29oh29.way02;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Way02Service {

    /**
     * getForObject
     */
    public void send() {
        final RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8081/way02";
        final User response = restTemplate.getForObject(url, User.class);

        System.out.println("## Way02 Response");
        System.out.println("data: " + response);
    }

    private static class User {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
