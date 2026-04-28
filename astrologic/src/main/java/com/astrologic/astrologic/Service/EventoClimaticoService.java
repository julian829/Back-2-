package com.astrologic.astrologic.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astrologic.astrologic.dto.EventoClimaticoDTO;
import com.astrologic.astrologic.mapper.EventoClimaticoMapper;
import com.astrologic.astrologic.model.EventoClimatico;
import com.astrologic.astrologic.repository.EventoClimaticoRepository;
import com.astrologic.astrologic.error.ApiError;

@Service
public class EventoClimaticoService {

    @Autowired
    private EventoClimaticoRepository repository;

    @Autowired
    private EventoClimaticoMapper mapper;

    public Object guardar(EventoClimaticoDTO dto) {

        if (dto.getNombre() == null || dto.getNombre().isEmpty()) {
            return new ApiError("El nombre es obligatorio", 400);
        }

        EventoClimatico evento = mapper.aModelo(dto);
        EventoClimatico guardado = repository.save(evento);

        return mapper.aDTO(guardado);
    }
}