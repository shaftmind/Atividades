/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Executaveis;

import br.com.bandtec.pro.eagle.CPU;
import br.com.bandtec.pro.eagle.Disco;
import br.com.bandtec.pro.eagle.Formatacao;
import br.com.bandtec.pro.eagle.Memoria;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

/**
 *
 * @author adais
 */
public class ExecConsole {
    
    public static void main(String[] args) {
        SystemInfo keyMestra = new SystemInfo();
        HardwareAbstractionLayer hard = keyMestra.getHardware();
        OperatingSystem opera = keyMestra.getOperatingSystem();
        
        long [] verificarCpu = hard.getProcessor().getSystemCpuLoadTicks();
        
        Disco disc = new Disco();
        CPU cp = new CPU();
        Memoria memory = new Memoria();
        
         
        System.out.println("Sistema operacional: " + keyMestra.getOperatingSystem());
        System.out.println("");
        System.out.println (hard.getProcessor().getSystemCpuLoadBetweenTicks(verificarCpu) * 100);
        System.out.println("");
        System.out.println("Processador: " + keyMestra.getHardware().getProcessor());
        System.out.println("");
        System.out.println("Uptime:" + Formatacao.formatElapsedSecs(keyMestra.getOperatingSystem().getSystemUptime()));
        System.out.println("");
        System.out.println("dasldha" + keyMestra.getOperatingSystem().getProcesses());
        System.out.println("");
        System.out.println(String.format("Memoria Total: %.1f GB\n Memoria em Uso: %.1f GB \n Memoria Livre: %.1f GB",
                memory.memoriaTotal(), memory.memoriaUso(), memory.memoriaLivre()));
        System.out.println("");
        System.out.println("Memória Física:" + hard.getMemory().getPhysicalMemory());
        System.out.println("");
        System.out.println("Memória Virtual: " + hard.getMemory().getVirtualMemory());
        System.out.println("");
        System.out.println(String.format("%.1f%%", (cp.cpuPorcentagem())));
        System.out.println("");
        System.out.println(disc.locura());        
        
    }
}
