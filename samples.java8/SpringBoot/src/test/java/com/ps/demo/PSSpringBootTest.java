package com.ps.demo;

import static org.junit.Assert.assertTrue;

import org.SpringBoot.tomcat.service.HelloWorldService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PSSpringBootTest {

	@Autowired
	private HelloWorldService helloWorldService;
	
	@Test
	public void contextLoads() {
		assertTrue(null != helloWorldService);
	}

}


