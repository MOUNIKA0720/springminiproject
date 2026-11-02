package com.smsk.healthcare.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jspecify.annotations.NonNull;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class std
{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     @NonNull
     private String name;
     @NonNull
     private int age;

}
