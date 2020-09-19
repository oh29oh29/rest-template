package oh29oh29.way05;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Way05Runner implements ApplicationRunner {

    private final Way05Service service;

    public Way05Runner(Way05Service service) {
        this.service = service;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        service.send();
    }
}
