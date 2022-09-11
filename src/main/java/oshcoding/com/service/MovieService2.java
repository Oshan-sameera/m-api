//package oshcoding.com.service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import oshcoding.com.entity.Movie;
//import oshcoding.com.exception.MovieNotFoundException;
//import oshcoding.com.jsonFileReader.MainDataClass;
//
//@Service
//public class MovieService2 {
//
//	@Autowired
//	private MainDataClass mainDataClass;
//
//	public List<Movie> getMovieDetails(String movieTitle, String movieYear, String movieGenre) {
////       int parsInt = Integer.parseInt(movieYear.trim());
//		List<Movie> movieList = mainDataClass.getAllMovies();
//		String inputTitleConvert = movieTitle.trim().toLowerCase();
//		int year = Integer.parseInt(movieYear.trim());
//		List<Movie> newMovies = movieList.stream()
////				.filter(movie -> movie.getTitle().toLowerCase().contains(inputTitleConvert.trim()))
//				.filter(movie -> movie.getTitle().toLowerCase().contains(inputTitleConvert.trim()))
//				.filter(movie -> movie.getYear() == year).collect(Collectors.toList());
//		// System.out.println(newMovies);
//		System.out.println(movieGenre);
//		return newMovies;
//	}
//	
//	
//	 public List<Movie> getAllMovie() {
//
//		 List<Movie>   movieList = mainDataClass.getAllMovies();
//
//	        List<Movie> newMoviesList = new ArrayList<>();
//	        for (Movie s : movieList) {
//	            newMoviesList.add(s);
//	        }
//	        if (newMoviesList.isEmpty()) {
//	            throw new MovieNotFoundException("Requested movie is not exist");
//
//	        }
//
//	        return newMoviesList;
//	    }
//
//}
