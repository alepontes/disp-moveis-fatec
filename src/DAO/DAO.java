package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DATABASE = "placelist";
    private final String USER = "ale";
    private final String PASSWORD = "";


    public Connection getConnection() throws SQLException {

        String URL = "jdbc:mysql://HOST:PORT/DATABASE"
                .replace("HOST", HOST)
                .replace("PORT", PORT)
                .replace("DATABASE", DATABASE);

        try {
            // Class.forName("com.mysql.jdbc.Driver"); Obsoleto
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Erro na Conexão SQLException");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e){
            System.out.println("Erro na Classe");
            System.out.println(e.getCause());
            throw new RuntimeException(e);
        }
    }
}



/* NOTAS DA CLASSE DE CONEXÃO
*
* NECESSARIO FAZER O DOWNLOAD DA LIB NO SITE OFICIAL DO MYSQL
* IMPORTAR A LIB (JAR) PARA AS DEPENDENCIAS DO PROJETO
* ATUALIZAR CLASSENO CODIGO, A CLASSE ATUAL ESTA OBSOLETA
* */