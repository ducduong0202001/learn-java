package DB;
import java.sql.*;

public class ConnectDb {
    private static String DB_URL = "jdbc:mysql://localhost:3306/ducpvdb";
    private static String USER_NAME = "root";
    private static String PASSWORD = "12345678";
    private static Connection conn = null;
    public static void main(String args[]) {
        try {
            // connnect to database 'testdb'
            conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            // crate statement
//            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//            ResultSet rs = stmt.executeQuery("select name from student where name = 'duc3'");
//
//
//            // show data
//            while (rs.next()) {
//                if ( rs.getString("name") == "duc3"){
//                    rs.updateString("name","duc1996");
//                    rs.updateRow();
//                }
//
//                System.out.println(rs.getString("name"));
//            }
//            // close connection

            PreparedStatement  stmt= conn.prepareStatement("select name from student");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                System.out.println(rs.getString("name"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            try {
                if (conn !=null){
                    conn.close();
                }
            }catch (SQLException e){

            }
        }
    }


    /**
     * create connection
     *
     * @author viettuts.vn
     * @param dbURL: database's url
     * @param userName: username is used to login
     * @param password: password is used to login
     * @return connection
     */
    public static Connection getConnection(String dbURL, String userName,
                                           String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
