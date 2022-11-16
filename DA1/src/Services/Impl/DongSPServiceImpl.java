/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.DongSP;
import Repositories.DongSPRepository;
import Repositories.Impl.DongSPRepositoryImpl;
import Services.DongSPService;
import java.util.List;

/**
 *
 * @author truongmanhquang
 */
public class DongSPServiceImpl implements DongSPService{

    private DongSPRepository dongSPRepository=new DongSPRepositoryImpl();
    @Override
    public List<DongSP> getAll() {
        return dongSPRepository.getAll();
    }
    
}
