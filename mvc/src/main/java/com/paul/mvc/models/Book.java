package com.paul.mvc.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Book {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @Column
 @Size(min = 5, max = 200)
 private String title;
 @Column
 @Size(min = 5, max = 200)
 private String description;
 
 @Column
 @Size(min = 3, max = 40)
 private String language;
 
 @Column
 @Min(100)
 private int numberOfPages;
 // This will not allow the createdAt column to be updated after creation
 @Column(updatable=false)
 @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
 private Date createdAt;
 @Column
 @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
 private Date updatedAt;
}
