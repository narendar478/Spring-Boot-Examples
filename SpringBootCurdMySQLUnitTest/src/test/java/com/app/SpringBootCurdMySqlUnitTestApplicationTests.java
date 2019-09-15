package com.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@TestPropertySource(
  locations = "classpath:application-test.properties")
public class SpringBootCurdMySqlUnitTestApplicationTests {

	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testProductSave() throws Exception {
		MvcResult result=mockMvc.perform(post("/product/register")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"prodCode\":\"ABCD\",\"prodCost\":88.55,\"vendorCode\": \"V11\"}")
				).andReturn();
		MockHttpServletResponse resp=result.getResponse();
		assertEquals(HttpStatus.OK.value(), resp.getStatus());
		System.out.println(resp.getContentAsString());
		assertNotNull(resp.getContentAsString());

	}
	@Test
	public void testProductGet() throws Exception {
		MvcResult result=mockMvc.perform(get("/product/get/1")).andReturn();
		MockHttpServletResponse resp=result.getResponse();
		assertEquals(HttpStatus.OK.value(), resp.getStatus());
		assertNotNull(resp.getContentAsString());

	}
}









