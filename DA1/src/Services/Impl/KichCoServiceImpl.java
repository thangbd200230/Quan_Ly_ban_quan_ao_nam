/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.KichCo;
import Repositories.Impl.KichCoRepositoryImpl;
import Repositories.KichCoRepository;
import Services.KichCoService;
import java.util.List;

/**
 *
 * @author truongmanhquang
 */
public class KichCoServiceImpl implements KichCoService{

    private KichCoRepository kichCoRepository=new KichCoRepositoryImpl();
    @Override
    public List<KichCo> getAll() {
        return kichCoRepository.getAll();
    }
    
}
