package MovieTicketBookingApplication;

import MovieTicketBookingApplication.enums.PaymentMode;
import MovieTicketBookingApplication.enums.SeatCategory;

import java.util.ArrayList;
import java.util.List;

public class BookMyShowApplication {
    private MovieController movieController;
    private TheatreController theatreController;

    public BookMyShowApplication(){
        movieController = new MovieController();
        theatreController = new TheatreController();
        initialize();
    }

    private void initialize(){
        createMovies();
        createTheatre();
    }

    private void createTheatre() {
        Theatre theatre1 = new Theatre();
        theatre1.setTheatreId(1);
        Address address = new Address("XYZ Stree","BANGALORE","Karnataka","560103");
        theatre1.setAddress(address);

        List<Screen> screenList = new ArrayList<>();
        screenList.add(createScreen());
        theatre1.setScreenList(screenList);

        Show show1 = createShow(1,10,movieController.getMovieByName("AVENGERS"),theatre1.getScreenList().get(0));
        Show show2 = createShow(2,16,movieController.getMovieByName("BAHUBALI"),theatre1.getScreenList().get(0));

        List<Show> showList = new ArrayList<>();
        showList.add(show1);
        showList.add(show2);
        theatre1.setShowList(showList);

        theatreController.addTheatre("BANGALORE",theatre1);
    }

    private void createMovies() {
        Movie movie1 = new Movie(1,"BAHUBALI",100);
        Movie movie2 = new Movie(2,"AVENGERS",100);

        movieController.addMovie(movie1,"DELHI");
        movieController.addMovie(movie1,"BANGALORE");
        movieController.addMovie(movie2,"DELHI");
        movieController.addMovie(movie2,"BANGALORE");

    }

    private Screen createScreen(){
        Screen screen = new Screen();
        screen.setScreenId(1);
        screen.setSeats(createSeats());
        return screen;
    }

    private List<Seat> createSeats() {

        List<Seat> seats = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setPrice(SeatCategory.SILVER.getPrice());
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }

        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setPrice(SeatCategory.GOLD.getPrice());
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setPrice(SeatCategory.PLATINUM.getPrice());
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }

        return seats;
    }

    private Show createShow(int showId,int showTime,Movie movie,Screen screen){
        return new Show(showId,showTime,movie,screen);
    }

    public void createBooking(String cityName,String movieName) {
        List<Movie> movies = movieController.getAllMoviesByCity(cityName);

        if (movies == null){
            System.out.println("There is no movie in ur area");
            return;
        }

        Movie interestedMovie = null;
        for (Movie movie: movies) {
            if (movie.getMovieName().equals(movieName)) {
                interestedMovie = movie;
            }
        }

        if (interestedMovie == null) {
            System.out.println("Currently no theater has this movie ur area");
            return;
        }

        List<Theatre> theatres = theatreController.getTheatreListByCityName(cityName);

        if (theatres == null) {
            System.out.println("There is no theatre in ur area");
            return;
        }

        //Choosing theatre 1

        List<Show> showList = theatres.get(0).getShowList();
        Show interestedShow = null;

        for (Show show: showList) {
            if (show.getMovie().getMovieName().equals(movieName)) {
                interestedShow = show;
            }
        }


        //select seat
        int seatNumber = 30;
        List<Integer> bookedSeats = interestedShow.getBookedSeatIds();
        if (!bookedSeats.contains(seatNumber)) {
            bookedSeats.add(seatNumber);
            Booking booking = new Booking();
            booking.setBookingId(1);
            List<Seat> myBookedSeats = new ArrayList<>();
            for(Seat screenSeat : interestedShow.getScreen().getSeats()) {
                if(screenSeat.getSeatId() == seatNumber) {
                    myBookedSeats.add(screenSeat);
                }
            }
            booking.setSelectedSeats(myBookedSeats);
            booking.setShow(interestedShow);
            booking.makePayment(new Cash(PaymentMode.CASH));

        } else {
            System.out.println("seat already booked, try again");
            return;
        }

        System.out.println("BOOKING SUCCESSFUL");

    }

}
