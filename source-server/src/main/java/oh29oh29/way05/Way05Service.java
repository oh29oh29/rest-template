package oh29oh29.way05;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Way05Service {

    /**
     * exchange()
     */
    public void send() {
        final RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8081/way05";
        final HttpEntity<Item> request = new HttpEntity<>(new Item("mac"));
        final ResponseEntity<Item> response = restTemplate.exchange(url, HttpMethod.POST, request, Item.class);

        System.out.println("## Way05 Response");
        System.out.println("body: " + response.getBody());
        System.out.println("statusCode: " + response.getStatusCode());
    }

    private static class Item {
        private String name;

        /**
         * 만약 인자 없는 constructor 를 추가 하지 않으면 아래와 같은 exception 을 보게 된다.
         * <p>
         * Caused by: com.fasterxml.jackson.databind.exc.MismatchedInputException:
         * Cannot construct instance of `oh29oh29.way04.Way04Service$Item` (although at least one Creator exists):
         * cannot deserialize from Object value (no delegate- or property-based Creator) at [Source: (PushbackInputStream); line: 1, column: 2]
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

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
