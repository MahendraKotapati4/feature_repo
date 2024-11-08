package com.example.demo.dao;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class MarksDao {

    private int rollNo;

    private String student;

    private double mobile;

    private int telugu;

    private int hindi;

    private int english;

    private int maths;

    private int science;

    private int social;

}
