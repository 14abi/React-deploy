package com.abinaya.springbootrestapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins="http://localhost:3001/")
@SuppressWarnings("ALL")
@RestController
public class StudentPortalController {
    @Autowired
    private StudentPortalService studentPortalService;
    @RequestMapping("/allstudent")
    public List<StudentPortal> getAllStudentPortal()
    {
       return studentPortalService.getAllStudentPortal();
    }
    @RequestMapping("/allstudent/id")
    public StudentPortal getStudentPortal(@PathVariable String id)
    {
        return studentPortalService.getStudentPortal(id);
    }
    }
