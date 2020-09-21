package oh29oh29.way07;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Way07Service {

    private final RestTemplate restTemplate;

    public Way07Service(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void send() {
        final String url = "http://localhost:8081/way07";
        final ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        System.out.println("## Way07 Response");
        System.out.println("body: " + response.getBody());
        System.out.println("statusCode: " + response.getStatusCode());
    }
}
