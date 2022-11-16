/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.KieuDang;
import Repositories.Impl.KieuDangRepositoryImpl;
import Repositories.KieuDangRepository;
import Services.KieuDangService;
import java.util.List;

/**
 *
 * @author truongmanhquang
 */
public class KieuDangServiceImpl implements KieuDangService{

    private KieuDangRepository kieuDangRepository=new KieuDangRepositoryImpl();
    @Override
    public List<KieuDang> getAll() {
        return kieuDangRepository.getAll();
    }
    
}
