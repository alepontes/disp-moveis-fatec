package GUI;

import CONTROLLER.PlaceCONTROLLER;
import MODEL.Place;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

    public static void add() throws SQLException, ClassNotFoundException {
        PlaceCONTROLLER placeCONTROLLER = new PlaceCONTROLLER();
        Place place = new Place();

        place.setName("Ale");
        place.setDescription("Lorem Ipsum");

        Place newPlace = placeCONTROLLER.add(place);


        System.out.println(newPlace.getName());
        System.out.println(newPlace.getId());
    }

    public static void getByid() throws SQLException, ClassNotFoundException {

        PlaceCONTROLLER placeCONTROLLER = new PlaceCONTROLLER();
        Place place = new Place();

        place = placeCONTROLLER.getById("1");

        System.out.println(place.toString());

    }

    public static void delete() throws SQLException, ClassNotFoundException {

        PlaceCONTROLLER placeCONTROLLER = new PlaceCONTROLLER();

        boolean rmPlace = placeCONTROLLER.remove(2);

        System.out.println(rmPlace ? "Corretamente Removido" : "Erro ao remover");

    }

    public static void list() throws SQLException, ClassNotFoundException {

        PlaceCONTROLLER placeCONTROLLER = new PlaceCONTROLLER();
        Place place = new Place();

        ArrayList<Place> places = placeCONTROLLER.list();

        places.forEach(item -> {
            System.out.println(item.toString());
        });


    }

    public static void update() throws SQLException, ClassNotFoundException {

        PlaceCONTROLLER placeCONTROLLER = new PlaceCONTROLLER();
        Place place = new Place();

        place.setId("1");
        place.setName("Batman Alter");
        place.setDescription("sadfsfsdfsadfasdfsdf");


        placeCONTROLLER.updade(place);

    }



    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        update();

    }

}
