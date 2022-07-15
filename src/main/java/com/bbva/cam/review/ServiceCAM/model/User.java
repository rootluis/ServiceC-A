package com.bbva.cam.review.ServiceCAM.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "col1_user")
public class User {

    @Id
    private String userId;

    private String nombre;

    private String apPaterno;

    private String apMaterno;

    private String email;

    private String equipo;

    private boolean activo;

}
