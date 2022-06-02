package com.personal.programadeengresadosunsie.service;

import com.personal.programadeengresadosunsie.model.Publication;
import com.personal.programadeengresadosunsie.model.TypeOfPublication;
import com.personal.programadeengresadosunsie.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


/**
 * Es la implementación de la interfaz del servicio de las publicaciones
 * @author ivanm
 */

@Service
public class PublicationServiceImp implements PublicationService{

    // Se inyecta el repositorio para las publicaciones
    @Autowired
    PublicationRepository publicationRepository;

    /**
     * Se comunica con el repositorio de las publicaciones para obtener
     * todas las publicaciones realizadas.
     * @return Una lista con todas las publicaciones almacenadas.
     */
    @Override
    public List<Publication> getAllPublications() {
        return publicationRepository.findAll();
    }

    /**
     * Se comunica con el repositorio de las publicaciones para obtener
     * todas las publicaciones realizadas que son QUEJAS.
     * @return Una lista con todas las publicaciones almacenadas que son QUEJAS.
     */
    @Override
    public List<Publication> getAllQuejas() {
        return publicationRepository.findByTypeOfPublication(TypeOfPublication.QUEJA.name());
    }

    /**
     * Se comunica con el repositorio de las publicaciones para obtener
     * todas las publicaciones realizadas que son SUGERENCIAS.
     * @return Una lista con todas las publicaciones almacenadas que son SUGERENCIAS.
     */
    @Override
    public List<Publication> getAllSugerencias() {
        return publicationRepository.findByTypeOfPublication(TypeOfPublication.SUGERENCIA.name());
    }

    /**
     * Se comunica con el repositorio de las publicaciones para almacenar
     * una nueva publicación.
     * @param publication Es el objeto tipo Publication que será almacenado
     * @return El objeto publication que fue creado.
     */
    @Override
    public Publication createPublication(Publication publication) {
        publication.setPublicationDate(LocalDate.now());
        return publicationRepository.save(publication);
    }

}
