package com.astrologic.astrologic.mapper;

import org.springframework.stereotype.Component;

import com.astrologic.astrologic.model.EventoClimatico;
import com.astrologic.astrologic.dto.EventoClimaticoDTO;

@Component
public class EventoClimaticoMapper {

    public EventoClimaticoDTO aDTO(EventoClimatico evento) {
        EventoClimaticoDTO dto = new EventoClimaticoDTO();

        dto.setNombre(evento.getNombre());
        dto.setTipo(evento.getTipo());
        dto.setFecha(evento.getFecha());
        dto.setUbicacion(evento.getUbicacion());

        return dto;
    }

    public EventoClimatico aModelo(EventoClimaticoDTO dto) {
        EventoClimatico evento = new EventoClimatico();

        evento.setNombre(dto.getNombre());
        evento.setTipo(dto.getTipo());
        evento.setFecha(dto.getFecha());
        evento.setUbicacion(dto.getUbicacion());

        return evento;
    }
}