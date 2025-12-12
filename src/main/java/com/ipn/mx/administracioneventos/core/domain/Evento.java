package com.ipn.mx.administracioneventos.core.domain;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Evento", schema = "public")
public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEvento", nullable = false)
    private Long idEvento;

    @NotEmpty(message = "No puede estar vacio")
    @Column(name = "nombreEvento", nullable = false, length = 200)
    private String nombreEvento;

    @NotEmpty(message = "No puede estar vacia")
    @Column(name = "descripcionEvento", nullable = false, length = 500)
    private String descripcionEvento;

    @NotNull(message = "La fecha no puede ser nula")
    @FutureOrPresent(message = "La fecha de inicio debe ser hoy o cualquier fecha en el futuro")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @NotNull(message = "La fecha no puede ser nula")
    @FutureOrPresent(message = "La fecha de fin debe ser hoy o cualquier fecha en el futuro")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
}
