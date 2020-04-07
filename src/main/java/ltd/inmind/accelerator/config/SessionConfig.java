package ltd.inmind.accelerator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.session.ReactiveMapSessionRepository;
import org.springframework.session.ReactiveSessionRepository;
import org.springframework.session.Session;
import org.springframework.session.config.annotation.web.server.EnableSpringWebSession;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@EnableSpringWebSession
public class SessionConfig {

    private static Map<String, Session> sessions = new ConcurrentHashMap<>();


    //这里是为了测试 实际上可以用redis的。
    @Bean
    public ReactiveSessionRepository reactiveSessionRepository() {

        return new ReactiveMapSessionRepository(sessions);
    }


    /*@Bean //另外基于Header的resolver不能用
    public WebSessionIdResolver webSessionIdResolver() {
        HeaderWebSessionIdResolver resolver = new HeaderWebSessionIdResolver();
        resolver.setHeaderName("X-AUTH-TOKEN");
        return resolver;
    }*/

}
