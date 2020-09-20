package oh29oh29.way06;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

@Service
public class Way06Service {

    /**
     * execute() and requestCallback()
     */
    public void send() {
        final RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8081/way06";
        final Item item = new Item("mac");
        final HttpEntity<Item> request = new HttpEntity<>(item);

        System.out.println("## Way06 Response");
        restTemplate.execute(url, HttpMethod.POST, requestCallback(item), responseExtractor());
    }

    private RequestCallback requestCallback(final Item createdItem) {
        return clientHttpRequest -> System.out.println("created Item: " + createdItem);
    }

    private ResponseExtractor responseExtractor() {
        return httpClientResponse -> {
            System.out.println("statusCode: " + httpClientResponse.getStatusCode());
            return null;
        };
    }

    private static class Item {
        private String name;

        public Item(String name) {
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
