package oh29oh29.way01.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Way01RestTemplateService {

    public void send() {
        final RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8081/destination";
        final ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        System.out.println("Response Body: " + response.getBody());
        System.out.println("Response Status Code: " + response.getStatusCode());
    }
}
