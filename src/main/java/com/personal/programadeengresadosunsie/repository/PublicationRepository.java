package com.personal.programadeengresadosunsie.repository;

import com.personal.programadeengresadosunsie.model.Publication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Es el repositorio de las publicaciones. Se comunica con la BD para obtener información asociada a las
 * publicaciones.
 */
public interface PublicationRepository extends MongoRepository<Publication, String> {

    /**
     * Consulta las publicaciones que correspondan al typeOfPublication especificado.
     * @param typeOfPublication Es el tipo de la publicación.
     * @return Una lista con las publicaciones que sean del tipo de publicacion especificado.
     */
    @Query(value = "{typeOfPublication : ?0}" )
    public List<Publication> findByTypeOfPublication(String typeOfPublication);
    

}
