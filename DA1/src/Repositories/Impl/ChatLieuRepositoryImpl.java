/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.ChatLieu;
import Repositories.ChatLieuRepository;
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
public class ChatLieuRepositoryImpl implements ChatLieuRepository{

    @Override
    public List<ChatLieu> getAll() {
        String query="SELECT Id, Ma, Ten\n" +
                "           FROM DA1.dbo.ChatLieu";
        try(Connection con=DBConnection.getConnection();
                PreparedStatement ps=con.prepareStatement(query);) {
            List<ChatLieu> listChatLieu=new ArrayList<>();
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {                
                ChatLieu chatLieu=new ChatLieu(rs.getString(1), rs.getString(2), rs.getString(3));
                listChatLieu.add(chatLieu);
            }
            return listChatLieu;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
}
