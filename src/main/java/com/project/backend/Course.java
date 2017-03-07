package com.project.backend;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * Created by Jili on 2017-03-01
 * Temporary Course class for creating Course objects for "Go to class" function test
 */

public class Course implements Comparable<Course>{

    private String courseName;
    private String courseCode;
    private byte courseSection;
    private List<Student> studentRoster;
    private List<ClassDay> classDays;

    public Course(String courseName, String courseCode, String courseSection) {
        this(courseName, courseCode, courseSection, null);
    }

    public Course(String courseName, String courseCode, String courseSection, List<String> classInfo) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseSection = Byte.parseByte(courseSection);

        //create a test studentRoster
        studentRoster = new ArrayList<>();
        studentRoster.add(new Student("B00123456", "TestFN1", "TestLN1"));
        studentRoster.add(new Student("B00987654", "TestFN2", "TestLN2"));

        /** TODO:   parse classInfo to construct the ClassDay object (create Dates)
         * */
    }
    
    public String getCourseName(){
    	return courseName;
    }
    
    public List<Student> getStudentRoster(){
    	return studentRoster;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public byte getCourseSection() {
        return courseSection;
    }

    @Override
    public String toString() {
        return "RegisteredUser{courseName=" + courseName + '}';
    }

    @Override
    public int compareTo(Course c) {
        if(courseCode.equals(c.getCourseCode())) {
            Byte b = courseSection;
            return b.compareTo(c.getCourseSection());
        }
        return courseCode.compareTo(c.getCourseCode());
    }
}

