package com.devuelvemelo.microservicio_producto.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "productos")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Producto {

    @Id
    private ObjectId id;
    private String usuarioId;
    private String nombre;
    private String tipo;
    private String estado;

}
