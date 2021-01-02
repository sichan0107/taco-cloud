## taco-cloud <hr>

1. Spring Security 403 Forbidden 에러 처리
  - Security Starter를 의존성에 추가시키면, 자동으로 보안이 실행된다.
  - 이런 자동설정 역할을 하는 클래스가 SecurityAutoConfiguration 클래스.
  - 자동 설정을 끄고자 할 때는 @SpringBootApplication 애노테이션에 **SecurityAutoConfiguration를** 추가해준다.
  - **@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })**
  
