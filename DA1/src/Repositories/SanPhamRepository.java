/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.SanPham;
import java.util.List;

/**
 *
 * @author truongmanhquang
 */
public interface SanPhamRepository {
    List<SanPham> getAll();
}
