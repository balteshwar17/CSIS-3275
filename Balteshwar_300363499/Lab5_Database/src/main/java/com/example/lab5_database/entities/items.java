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
public class items {

    @Id
    private String Catcode;
    private String Icode;

    private String Idesc;
    private Float Price;



}
