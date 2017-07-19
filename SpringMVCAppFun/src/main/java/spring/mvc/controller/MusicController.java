package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MusicController {
	
	@RequestMapping("/music")
	public ModelAndView startMusicController() {
		System.out.println("Printing in controller:" + this.getClass().getSimpleName());
		ModelAndView musicPageModelView = new ModelAndView("musicPage");
		musicPageModelView.addObject("message", "Final Fantasy Music Rocks!");
		return musicPageModelView;
	}

}
