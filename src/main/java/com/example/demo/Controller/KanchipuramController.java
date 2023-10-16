package com.example.demo.Controller;

import com.example.demo.model.KanchipuramModel;
import com.example.demo.service.KanchipuramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class KanchipuramController {

@Autowired
KanchipuramService kanchipuramService;

    @GetMapping("/iskonSb")
    public KanchipuramModel getHtml(@RequestParam String path){

        return  kanchipuramService.getHtmlResponse(path);
    }
}
