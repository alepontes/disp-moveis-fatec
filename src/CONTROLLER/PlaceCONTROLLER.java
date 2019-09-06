package CONTROLLER;

import DAO.PlaceDAO;
import MODEL.Place;

public class PlaceCONTROLLER {


    /** Lista lugar por ID
     * @param idPlace id do lugar
     * @return Place
     * */
    public Place getById(String idPlace){

        PlaceDAO placeDAO = new PlaceDAO();
        return placeDAO.getById(idPlace);

    }


    /** Lista lugares
     * @return Place[]
     * */
    public Place[] list(){

        PlaceDAO placeDAO = new PlaceDAO();
        return placeDAO.list();
    }


    /** Adicionar lugar
     * @param place Objeto Place
     * @return Place
     * */
    public Place add(Place place){
        return new PlaceDAO().add(place);
    }


    /** Adicionar lugar
     * @param place Objeto Place
     * @return Place
     * */
    public Place[] add(Place place[]){

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
    public Place updade(Place place){
        return new PlaceDAO().updade(place);
    }


    /** Remove lugar
     * @param place Objeto Place
     * @return true|false
     * */
    public boolean remove(Place place){
        return new PlaceDAO().remove(place);
    }


    /** Remove lugar
     * @param idPlace ID do lugar
     * @return true|false
     * */
    public boolean remove(String idPlace){
        PlaceDAO placeDAO = new PlaceDAO();
        Place place = placeDAO.getById(idPlace);
        return placeDAO.remove(place);
    }


}
