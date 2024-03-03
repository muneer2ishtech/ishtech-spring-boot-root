package fi.ishtech.springboot.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

/**
 *
 * @author Muneer Ahmed Syed
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class HomeControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	void testHome() throws Exception {
		// @formatter:off
		mvc.perform(get("/")
 				.contentType(MediaType.TEXT_PLAIN))
				.andExpect(status().isOk())
				.andExpect(content().string("Intro to Java"));
		// @formatter:on
	}

}
