package com.company;

import java.sql.*;

public class DataBase {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "password";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("connected");
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }

    public static void getVisitorsCount() {
        String sql = "select count(*) , a.group_name, a.id from visitor v join agroup a on a.id = v.agroup group by a.group_name, a.id";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);) {

            while(rs.next()) {
                System.out.println("in group " + rs.getString(2) + " ID: " + rs.getInt(3) + " there are " + rs.getInt(1) + " students");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
