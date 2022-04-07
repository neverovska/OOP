package SQLmethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler extends Database{
    Connection dbConnection;

    public Connection getDbConnection()
        throws ClassNotFoundException, SQLException{
            String connectionString = "jdbc:mysql://" + dbHost + ":"
                    + dbPort + "/" + dbName;
            Class.forName("com.mysql.jdbc.Driver");
            dbConnection = DriverManager.getConnection(connectionString,
                    dbUser, dbPass);
            return dbConnection;

    }

    public void signUpUser(String name, String lastname, String patronymic, String phoneNumber,
                           String email, String password, String passportID, String passportNum,
                           boolean RB) throws SQLException, ClassNotFoundException {
        //SQL запрос с установкой определенных данных в определенные поля
        String insert = "INSERT INTO " + Const.USER_TABLE + " (" + Const.USER_NAME + "," +
                Const.USER_LASTNAME + "," + Const.USER_PATRONYMIC + "," + Const.USER_PHONE_NUMBER +
                "," + Const.USER_EMAIL + "," + Const.USER_PASSWORD + "," +
                Const.USER_PASSPORT_ID + "," + Const.USER_PASSPORT_NUMBER + "," + Const.USER_RB + ") " +
                "VALUES(?,?,?,?,?,?,?,?,?)";
        //выполняем этот запрос
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3, patronymic);
            preparedStatement.setString(4, phoneNumber);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, password);
            preparedStatement.setString(7, passportID);
            preparedStatement.setString(8, passportNum);
            preparedStatement.setBoolean(9, true);
            preparedStatement.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }


    }

    public void signUpCompany(String type, String name, String unp, String bik,
                           String address, String password) throws SQLException, ClassNotFoundException {
        //SQL запрос с установкой определенных данных в определенные поля
        String insert = "INSERT INTO " + Const.COMPANY_TABLE + " (" + Const.COMPANY_TYPE + "," +
                Const.COMPANY_NAME + "," + Const.COMPANY_UNP + "," + Const.COMPANY_BIK +
                "," + Const.COMPANY_ADDRESS + "," + Const.COMPANY_PASSWORD + ") " +
                "VALUES(?,?,?,?,?,?)";
        //выполняем этот запрос
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setString(1, type);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, unp);
            preparedStatement.setString(4, bik);
            preparedStatement.setString(5, address);
            preparedStatement.setString(6, password);
            preparedStatement.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }


    }
}
