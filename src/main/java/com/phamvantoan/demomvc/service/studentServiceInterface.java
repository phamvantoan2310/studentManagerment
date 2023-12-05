package com.phamvantoan.demomvc.service;

import com.phamvantoan.demomvc.entity.student;

import java.util.List;

public interface studentServiceInterface {
    public List<student> findAll();
    public student findByID(int id);
    public student save(student s);
    public student saveandflush(student s);
    public void delete(int id);
}
