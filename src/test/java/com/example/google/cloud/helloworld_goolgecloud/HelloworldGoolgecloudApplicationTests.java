package com.example.google.cloud.helloworld_goolgecloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class HelloworldGoolgecloudApplicationTests {

	@Autowired
	private TestRestTemplate template;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testRequest() throws Exception {
		ResponseEntity<String> responseEntity = template.getForEntity("/_ah/health", String.class);
		assertTrue(responseEntity.toString().contains("surviving"));
	}
}
