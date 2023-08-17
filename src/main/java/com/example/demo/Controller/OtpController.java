package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class OtpController {


@GetMapping("/getStudent")
    public List<String> getStudent(){

    List<String> list= new ArrayList<>();
    list.add("siva");
    list.add("mukesh");
    list.add("manoj");
    list.add("vijay");

        return list;
    }

}
