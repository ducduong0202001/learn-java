package com.demospring.demo.Controller;

import com.demospring.demo.Dto.StudenDto;
import com.demospring.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudenController {
    @Autowired
    private StudentService service;

    public void findById(int id) {
       StudenDto sdtDto = service.findById(id);
        System.out.println(sdtDto.getAddress());
    }
}
