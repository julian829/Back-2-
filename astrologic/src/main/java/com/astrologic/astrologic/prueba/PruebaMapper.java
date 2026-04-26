package com.astrologic.astrologic.prueba;

import com.astrologic.astrologic.model.EventoClimatico;
import com.astrologic.astrologic.dto.EventoClimaticoDTO;
import com.astrologic.astrologic.mapper.EventoClimaticoMapper;

public class PruebaMapper {

    public static void main(String[] args) {

        EventoClimatico evento = new EventoClimatico();
        evento.setNombre("Tormenta");
        evento.setTipo("Tormenta fuerte");
        evento.setFecha("2026-04-20");
        evento.setUbicacion("Medellín");

        EventoClimaticoMapper mapper = new EventoClimaticoMapper();

        EventoClimaticoDTO dto = mapper.aDTO(evento);

        System.out.println("DTO:");
        System.out.println(dto.getNombre());
        System.out.println(dto.getTipo());

        EventoClimatico nuevoEvento = mapper.aModelo(dto);

        System.out.println("Modelo:");
        System.out.println(nuevoEvento.getNombre());
        System.out.println(nuevoEvento.getUbicacion());
    }
}