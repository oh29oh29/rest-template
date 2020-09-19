package oh29oh29.way01;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Way01Runner implements ApplicationRunner {

    private final Way01Service service;

    public Way01Runner(Way01Service service) {
        this.service = service;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        service.send();
    }
}
