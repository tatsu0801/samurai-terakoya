package com.example.samuraitravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tsuika")
public class TsuikaController {
	
	 @GetMapping
     public String showTsuikaPage() {
         return "tsuika";
     }   
}