package oh29oh29.way04;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Way04Runner implements ApplicationRunner {

    private final Way04Service service;

    public Way04Runner(Way04Service service) {
        this.service = service;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        service.send();
    }
}
