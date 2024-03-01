package in.ashokit.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.ashokit.service.MsgService;

@WebMvcTest(controllers = MsgRestController.class)
public class MsgRestControllerTest {

	@MockBean
	private MsgService service;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void greetMsgTest() throws Exception {
		when(service.getWelcomeMsg()).thenReturn("DummyText");
		MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/welcome");
		MvcResult result = mockMvc.perform(req).andReturn();
		MockHttpServletResponse response = result.getResponse();
		int status = response.getStatus();
		assertEquals(200, status);
	}

	@Test
	public void welcomeMsgTest() throws Exception {
		when(service.getGreetMsg()).thenReturn("DummyText");
		MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/greet");
		MvcResult result1 = mockMvc.perform(req).andReturn();
		MockHttpServletResponse response = result1.getResponse();
		int status = response.getStatus();
		assertEquals(200, status);
	}

}
