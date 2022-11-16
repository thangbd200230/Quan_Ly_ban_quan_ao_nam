/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.KichCo;
import Repositories.KichCoRepository;
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
public class KichCoRepositoryImpl implements KichCoRepository{

    @Override
    public List<KichCo> getAll() {
        String query="SELECT Id, Ma, Ten\n" +
                "           FROM DA1.dbo.KichCo";
        try(Connection con=DBConnection.getConnection();
                PreparedStatement ps=con.prepareStatement(query);) {
            List<KichCo> listKichCo=new ArrayList<>();
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {                
                KichCo kichCo=new KichCo(rs.getString(1), rs.getString(2), rs.getString(3));
                listKichCo.add(kichCo);
            }
            return listKichCo;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
}
