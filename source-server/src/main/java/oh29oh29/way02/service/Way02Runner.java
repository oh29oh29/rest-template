package oh29oh29.way02.service;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Way02Runner implements ApplicationRunner {

    private final Way02Service service;

    public Way02Runner(Way02Service service) {
        this.service = service;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        service.send();
    }
}
