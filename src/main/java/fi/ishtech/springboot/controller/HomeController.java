package fi.ishtech.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 *
 */
@RestController
@Slf4j
public class HomeController {

	@GetMapping("/")
	public String index() {
		log.trace("In web root");
		return "Welcome to Ishtech Spring-Boot root";
	}

}
