package com.Service;


import com.Entity.DemoCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseService extends JpaRepository<DemoCourse,Integer> {

}
