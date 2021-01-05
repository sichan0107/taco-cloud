package tacos;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

@Data
public class Order {
	@NotBlank(message="이름을 입력해주세요.")
	private String deliveryName;

	@NotBlank(message="도로명을 입력해주세요.")
	private String deliveryStreet;
	
	@NotBlank(message="도시명을 입력해주세요.")
	private String deliveryCity;
	
	@CreditCardNumber(message="카드번호가 틀렸습니다.")
	private String ccNumber;
	
	@Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message="MM/YY 양식에 맞추어 주세요.")
	private String ccExpiration;
	
	@Digits(integer=3, fraction=0, message="")
	private String ccCVV;
}
