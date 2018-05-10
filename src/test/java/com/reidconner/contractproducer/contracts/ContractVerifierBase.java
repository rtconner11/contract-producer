package com.reidconner.contractproducer.contracts;

import com.reidconner.contractproducer.ContractproducerApplication;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ContractproducerApplication.class)
public class ContractVerifierBase {

	@Autowired
	private WebApplicationContext context;

	@Before
	public void setUp() throws Exception {
		RestAssuredMockMvc.webAppContextSetup(context);
	}

}
