import java.sql.*;

public class JDBC {

    /*
        type             jdbc:mysql
        host/ip          195.35.59.18
        port             3306
        database_name    u201212290_qaloantec


        username          u201212290_qaloanuser
        password          HPo?+7r$
     */

    // Ham haldeki bu bilgiler ile JDBC baglantisi kurmak zordur.
    // O yuzden bu datalari analsilir bir URL haline getirmek zorundayiz.

    /*
        URL:        jdbc:mysql://195.35.59.18/u201212290_qaloantec
        USERNAME:   u201212290_qaloanuser
        PASSWORD:   HPo?+7r$
     */

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. ADIM JDBC Surucusunu Yukleme

        Class.forName("com.mysql.cj.jdbc.Driver"); // Type 4


        // 2. ADIM Veritabani Baglantisi Kurma (Connection)

        String url = "jdbc:mysql://195.35.59.18/u201212290_qaloantec";
        String username = "u201212290_qaloanuser";
        String password = "HPo?+7r$";

        Connection connection = DriverManager.getConnection(url, username, password);


        // 3. ADIM SQL Sorgulari Olusturma (Query Hazirlama)

        String query = "SELECT * FROM users;";


        // 4. ADIM SQL Sorgularini Calistirma

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet resultSet = statement.executeQuery(query);


        // 5. ADIM Sonuclari Isleme

        // Database'den gelen sonuclar resultSet icerisinde
        // resultSet icerisinde "ITERATOR" ile islem yapabilirim

        resultSet.next();
        System.out.println(resultSet.getString("firstname")); // Elf

        resultSet.next();
        System.out.println(resultSet.getString(4)); // tester

        resultSet.next();
        resultSet.next();
        System.out.println(resultSet.getInt(8)); // 85462


        resultSet.absolute(15);
        System.out.println(resultSet.getString(6)); // bidasa9700@xcmexico.com


        resultSet.previous();
        System.out.println(resultSet.getString(2)); // Loan


        resultSet.first();
        System.out.println(resultSet.getString(3)); // Ferid
        System.out.println(resultSet.getString(4)); // acenk


        resultSet.beforeFirst(); // ilk satira gider
        System.out.println(resultSet.isBeforeFirst()); // true

        resultSet.afterLast(); // son satira gider
        System.out.println(resultSet.isAfterLast()); // true

        int columnIndex = resultSet.findColumn("ref_by"); // kacinci sutunda oldugunu verir

        System.out.println(columnIndex); // 9

    }

}
