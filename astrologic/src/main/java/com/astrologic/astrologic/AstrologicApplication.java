package com.astrologic.astrologic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.astrologic.astrologic.dto.EventoClimaticoDTO;
import com.astrologic.astrologic.Service.EventoClimaticoService;

@SpringBootApplication
public class AstrologicApplication {

    public static void main(String[] args) {
        SpringApplication.run(AstrologicApplication.class, args);
    }

    @Bean
    CommandLineRunner ejecutar(EventoClimaticoService service) {
        return args -> {

            // Caso con error
            EventoClimaticoDTO dto = new EventoClimaticoDTO();
            dto.setNombre("");

            Object resultado = service.guardar(dto);
            System.out.println(resultado);

            // Caso correcto
            EventoClimaticoDTO dto2 = new EventoClimaticoDTO();
            dto2.setNombre("Tormenta");
            dto2.setTipo("Natural");
            dto2.setFecha("2026-04-28");
            dto2.setUbicacion("Colombia");

            Object resultado2 = service.guardar(dto2);
            System.out.println(resultado2);
        };
    }
}