package GUI;

import CONTROLLER.PlaceCONTROLLER;
import MODEL.Place;

public class Main {

    public static void main(String[] args) {

        PlaceCONTROLLER placeCONTROLLER = new PlaceCONTROLLER();
        Place place = new Place();

        place.setName("Ale");
        place.setDescription("Lorem Ipsum");

        Place newPlace = placeCONTROLLER.add(place);


        System.out.println(newPlace.getName());
        System.out.println(newPlace.getId());


    }

}
