package oshcoding.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import oshcoding.com.entity.Movie;
import oshcoding.com.service.MovieService;

@CrossOrigin("*")
@RestController
@RequestMapping("/movies")
@Log4j2
public class MovieController {
	
	// private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
	
	@Autowired
    private MovieService movieService;
	
	@Value("${spring.datasource.url}")
	private String datasource;
	@GetMapping
	 public List<Movie> getAllMovies() {
		//log.info("Get All Movies");
	     // System.out.println(datasource);
//	        System.out.println("loading index page");
//	        logger.trace("loading index page logger");
//	       logger.error("FATAL ERROR");
//	       logger.warn("System error");
	        //return null;
	       return movieService.getAllMovie();
	    }

	
	 @GetMapping("/m")
	    public List<Movie> getMovies(@RequestParam(name = "title", required = false, defaultValue = "") String movieTitle,
	                                 @RequestParam(name = "year", required = false, defaultValue = "0") String movieYear,
	                                 @RequestParam(name = "genre", required = false, defaultValue = "") String movieGenre) {
	  System.out.println("title "+ movieTitle+ " year "+ movieYear+" genre "+movieGenre);
	  //System.out.println("body"+data);
	        return movieService.getMovieDetails(movieTitle, movieYear, movieGenre);
	        //return  null;
	    }

}
