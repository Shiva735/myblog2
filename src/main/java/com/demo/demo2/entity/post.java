package com.demo.demo2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table (name= "posts")
@Entity
@Data   //it work as getters and setters
@AllArgsConstructor
@NoArgsConstructor
public class post {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String descreption;
    private String content;

}
