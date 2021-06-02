package example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;

@Controller
public class DefaultController
{

  static int click = 0;

	@GetMapping("/")
	public String getCreate(Model model)
	{
		model.addAttribute("click", click);
		return "index";
	}

  @PostMapping("/")
  public String postCreate(Model model)
	{
    click++;
		model.addAttribute("click", click);
		return "index";
	}

}
