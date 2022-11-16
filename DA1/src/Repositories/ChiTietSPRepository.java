/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietSP;
import ViewModels.QLChiTietSP;
import java.util.List;

/**
 *
 * @author truongmanhquang
 */
public interface ChiTietSPRepository {
    List<QLChiTietSP> getAll();
    List<QLChiTietSP> getOne(String ma);
    boolean add(ChiTietSP chiTietSP);
    boolean update(ChiTietSP chiTietSP, String id);
    boolean delete(String id);
}
