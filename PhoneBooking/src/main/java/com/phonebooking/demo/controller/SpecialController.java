package com.phonebooking.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.phonebooking.demo.service.SpecialService;

@RestController
public class SpecialController {
	
	@Autowired
	
	SpecialService ss;

}
