package com.boot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.boot.AirportsApplication;
import com.boot.model.Airports;
import com.fasterxml.jackson.databind.ObjectMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AirportsApplication.class)
@WebAppConfiguration
public class AirportsApplicationTests {
	
	@Autowired
	WebApplicationContext context;
	
	MockMvc mock ;
	
	
	@Before
	public void setContext(){
		mock =  MockMvcBuilders.webAppContextSetup(context).build();
		
	}
	

	@Test
	public void getAirports() throws Exception {
	  
		ObjectMapper mapper = new ObjectMapper();
		
		
	   MvcResult mockResult = mock.perform(MockMvcRequestBuilders.get("/airports")
	          
			     .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	   
	   int status = mockResult.getResponse().getStatus();
	   
	   assertEquals(200, status);
	   
	   String content = mockResult.getResponse().getContentAsString();
	   
	   Airports[] airports = mapper.readValue(content, Airports[].class);
	
	   assertTrue(airports.length > 0);
		
	
	}


}

