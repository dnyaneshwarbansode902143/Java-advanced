package com.jspiders.hibernate6.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="aadhar_info")
@Data
public class Aadhar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Column(nullable = false, unique = true)
	private long aadharNumber;
    @OneToOne
    private Person person;
}
