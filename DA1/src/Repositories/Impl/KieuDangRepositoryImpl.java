/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.KieuDang;
import Repositories.KieuDangRepository;
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
public class KieuDangRepositoryImpl implements KieuDangRepository{

    @Override
    public List<KieuDang> getAll() {
        String query="SELECT Id, Ma, Ten\n" +
            "           FROM DA1.dbo.KieuDang";
        try(Connection con=DBConnection.getConnection();
                PreparedStatement ps=con.prepareStatement(query);) {
            List<KieuDang> listKieuDang=new ArrayList<>();
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {                
                KieuDang kieuDang=new KieuDang(rs.getString(1), rs.getString(2), rs.getString(3));
                listKieuDang.add(kieuDang);
            }
            return listKieuDang;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
}
