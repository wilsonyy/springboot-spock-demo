package com.wilson.demo.spock;

import com.wilson.demo.spock.test.LambdaTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	@Autowired
	private LambdaTest lambdaTest;

	@Test
	void contextLoads() {
		String text = lambdaTest.findByName("a");
		System.err.println(text);
	}

}
