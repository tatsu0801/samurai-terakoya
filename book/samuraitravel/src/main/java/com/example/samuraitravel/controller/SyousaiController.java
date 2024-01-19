package com.example.samuraitravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/syousai")
public class SyousaiController {
	
	 @GetMapping
     public String showSyousaiPage() {
         return "syousai";
     }   
}
