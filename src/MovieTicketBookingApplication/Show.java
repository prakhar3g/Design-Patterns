package MovieTicketBookingApplication;

import java.util.ArrayList;
import java.util.List;

public class Show {

    private int showId;
    private int showTime;
    private Movie movie;
    private Screen screen;
    private List<Integer> bookedSeatIds;

    public Show(int showId, int showTime, Movie movie, Screen screen) {
        this.showId = showId;
        this.showTime = showTime;
        this.movie = movie;
        this.screen = screen;
        bookedSeatIds = new ArrayList<>();
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public int getShowTime() {
        return showTime;
    }

    public void setShowTime(int showTime) {
        this.showTime = showTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public List<Integer> getBookedSeatIds() {
        return bookedSeatIds;
    }

    public void setBookedSeatIds(List<Integer> bookedSeatIds) {
        this.bookedSeatIds = bookedSeatIds;
    }
}
