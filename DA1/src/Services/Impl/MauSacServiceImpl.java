/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.MauSac;
import Repositories.Impl.MauSacRepositoryImpl;
import Repositories.MauSacRepository;
import Services.MauSacService;
import java.util.List;

/**
 *
 * @author truongmanhquang
 */
public class MauSacServiceImpl implements MauSacService{

    private MauSacRepository mauSacRepository=new MauSacRepositoryImpl();
    @Override
    public List<MauSac> getAll() {
        return mauSacRepository.getAll();
    }
    
}
