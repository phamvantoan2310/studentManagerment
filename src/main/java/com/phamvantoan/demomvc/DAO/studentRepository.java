package com.phamvantoan.demomvc.DAO;

import com.phamvantoan.demomvc.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<student, Integer> {
}
