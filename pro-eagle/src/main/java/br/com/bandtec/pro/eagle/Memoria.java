/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.pro.eagle;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;

/**
 *
 * @author adais
 */
public class Memoria {
    
    SystemInfo keyMestra = new SystemInfo();
    
    private final GlobalMemory memory;

    public Memoria() {
        this.memory = keyMestra.getHardware().getMemory();
    }
    
    
    
       public Double memoriaUso(){
        return memoriaTotal() - memoriaLivre();
    }
    
    public Double memoriaLivre(){
        return Formatacao.toGigab(memory.getAvailable());
    }
    
    public Double memoriaTotal(){
        return Formatacao.toGigab(memory.getTotal());
    }
    
    public Double memoriaPorcentagem(){
        long total = memory.getTotal();
        long usada = total - memory.getAvailable();
        
        return (usada * 100.0) / total;
    }
}
