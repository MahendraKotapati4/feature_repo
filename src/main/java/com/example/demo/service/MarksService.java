package com.example.demo.service;

import com.example.demo.dao.MarksDao;
import com.example.demo.entity.MarksEntity;
import com.example.demo.repo.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksService {

    @Autowired
    MarksRepository repository;

    public void saveMarks(MarksDao marksDao) {
        MarksEntity marksEntity=  deserailaizeMarksDaoToMarksEntity(marksDao);
        repository.save(marksEntity);
    }

    public MarksEntity deserailaizeMarksDaoToMarksEntity(MarksDao marksDao){
        MarksEntity entity = new MarksEntity();
       entity.setRollNo(marksDao.getRollNo());
       entity.setStudent(marksDao.getStudent());
       entity.setMobile(marksDao.getMobile());
       entity.setTelugu(marksDao.getTelugu());
       entity.setHindi(marksDao.getHindi());
       entity.setEnglish(marksDao.getEnglish());
       entity.setMaths(marksDao.getMaths());
       entity.setScience(marksDao.getScience());
       entity.setSocial(marksDao.getSocial());
        return  entity;

    }
}
