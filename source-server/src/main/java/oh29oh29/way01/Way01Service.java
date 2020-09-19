package oh29oh29.way01;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Way01Service {

    /**
     * getForEntity
     */
    public void send() {
        final RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8081/way01";
        final ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        System.out.println("## Way01 Response");
        System.out.println("body: " + response.getBody());
        System.out.println("statusCode: " + response.getStatusCode());
    }
}
