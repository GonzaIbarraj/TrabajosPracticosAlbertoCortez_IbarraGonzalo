package org.example.entidades;


import lombok.*;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


@SuperBuilder
public class ArticuloManufacturadoDetalle {

    private Long id;
    private Integer cantidad;


    private ArticuloInsumo articuloInsumo;
}
