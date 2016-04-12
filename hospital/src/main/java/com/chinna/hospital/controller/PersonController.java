package com.chinna.hospital.controller;

import javax.ws.rs.Produces;

import org.springframework.http.MediaType;
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
	@RequestMapping(value="savePerson", method = RequestMethod.POST, consumes = {"application/json;charset=UTF-8"}, produces={"application/json;charset=UTF-8"})
	public Person savePerson(@RequestBody final Person person){
		System.out.println(person);
		return person;
	}

}
