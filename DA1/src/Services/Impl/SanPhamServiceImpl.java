/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;


import DomainModels.SanPham;
import Repositories.Impl.SanPhamRepositoryImpl;
import Repositories.SanPhamRepository;
import Services.SanPhamService;
import java.util.List;

/**
 *
 * @author truongmanhquang
 */
public class SanPhamServiceImpl implements SanPhamService{

    private SanPhamRepository sanPhamRepository=new SanPhamRepositoryImpl();
    @Override
    public List<SanPham> getAll() {
        return sanPhamRepository.getAll();
    }
    
    
}
