package example.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;

@Controller
public class RedisController
{

  private AtomicInteger counter = new AtomicInteger();

	@GetMapping("/redis")
	public String getCreate(Model model)
	{
    int click = getCount();
		model.addAttribute("click", click);
		return "redis";
	}

  @PostMapping("/redis")
  public String postCreate(Model model)
	{
    counter.incrementAndGet();
    int click = getCount();
		model.addAttribute("click", click);
		return "redis";
	}

  private int getCount(){
    return counter.get();
  }

}
