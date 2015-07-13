/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.inventory;

import database.connector.DBConnection;
import database.handler.DBHandler;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.inventory.Product;
import util.definitions.AppConstants;

/**
 *
 * @author Shehan
 */
public class ProductController {

    public static ArrayList<Product> getAllProducts() throws SQLException {
        Connection connection = DBConnection.getConnectionToDB();
        String query = "SELECT * FROM " + AppConstants.PRODUCT;
        ResultSet resultSet = DBHandler.getData(connection, query);
        
        ArrayList<Product> products = new ArrayList();
        while (resultSet.next()) {
            Product product = new Product(
                    resultSet.getInt("product_id"),
                    resultSet.getString("product_name"),
                    resultSet.getLong("barcode"),
                    resultSet.getString("description"),
                    resultSet.getInt("category_id"),
                    resultSet.getInt("department_id"),
                    resultSet.getString("unit"),
                    resultSet.getDouble("pack_size"),
                    resultSet.getDouble("reorder_value"),
                    resultSet.getDouble("reorder_quantity"),
                    resultSet.getDouble("max_quantity")
            );
            products.add(product);
        }
        return products;
    }
    
    public static ArrayList<Product> getAllAvailableProducts() throws SQLException {
        Connection connection = DBConnection.getConnectionToDB();
        String query = "SELECT DISTINCT p.* FROM " + AppConstants.PRODUCT + " p ,"+AppConstants.BATCH+" b WHERE p.product_id=b.product_id AND b.quantity>0 AND b.in_stock=true";
        ResultSet resultSet = DBHandler.getData(connection, query);
        
        ArrayList<Product> products = new ArrayList();
        while (resultSet.next()) {
            Product product = new Product(
                    resultSet.getInt("product_id"),
                    resultSet.getString("product_name"),
                    resultSet.getLong("barcode"),
                    resultSet.getString("description"),
                    resultSet.getInt("category_id"),
                    resultSet.getInt("department_id"),
                    resultSet.getString("unit"),
                    resultSet.getDouble("pack_size"),
                    resultSet.getDouble("reorder_value"),
                    resultSet.getDouble("reorder_quantity"),
                    resultSet.getDouble("max_quantity")
            );
            products.add(product);
        }
        return products;
    }
}