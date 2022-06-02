package com.personal.programadeengresadosunsie.service;

import com.personal.programadeengresadosunsie.model.Publication;

import java.util.List;

/**
 * Este es la interfaz del servicio para las publicaciones.
 * Conecta el repositorio de las publicaciones con su controlador.
 * @author ivanm
 */

public interface PublicationService {
    /**
     * Obtiene todos los registros de las publicaciones.
     * @return Una lista con todas las publicaciones realizadas.
     */
    List<Publication> getAllPublications();

    /**
     * Crea una nueva publicación
     * @param publication Es el objeto tipo Publication que será almacenado
     * @return El objeto Publication que fue creado.
     */
    Publication createPublication(Publication publication);

    /**
     * Obtiene todas las publicaciones que son QUEJAS.
     * @return Una lista con las publicaciones que son QUEJAS.
     */
    List<Publication> getAllQuejas();
    /**
     * Obtiene todas las publicaciones que son SUGERENCIAS.
     * @return Una lista con las publicaciones que son SUGERENCIAS.
     */
    List<Publication> getAllSugerencias();
}
