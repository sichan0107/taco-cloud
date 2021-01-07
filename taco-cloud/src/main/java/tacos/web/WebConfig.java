package tacos.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// WebConfig는 뷰에 요청을 전달하는 일만 하는 컨트롤러이다. (뷰 컨트롤러라고함)
// WebMvcConfigurer는 인터페이스이지만 정의된 모든 메서드의 기본적인 구현을 제공한다.
@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	//이 2줄짜리 코드로 HomeController를 대신할 수 있다.
	//HomeControllerTest에서 @WebMvcTest의 HomeController 참조만 삭제하면 테스트 클래스도 에러없이 컴파일 할 수 있다.
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}
}
