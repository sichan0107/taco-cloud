## taco-cloud

1. Spring Security 403 Forbidden 에러 처리
  - Security Starter를 의존성에 추가시키면, 자동으로 보안이 실행된다.
  - 이런 자동설정 역할을 하는 클래스가 SecurityAutoConfiguration 클래스.
  - 자동 설정을 끄고자 할 때는 @SpringBootApplication 애노테이션에 **SecurityAutoConfiguration를** 추가해준다.
  - **@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })**
  
2-1. 폼 유효성 검사 방법(DTO 클래스)
  - 스프링이 제공하는 자바 빈 유효성 검사 (javax.validation.constraints)
    - @NotNull : 속성 값이 없거나 null인지 확인. 최소 하나 이상의 입력 여부를 확인할 때
    - @Size(min, message) : 입력 값의 글자 길이
    - @NotBlank : 빈칸 확인
  - Hibernate Validator
    - @CreditCardNumber : 신용카드 번호 검사 (Luhn 알고리즘 적용을 받음)
  - 그 외
    - @Pattern(regexp, message) : 정규표현식을 이용한 검사
    - @Digits(integer, fraction, message) : 입력 값이 지정한 integer만큼의 자리수 인지 확인
    
2-2. 유효성 검사 에러 보여주기 (Thymeleaf)
  - fields와 th:errors 속성으로 Errors 객체를 편리하게 받아 쓸 수 있다.
  - <span> 요소를 템플릿에 이렇게 추가한다.
    - span class="validationError" th:if="${#fields.hasErrors('ccNumber')}" th:errors="*{ccNumber}"
