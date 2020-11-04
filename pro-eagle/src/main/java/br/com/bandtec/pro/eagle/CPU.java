/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.pro.eagle;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor.TickType;
import oshi.hardware.CentralProcessor;

/**
 *
 * @author adais
 */
public class CPU {
    
    SystemInfo keyMestra = new SystemInfo();
    
    
    private final CentralProcessor cp;
    private long [] tickts  = keyMestra.getHardware().getProcessor().getSystemCpuLoadTicks();

    public CPU() {
        this.cp = keyMestra.getHardware().getProcessor();
       // this.tickts = new long[TickType.values().length];
    }

    
    
    
     public Double freqMax(){
        return Formatacao.toGigah(cp.getMaxFreq());
    }
    
     public Double cpuPorcentagem() {
        double por = cp.getSystemCpuLoadBetweenTicks(tickts);
        return por * 100.0;
    }
      
     
    // public Double getPercentComplete(){
      //   return cpuPorcentagem() / 100;
     //}
}
