package com.example.book_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/detail")
public class DetailController {
	
	 @GetMapping
     public String showDetailPage() {
         return "detail";
     }   
}
