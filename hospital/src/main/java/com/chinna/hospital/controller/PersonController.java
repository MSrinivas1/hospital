package com.chinna.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinna.hospital.model.Person;

@Controller
@RequestMapping(value="/api/v1/")
public class PersonController {
	
	@ResponseBody
	@RequestMapping(value="savePerson", method=RequestMethod.POST )
	public Person savePerson(@RequestBody Person person){
		System.out.println(person);
		return person;
	}

}
