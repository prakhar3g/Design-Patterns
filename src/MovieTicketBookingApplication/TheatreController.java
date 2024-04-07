package MovieTicketBookingApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {

    private Map<String, List<Theatre>> cityVsTheatre;
    private List<Theatre> theatreList;

    TheatreController(){
        cityVsTheatre = new HashMap<>();
        theatreList = new ArrayList<>();
    }

    public void addTheatre(String cityName,Theatre theatre){
        theatreList.add(theatre);

        if (cityVsTheatre.get(cityName) == null) {
            List<Theatre> currentTheatre = new ArrayList<>();
            currentTheatre.add(theatre);
            cityVsTheatre.put(cityName,currentTheatre);
        }else {
            List<Theatre> currentTheatre = cityVsTheatre.get(cityName);
            currentTheatre.add(theatre);
            cityVsTheatre.put(cityName,currentTheatre);
        }
    }

    public List<Theatre> getTheatreListByCityName(String cityName) {
        return cityVsTheatre.get(cityName);
    }


}
