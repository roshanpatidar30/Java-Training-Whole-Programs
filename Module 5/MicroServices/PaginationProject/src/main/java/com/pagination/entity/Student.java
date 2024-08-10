package com.pagination.entity;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "Student_Table")
public class Student implements Serializable{
private static final long serialVersionUID = 478261324583070592L;

@jakarta.persistence.Id
@GeneratedValue
@Column(name = "Id")
private UUID Id;
private String name;
private String city;

}
