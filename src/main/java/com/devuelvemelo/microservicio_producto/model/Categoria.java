package com.devuelvemelo.microservicio_producto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "CATEGORIA")
public class Categoria {

    @Id
    private String id;
    private String nombre;
    private String tipo;

}
