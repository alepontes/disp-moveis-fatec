package CONTROLLER;

import DAO.PlaceDAO;
import MODEL.Place;

import java.sql.SQLException;
import java.util.ArrayList;

public class PlaceCONTROLLER {

    /* TODO: Tratar erros no controller */
    /* TODO: Usasr a mesma instancia de DAO para toda conexão */

    /** Lista lugar por ID
     * @param idPlace id do lugar
     * @return Place
     * */
    public Place getById(String idPlace) throws SQLException {

        Place place;

        PlaceDAO placeDAO = null;
        try {
            placeDAO = new PlaceDAO();
        } catch (SQLException e) {
            System.out.println("SQLException");
            //e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }

        place =  placeDAO.getById(idPlace);


        return place;
    }


    /** Lista lugares
     * @return Place[]
     * */
    public ArrayList<Place> list() throws SQLException, ClassNotFoundException {
        return new PlaceDAO().list();
    }


    /** Adicionar lugar
     * @param place Objeto Place
     * @return Place
     * */
    public Place add(Place place) throws SQLException, ClassNotFoundException {
        return new PlaceDAO().add(place);
    }


    /** Adicionar lugar
     * @param place Objeto Place
     * @return Place
     * */
    public Place[] add(Place place[]) throws SQLException, ClassNotFoundException {

        PlaceDAO placeDAO = new PlaceDAO();


        Place places[] = new Place[place.length];

        for (int i = 0; i < place.length; i++)
            places[i] = placeDAO.add(place[i]);

        return places;
    }


    /** Editar lugar
     * @param place Objeto Place
     * @return Place
     * */
    public Place updade(Place place) throws SQLException, ClassNotFoundException {
        return new PlaceDAO().updade(place);
    }


    /** Remove lugar
     * @param place Objeto Place
     * @return true|false
     * @deprecated
     * */
    public boolean DEPRECATED_remove(Place place) throws SQLException, ClassNotFoundException {
        /* FIXME: Consertar esse metodo*/
        return false;
    }


    /** Remove lugar
     * @param idPlace ID do lugar
     * @return true|false
     * */
    public boolean remove(int idPlace) throws SQLException, ClassNotFoundException {
        return new PlaceDAO().remove(idPlace);
    }


}
