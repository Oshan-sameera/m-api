//package oshcoding.com.entity;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.stereotype.Component;
//
//@Component
//@PropertySource(value = "classpath:movies.json")
//@ConfigurationProperties
//public class JsonProperties {
//
//	 private String title;
//	    private int year;
//	    private String[] cast;
//	    private String[] genres;
//	    
//	    
//
//		public String getTitle() {
//			return title;
//		}
//		public void setTitle(String title) {
//			this.title = title;
//		}
//		public int getYear() {
//			return year;
//		}
//		public void setYear(int year) {
//			this.year = year;
//		}
//		public String[] getCast() {
//			return cast;
//		}
//		public void setCast(String[] cast) {
//			this.cast = cast;
//		}
//		public String[] getGenres() {
//						return genres;
//		}
//		public void setGenres(String[] genres) {
//			this.genres = genres;
//		}
//		
//		
//		 public String getGenreString() {
//		        return String.join(" ", this.genres).toLowerCase();
//		    }
//	
//}
