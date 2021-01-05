package tacos;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {
	@NotNull
	@Size(min=5, message="이름을 5글자 이상 입력해주세요.")
	private String name;
	
	@Size(min=1, message="하나 이상의 재료를 선택해주세요!!")
	private List<String> ingredients;
}
