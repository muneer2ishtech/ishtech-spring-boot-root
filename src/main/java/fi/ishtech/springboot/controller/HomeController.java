package fi.ishtech.springboot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;

/**
 * Controller for root level APIs
 */
@RestController
@Slf4j
public class HomeController {

	/**
	 * Root URL
	 *
	 * @return {@link String} body
	 */
	@Operation(summary = "Home", description = "Root URL for welcome page")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK",
					content = @Content(mediaType = MediaType.TEXT_PLAIN_VALUE)) })
	@GetMapping("/")
	public String index() {
		log.trace("In web root");
		return "Welcome to Ishtech Spring-Boot root";
	}

}
