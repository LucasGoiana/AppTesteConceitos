package br.com.lucas.goiana.usuarios.configuration;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MicrometerConfig {

    @Bean
    public MeterRegistry meterRegistry() {
        return new SimpleMeterRegistry(); // Você pode escolher o tipo de MeterRegistry que deseja usar
    }
}