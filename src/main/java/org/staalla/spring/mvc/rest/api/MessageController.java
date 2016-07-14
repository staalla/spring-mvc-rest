package org.staalla.spring.mvc.rest.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {

	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public Message hello() {
		Message m = new Message("Spring MVC Rest API Sample");;
		return m;
	}

}
