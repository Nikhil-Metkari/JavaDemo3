package com.Controller;

import com.Entity.DemoCourse;
import com.Service.Serviceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Serviceimp service;

@GetMapping("/Democourse/all")
    public List<DemoCourse> getCourse()
    {
        return service.getCourse();
    }

@PostMapping("/Democourse/add")
    public DemoCourse addCourse(@RequestBody DemoCourse co)
    {
        return service.addCourse(co);
    }
@PutMapping("/Democourse/update")
public DemoCourse updateCourse(@RequestBody DemoCourse c)
{
    return service.updateCourse(c);
}



}
