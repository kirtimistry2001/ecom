package ca.kirti.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ToDoController {
	
	@GetMapping("/page/splash")
	public void getSplash() {
		
	}

}
