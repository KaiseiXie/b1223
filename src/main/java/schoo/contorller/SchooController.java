package schoo.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;
import schoo.entity.User;
import schoo.repository.UserRepository;

@RestController
public class SchooController {
  private final UserRepository repository;
  
	@Autowired
	public SchooController(UserRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/")
	public String index(@ModelAttribute User user) {
		return "input";
	}
	@PostMapping("info")
	public String info(@ModelAttribute User user,
			Model model) {
		model.addAttribute("userList",repository.findAll());
	   return "output";
	}
	
}
