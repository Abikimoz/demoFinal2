package org.example.demofinal.dao;

import org.example.demofinal.config.DBConnect;
import org.example.demofinal.models.Org;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrgDao {
    private static final String GET_ALL_ORGS = "SELECT * FROM partners";

    public List<Org> getAllOrgs() throws SQLException {
        List<Org> orgs = new ArrayList<>();
        try (Connection connection = DBConnect.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(GET_ALL_ORGS)) {
            while (rs.next()) {
                orgs.add(new Org(
                        rs.getInt("id"),
                        rs.getString("partner_type"),
                        rs.getString("names"),
                        rs.getString("ceo"),
                        rs.getString("phone"),
                        rs.getString("rating")
                ));
            }
        }
        return orgs;
    }
}
