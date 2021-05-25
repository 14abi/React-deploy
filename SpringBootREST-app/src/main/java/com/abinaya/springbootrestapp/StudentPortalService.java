package com.abinaya.springbootrestapp;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@SuppressWarnings("ALL")
@Service
public class StudentPortalService {
    List<StudentPortal> studentPortalList= new ArrayList<StudentPortal>(Arrays.asList(
            new StudentPortal("1", "abinaya", "100"),
            new StudentPortal("2", "aarthika", "90"),
            new StudentPortal("3", "Rishi", "90")

    ));

    public List<StudentPortal> getAllStudentPortal() {
        return studentPortalList;
    }
    public StudentPortal getStudentPortal(String id)
    {
        return studentPortalList.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }
}

