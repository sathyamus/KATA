package com.sm.abhyas;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sm.abhyas.controller.SchoolController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AbhyasApplicationTests {

	@Autowired
	private SchoolController schoolController;
	
	@Test
	public void contextLoads() {
		assertThat(schoolController).isNotNull();
	}

}
