package lk.avalanche.battlebuddy.security;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan("lk.avalanche.battlebuddy")
@EnableWebMvc
@EnableWebSecurity
public class WebAppConfig {
}
