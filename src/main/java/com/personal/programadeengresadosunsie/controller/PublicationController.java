package com.personal.programadeengresadosunsie.controller;

import com.personal.programadeengresadosunsie.model.Publication;
import com.personal.programadeengresadosunsie.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * Este es el controlador para las publicaciones
 * @author ivanm
 */

@CrossOrigin
@RestController
@RequestMapping("/publicaciones")
public class PublicationController {

    // Inyecta el servicio para las publicaciones
    @Autowired
    PublicationService publicationService;

    /**
     * Controla la petición GET para obtener todas las publicaciones realizadas.
     * @return Una lista de las publicaciones, cada publicación en formato JSON.
     */
    @GetMapping("")
    public List<Publication> getPublications() {
        return publicationService.getAllPublications();
    }

    /**
     * Controla la petición GET para obtener todas las publicaciones que son QUEJAS.
     * @return Una lista de las publicaciones que son QUEJAS, cada publicación en formato JSON.
     */
    @GetMapping("/quejas")
    public List<Publication> getQuejas() {
        return publicationService.getAllQuejas();
    }


    /**
     * Controla la petición GET para obtener todas las publicaciones que son SUGERENCIAS.
     * @return Una lista de las publicaciones que son SUGERENCIAS, cada publicación en formato JSON.
     */
    @GetMapping("/sugerencias")
    public List<Publication> getSugerencias() {
        return publicationService.getAllSugerencias();
    }


    /**
     * Controla la petición POST para la creación de una nueva publicación.
     * @param publication Es el objeto que representa una publicación.
     * @return El objeto Publication que fue creado en formato JSON .
     */
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public Publication createPublication(@RequestBody Publication publication) {
        return publicationService.createPublication(publication);
    }


}
