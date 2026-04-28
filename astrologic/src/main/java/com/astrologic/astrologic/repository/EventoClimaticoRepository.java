package com.astrologic.astrologic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.astrologic.astrologic.model.EventoClimatico;

public interface EventoClimaticoRepository extends JpaRepository<EventoClimatico, Long> {
}