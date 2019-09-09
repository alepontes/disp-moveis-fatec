package DAO;

import MODEL.Place;

import java.sql.*;

public class PlaceDAO {

    private final Connection c;

    public PlaceDAO() throws SQLException, ClassNotFoundException, SQLException {
        this.c = new DAO().getConnection();
    }


    public Place getById(String idPlace){
        return new Place();
    }

    public Place[] list(){
        return new Place[0];
    }

    public Place add(Place place) throws SQLException {

        String sql = "insert into place" + " (name, description)" + " values (?,?)";

        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setString(2, place.getName());
        stmt.setString(3, place.getDescription());

        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            String id = String.valueOf(rs.getInt(1));
            place.setId(id);
        }

        stmt.close();
        return place;

    }

    public boolean remove(Place place){
        return true;
    }

    public Place updade(Place place){
        return new Place();
    }

}
