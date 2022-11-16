/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.MauSac;
import Repositories.MauSacRepository;
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
public class MauSacRepositoryImpl implements MauSacRepository{

    @Override
    public List<MauSac> getAll() {
        String query="SELECT Id, Ma, Ten\n" +
                "               FROM DA1.dbo.MauSac";
        try(Connection con=DBConnection.getConnection();
                PreparedStatement ps=con.prepareStatement(query);) {
            List<MauSac> listMauSac=new ArrayList<>();
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {                
                MauSac mauSac=new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
                listMauSac.add(mauSac);
            }
            return listMauSac;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
}
