/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.NSX;
import Repositories.Impl.NSXRepositoryImpl;
import Repositories.NSXRepository;
import Services.NSXService;
import java.util.List;

/**
 *
 * @author truongmanhquang
 */
public class NSXServiceImpl implements NSXService{

    private NSXRepository nSXRepository=new NSXRepositoryImpl();
    @Override
    public List<NSX> getAll() {
        return nSXRepository.getAll();
    }
    
}
