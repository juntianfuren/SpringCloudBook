package com.jtfr.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GetJtfrTest {

	@Autowired
	private GetJtfr getJtfr;

	@Test
	public void getName() {
		System.out.println(getJtfr.getName());
	}

	@Test
	public void getAge() {
		System.out.println(getJtfr.getAge());
	}

}
