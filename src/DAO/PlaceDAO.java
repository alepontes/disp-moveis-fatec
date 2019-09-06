package DAO;

import MODEL.Place;

public class PlaceDAO {


    public Place getById(String idPlace){
        return new Place();
    }

    public Place[] list(){
        return new Place[0];
    }

    public Place add(Place place){
        return new Place();
    }

    public boolean remove(Place place){
        return true;
    }

    public Place updade(Place place){
        return new Place();
    }

}
