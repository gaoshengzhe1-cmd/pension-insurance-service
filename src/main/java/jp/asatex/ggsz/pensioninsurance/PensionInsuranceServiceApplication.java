package jp.asatex.ggsz.pensioninsurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@SpringBootApplication
@EnableWebFlux
public class PensionInsuranceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PensionInsuranceServiceApplication.class, args);
    }

    @Bean
    public WebFluxConfigurer corsConfigurer() {
        return new WebFluxConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                    .allowedOrigins(
                        "https://kanagawa-hoken-frontend-519997578960.asia-northeast1.run.app",
                        "http://localhost:3000"
                    )
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                    .allowedHeaders("*")
                    .allowCredentials(true)
                    .maxAge(3600);
            }
        };
    }
}
