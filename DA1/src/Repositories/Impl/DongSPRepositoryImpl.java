/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.DongSP;
import Repositories.DongSPRepository;
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
public class DongSPRepositoryImpl implements DongSPRepository{

    @Override
    public List<DongSP> getAll() {
        String query="SELECT Id, Ma, Ten\n" +
            "           FROM DA1.dbo.DongSP";
        try(Connection con=DBConnection.getConnection();
                PreparedStatement ps=con.prepareStatement(query);) {
            List<DongSP> listDongSP=new ArrayList<>();
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {                
                DongSP dongSP=new DongSP(rs.getString(1), rs.getString(2), rs.getString(3));
                listDongSP.add(dongSP);
            }
            return listDongSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
}
