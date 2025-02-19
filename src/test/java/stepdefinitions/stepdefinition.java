package stepdefinitions;

import io.cucumber.java.en.*;
import utilities.ConfigReader;

import javax.xml.transform.Result;
import java.io.ObjectInputFilter;
import java.sql.*;

public class stepdefinition {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("Database baglantisi kurulur.")
    public void database_baglantisi_kurulur() throws SQLException {

        connection = DriverManager.getConnection(ConfigReader.getProperty("url"),
                                                            ConfigReader.getProperty("username"),
                                                            ConfigReader.getProperty("password"));

    }

    @Given("SQL Query'si hazirla ve calistir.")
    public void sql_query_si_hazirla_ve_calistir() throws SQLException {

        String query = "SELECT DISTINCT user_id FROM deposits WHERE amount BETWEEN 100 AND 500;";

        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        resultSet = statement.executeQuery(query);
    }

    @Given("Sonuclari dogrula.")
    public void sonuclari_dogrula() throws SQLException {

        resultSet.next();
        System.out.println(resultSet.getInt(1));

    }

    @Given("Database baglantisini sonlandir.")
    public void database_baglantisini_sonlandir() {

    }

}
