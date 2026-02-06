package com.example.demo4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample11 {

    private static final Logger logger = LoggerFactory.getLogger(Sample11.class);

    @GetMapping("/sample11")
    public String get() {

        logger.trace("Mensaje TRACE - muy detallado");
        logger.debug("Mensaje DEBUG - información de depuración");
        logger.info("Mensaje INFO - información general");
        logger.warn("Mensaje WARN - advertencia");
        logger.error("Mensaje ERROR - error");

        // Con parámetros (más eficiente que concatenar)
        String usuario = "Juan";
        logger.info("Usuario {} ha iniciado sesión", usuario);

        // Con excepción
        try {
            int c = 16 / 0;
        } catch (Exception e) {
            logger.error("Error procesando solicitud", e);
        }

        return "Sample-11";
    }
}
