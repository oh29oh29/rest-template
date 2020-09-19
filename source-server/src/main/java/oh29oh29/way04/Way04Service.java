package oh29oh29.way04;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Way04Service {

    /**
     * postForObject()
     */
    public void send() {
        final RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8081/way04";
        final HttpEntity<Item> request = new HttpEntity<>(new Item("mac"));
        final Item item = restTemplate.postForObject(url, request, Item.class);

        System.out.println("## Way04 Response");
        System.out.println("data: " + item);
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
