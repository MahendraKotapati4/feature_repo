package com.example.demo.repo;

import com.example.demo.entity.MarksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksRepository extends JpaRepository<MarksEntity,Long> {
}
