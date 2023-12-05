package com.phamvantoan.demomvc.controller;

import com.phamvantoan.demomvc.entity.student;
import com.phamvantoan.demomvc.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class studentController {
    private studentService StudentService;
    @Autowired
    public studentController(studentService studentService) {
        StudentService = studentService;
    }
    @GetMapping("/hocsinh")
    public String layTatCaSV(Model model){
        List<student> list = this.StudentService.findAll();
        model.addAttribute("listSV", list);
        return "student/lay-tat-ca-sv";
    }

    @GetMapping("/create")
    public String create(Model model){
        student Student = new student();
        model.addAttribute("student", Student);
        return "student/them-sv";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("student") student Student){
        this.StudentService.saveandflush(Student);
        return "redirect:/students/hocsinh";
    }

    @GetMapping("/update")
    public String update(Model model, @RequestParam("id") Integer id){
        student Student = this.StudentService.findByID(id);
        model.addAttribute("student", Student);
        return "student/them-sv";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id){
        this.StudentService.delete(id);
        return "redirect:/students/hocsinh";
    }
}
