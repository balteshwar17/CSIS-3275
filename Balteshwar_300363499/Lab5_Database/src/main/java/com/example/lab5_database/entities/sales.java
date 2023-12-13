package com.example.lab5_database.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class sales {

    private int recno;
    private String icode;
    private double qty;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dot;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
