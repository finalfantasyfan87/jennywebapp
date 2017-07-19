package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	String story = "The story starts with a young and starry-eyed Noctis and friends: Gladio, Prompto and Ignis. \n"
			+ "Noctis is sent on a journey to meet with his bride, Luna. They are to wed. However many events occur that change \n"
			+ "the fate of Noctis and friends. These events eventually shape Prince Noctis into King Noctis, but not before \n "
			+ "breaking his heart and revealing his true destiny. A destiny that will change the world.";

	@RequestMapping("/home")
	public ModelAndView startHomePageController() {
		System.out.println("Printing in controller:" + this.getClass().getSimpleName());
		ModelAndView homePageModelView = new ModelAndView("homePage");
		homePageModelView.addObject("storyMessage", story);
		return homePageModelView;
	}

}
