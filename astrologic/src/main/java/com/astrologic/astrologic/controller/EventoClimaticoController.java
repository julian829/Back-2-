package com.astrologic.astrologic.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import com.astrologic.astrologic.model.EventoClimatico;

public interface EventoClimaticoController extends JpaRepository<EventoClimatico, Long> {
}