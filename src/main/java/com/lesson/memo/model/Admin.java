package com.lesson.memo.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "admin")
@Data
@NoArgsConstructor
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "last_name",
    			nullable = false,
    			length = 255)
    private String lastName;

    @Column(name = "first_name",
    			nullable = false,
    			length = 255)
    private String firstName;
    
    @Column(name = "email",
    			unique = true,
    			nullable = false,
    			length = 255)
    private String email;
    
    @Column(name = "password",
    			nullable = false,
    			length = 255)
    private String password;

    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

    
    @UpdateTimestamp
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    
}
