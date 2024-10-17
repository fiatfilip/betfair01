package ro.siit.innerAnnonymous;

import java.util.ArrayList;
import java.util.List;

public class Building {
    class Apartment{
        public String getInhabitant(int index){
            return inhabitants.get(index);
        }
    }

    private List<String> inhabitants = new ArrayList<>();

    private List<Apartment> apartmentList = new ArrayList<>();
    public void addApartment(Apartment apartment){
        apartmentList.add(apartment);
    }
}
