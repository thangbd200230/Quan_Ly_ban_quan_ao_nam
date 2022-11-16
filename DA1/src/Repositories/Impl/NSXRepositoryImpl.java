/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.NSX;
import Repositories.NSXRepository;
import Utilities.DBConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author truongmanhquang
 */
public class NSXRepositoryImpl implements NSXRepository{

    @Override
    public List<NSX> getAll() {
        String query="SELECT Id, Ma, Ten\n" +
                "           FROM DA1.dbo.NSX";
        try(Connection con=DBConnection.getConnection();
                PreparedStatement ps=con.prepareStatement(query);) {
            List<NSX> listNsx=new ArrayList<>();
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {                
                NSX nSX=new NSX(rs.getString(1), rs.getString(2), rs.getString(3));
                listNsx.add(nSX);
            }
            return listNsx;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
}
