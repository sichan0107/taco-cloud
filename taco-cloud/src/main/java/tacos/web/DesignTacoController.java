package tacos.web;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import tacos.Ingredient;
import tacos.Ingredient.Type;
import tacos.Taco;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {
	@GetMapping
	public String showDesignForm(Model model) {
		List<Ingredient> ingredients = Arrays.asList(
				new Ingredient("FLTO", "밀가루 또띠아", Type.WRAP),
				new Ingredient("COTO", "옥수수 또띠아", Type.WRAP),
				new Ingredient("GRBF", "소고기", Type.PROTEIN),
				new Ingredient("TOBU", "두부", Type.PROTEIN),
				new Ingredient("TMTO", "토마토", Type.VEGGIES),
				new Ingredient("LETC", "양상추", Type.VEGGIES),
				new Ingredient("CHED", "체다치즈", Type.CHEESE),
				new Ingredient("MZRL", "모짜렐라 치즈", Type.CHEESE),				
				new Ingredient("SLSA", "살사소스", Type.SAUCE),
				new Ingredient("SRCR", "사워크림", Type.SAUCE)
				);
		
		/*
		 * 식자재의 유형을 List에서 필터링한 다음 Model 속성에 추가
		 */
		Type[] types = Ingredient.Type.values();
		for(Type type : types) {
			model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
		}
		model.addAttribute("taco", new Taco());
		return "design";
	}
	private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type){
		return ingredients
				.stream()
				.filter(x -> x.getType().equals(type))
				.collect(Collectors.toList());
	}
	
	@PostMapping
	public String processDesign(Taco design) {
		log.info("Processing design : " + design);
		return "redirect:/orders/current";
	}
	
	
	
}
