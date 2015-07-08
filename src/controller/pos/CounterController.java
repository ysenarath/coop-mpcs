/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.pos;

import database.connector.DBConnection;
import database.handler.DBHandler;
import java.sql.Connection;
import java.sql.SQLException;
import model.pos.CounterLogin;
import util.definitions.AppConstants;

/**
 *
 * @author Shehan
 */
public class CounterController {

    public static boolean addCounterLogin(CounterLogin counterLogin) throws SQLException {
        Connection connection = DBConnection.getConnectionToDB();
        String query = "INSERT INTO " + AppConstants.COUNTER_LOGIN + "(user_name,counter_id,time,date,initial_amount) VALUES(?,?,?,?,?)";
        int counterloginAdded = -1;
        Object[] ob = {
            counterLogin.getUser_name(),
            counterLogin.getCounterId(),
            counterLogin.getTime(),
            counterLogin.getDate(),
            counterLogin.getInitialAmount()
        };
        counterloginAdded = DBHandler.setData(connection, query, ob);
        return counterloginAdded == 1;
    }
//
//    public static String getLastShiftId() throws SQLException {
//        Connection connection = DBConnection.getConnectionToDB();
//        String query = "SELECT shift_id FROM " + AppConstants.COUNTER_LOGIN + " ORDER BY shift_id DESC LIMIT 1";
//        ResultSet resultSet = DBHandler.getData(connection, query);
//        if(resultSet.next()){
//            return resultSet.getString("shift_id");
//        }
//        return null;
//    }
}