//package config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//@EnableWebFluxSecurity
//public class SecurityConfig {
//    @Bean
//    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
//        http.authorizeExchange(exchanges -> exchanges.anyExchange().authenticated())
//                .oauth2Login(Customizer.withDefaults());
//        http.csrf().disable();
//        return http.build();
//    }
//}
