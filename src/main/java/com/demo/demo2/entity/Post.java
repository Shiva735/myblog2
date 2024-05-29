package com.demo.demo2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table (name= "posts")
@Entity
@Data   //it work as getters and setters to string equals and hascode and also requiredArgsConstructyor-->for notnull
@AllArgsConstructor
@NoArgsConstructor
public class Post {



@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String title;

    private String descreption;
    private String content;

}
