package com.astrologic.astrologic.error;

import java.time.LocalDateTime;

public class ApiError {

    private String mensaje;
    private int codigo;
    private LocalDateTime timestamp;

    public ApiError(String mensaje, int codigo) {
        this.mensaje = mensaje;
        this.codigo = codigo;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Error: " + mensaje +
               " | Codigo: " + codigo +
               " | Timestamp: " + timestamp;
    }
}