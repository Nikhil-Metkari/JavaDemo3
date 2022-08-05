package com.Service;

import com.Entity.DemoCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Serviceimp {

    @Autowired
    private CourseService crservice;


    public List<DemoCourse> getCourse() {
       return crservice.findAll();
    }

    public DemoCourse addCourse(DemoCourse co) {
        return crservice.save(co);
    }

    public DemoCourse updateCourse(DemoCourse c) {
        return crservice.save(c);
    }

    public void  deleteCourse(int c) {
        crservice.deleteById(c);
    }
}
