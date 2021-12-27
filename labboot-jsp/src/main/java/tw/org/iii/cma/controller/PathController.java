package tw.org.iii.cma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PathController {
	@ModelAttribute
	public void xxxx(Model model) {
		model.addAttribute("demoData", "");
	}
	@GetMapping({"/", "/index.page"})
	public String method1() {
		
		return "/index";
	}
	@GetMapping("/secure/login.page")
	public String method2() {
		return "/secure/login";
	}
	@GetMapping("/pages/product.page")
	public String method3() {
		return "/pages/product";
	}
	@GetMapping("/pages/display.page")
	public String method4() {
		return "/pages/display";
	}
}
