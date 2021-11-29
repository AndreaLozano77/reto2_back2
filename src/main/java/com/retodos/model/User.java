package com.retodos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Andrea Lozano Cataño
 */
@Document(collection = "usuarios") 
@Data //No definir getter y setters
@NoArgsConstructor //No constructores
@AllArgsConstructor 
public class User {

    @Id //Identificador unico
    private Integer id;
    private String identification;
    private String name;
    private String address;
    private String cellPhone;
    private String email;
    private String password;
    private String zone;
    private String type;

}
