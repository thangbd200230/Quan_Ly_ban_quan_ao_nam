/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.ChatLieu;
import Repositories.ChatLieuRepository;
import Repositories.Impl.ChatLieuRepositoryImpl;
import Services.ChatLieuService;
import java.util.List;

/**
 *
 * @author truongmanhquang
 */
public class ChatLieuServiceImpl implements ChatLieuService{

    private ChatLieuRepository ChatLieuRepository=new ChatLieuRepositoryImpl();
    @Override
    public List<ChatLieu> getAll() {
        return ChatLieuRepository.getAll();
    }
    
}
