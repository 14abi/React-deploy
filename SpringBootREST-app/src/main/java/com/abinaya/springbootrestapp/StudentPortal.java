package com.abinaya.springbootrestapp;

@SuppressWarnings("ALL")

public class StudentPortal {
    private String id;
    private String studentName;
    private String studentMarks;

    public StudentPortal(String id, String studentName, String studentMarks) {
        this.id = id;
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(String studentMarks) {
        this.studentMarks = studentMarks;
    }
}