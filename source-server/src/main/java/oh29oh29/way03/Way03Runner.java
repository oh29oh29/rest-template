package oh29oh29.way03;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Way03Runner implements ApplicationRunner {

    private final Way03Service service;

    public Way03Runner(Way03Service service) {
        this.service = service;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        service.send();
    }
}
