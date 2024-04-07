package MovieTicketBookingApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {

    private Map<String, List<Movie>> cityVsMovies;
    private List<Movie> movieList;

    MovieController() {
        cityVsMovies = new HashMap<>();
        movieList = new ArrayList<>();
    }

    public Map<String, List<Movie>> getCityVsMovies() {
        return cityVsMovies;
    }

    public void setCityVsMovies(Map<String, List<Movie>> cityVsMovies) {
        this.cityVsMovies = cityVsMovies;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public void addMovie(Movie movie,String cityName) {
        movieList.add(movie);
        if (cityVsMovies.get(cityName) == null) {
            List<Movie> currentMovieList = new ArrayList<>();
            currentMovieList.add(movie);
            cityVsMovies.put(cityName,currentMovieList);
        }
        else {
            List<Movie> movies = cityVsMovies.get(cityName);
            movies.add(movie);
            cityVsMovies.put(cityName,movies);
        }
    }

    public Movie getMovieByName(String movieName){
        for (Movie movie:movieList){
            if (movie.getMovieName().equals(movieName)) {
                return movie;
            }
        }
        return null;
    }

    public List<Movie> getAllMoviesByCity(String cityName){
        return cityVsMovies.get(cityName);
    }
}
