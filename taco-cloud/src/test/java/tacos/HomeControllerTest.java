package tacos;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

//스프링 MVC 형태로 테스트가 진행되도록 도와주는 어노테이션
@WebMvcTest(HomeController.class)
class HomeControllerTest {
	@Autowired
	private MockMvc mockMvc; //서버 실행대신 모의 테스트를 하기위한 주입
	
	@Test
	public void testHomePage() throws Exception{
		mockMvc.perform(get("/"))  // 루트 경로인 "/"에 get요청을 Mock객체로 수행
				.andExpect(status().isOk()) // 응답은 반드시 HTTP 200
				.andExpect(view().name("home")) //뷰의 이름은 home
				.andExpect(content().string(containsString("Taco Cloud"))); //브라우저의 뷰에는 반드시  다음 텍스트 포함
		
	}
	
}
