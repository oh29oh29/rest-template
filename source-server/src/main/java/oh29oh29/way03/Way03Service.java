package oh29oh29.way03;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Way03Service {

    /**
     * headForHeaders
     */
    public void send() {
        final RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8081/way03";
        final HttpHeaders headers = restTemplate.headForHeaders(url);

        System.out.println("## Way03 Response");
        System.out.println("headers: " + headers);
    }
}
