package com.phamvantoan.demomvc.service;

import com.phamvantoan.demomvc.DAO.studentRepository;
import com.phamvantoan.demomvc.entity.student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class studentService implements studentServiceInterface{
    private studentRepository repository;
    @Autowired
    public studentService(studentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<student> findAll() {
        return this.repository.findAll();
    }

    @Override
    public student findByID(int id) {
        return this.repository.getById(id);
    }

    @Override
    @Transactional
    public student save(student s) {
        return this.repository.save(s);
    }

    @Override
    @Transactional
    public student saveandflush(student s) {
        return this.repository.saveAndFlush(s);
    }

    @Override
    @Transactional
    public void delete(int id) {
        this.repository.deleteById(id);
    }
}
