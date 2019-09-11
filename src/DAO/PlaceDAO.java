package DAO;

import MODEL.Place;

import java.sql.*;
import java.util.ArrayList;

public class PlaceDAO {

    private final Connection connection;

    public PlaceDAO() throws SQLException, ClassNotFoundException, SQLException {
        this.connection = new DAO().getConnection();
    }

    public Place getById(String idPlace) throws SQLException {

        String sql = "select * from place WHERE id = ?";
        PreparedStatement stmt = this.connection.prepareStatement(sql);

        stmt.setInt(1, Integer.parseInt(idPlace));
        ResultSet rs = stmt.executeQuery();

        Place place = new Place();
        while (rs.next()) {
            place.setId(String.valueOf(rs.getInt(1)));
            place.setName(rs.getString(2));
            place.setDescription(rs.getString(3));
        }

        stmt.close();

        return place;
    }

    public ArrayList<Place> list() throws SQLException {

        ArrayList<Place> places = new ArrayList<Place>();
        Place place = new Place();

        String sql = "select * from place";
        PreparedStatement stmt = this.connection.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            place.setId(String.valueOf(rs.getInt(1)));
            place.setName(rs.getString(2));
            place.setDescription(rs.getString(3));

            places.add(place);
        }

        rs.close();
        stmt.close();

        return places;

    }

    public Place add(Place place) throws SQLException {

        String sql = "insert into place" + " (name, description)" + " values (?,?)";

        PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, place.getName());
        stmt.setString(2, place.getDescription());

        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();

        if (rs.next()) {
            String id = String.valueOf(rs.getInt(1));
            place.setId(id);
        }

        stmt.close();
        return place;

    }

    public boolean remove(int idPlace) {

        String sql = "delete from place where id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, idPlace);
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            return false;
            // e.printStackTrace();
        }

        return true;
    }


    public Place updade(Place place) {

        String sql = "update place SET name = ?, description = ? WHERE id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, place.getName());
            stmt.setString(2, place.getDescription());
            stmt.setInt(3, Integer.parseInt(place.getId()));

            stmt.execute();
            stmt.close();

            return place;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
