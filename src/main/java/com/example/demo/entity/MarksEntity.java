package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "marks")
@Data
public class MarksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RollNumber" )
    private long rollNo;
    @Column(name = "StudentName" )
    private String student;
    @Column(name = "Mobile" )
    private double mobile;
    @Column(name = "Telugu" )
    private int telugu;
    @Column(name = "Hindi" )
    private int hindi;
    @Column(name = "English" )
    private int english;
    @Column(name = "Maths" )
    private int maths;
    @Column(name = "Science" )
    private int science;
    @Column(name = "Social" )
    private int social;
    @Column(name = "Total" )
    private int total;

}
