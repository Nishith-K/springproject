package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springboot.model.Movie;
import springboot.service.MovieService;


@Controller
public class MovieController {	
	
	@Autowired
	MovieService mService;
	
	/*public Movie movie;
	List<Movie> mlist = new ArrayList<>();*/

	@RequestMapping(value = "/movie")
	public String getMovie(@ModelAttribute("movie") Movie movie) {
		return "movie";
	}

	@RequestMapping(value = "/getMovie")
	public String getMovieList(@ModelAttribute("movie") Movie mt, Model model) {
		
		Movie theMovie = mService.getMovieName(mt);
		model.addAttribute("movie",theMovie);

		return "result";
	}
	
}
