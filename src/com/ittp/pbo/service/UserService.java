/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ittp.pbo.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author MHIKAM
 */
public class UserService {

    private final Connection connection;

    public UserService(Connection connection) {
        this.connection = connection;
    }

    public boolean registerUser(String username, String password) {
        String insertUserQuery = "INSERT INTO staff (username, password) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(insertUserQuery)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean loginUser(String username, String password) {
        String loginUserQuery = "SELECT * FROM staff WHERE username = ? AND password = ?";
        try (PreparedStatement stmt = connection.prepareStatement(loginUserQuery)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
