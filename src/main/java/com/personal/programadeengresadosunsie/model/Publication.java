package com.personal.programadeengresadosunsie.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

/**
 * Es el modelo usado para representar una publicación
 * @author ivanm
 */
@Data
@Document
public class Publication {


    private String fullName;
    private String phone;
    private String email;
    private TypeOfPublication typeOfPublication;
    private LocalDate publicationDate;
    private String text;



}






