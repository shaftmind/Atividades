/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.pro.eagle;

import java.util.ArrayList;
import java.util.List;
import oshi.SystemInfo;
import oshi.software.os.FileSystem;
import oshi.software.os.OSFileStore;
import oshi.util.FormatUtil;


/**
 *
 * @author adais
 */
public class Disco {
    
    SystemInfo keyMestra = new SystemInfo();
    
    
    private final FileSystem fileSystem;
    static List<String> disco = new ArrayList<>();

    public Disco() {
        this.fileSystem = keyMestra.getOperatingSystem().getFileSystem();
    }

     
    @SuppressWarnings("empty-statement")
    public String locura(){
          for (OSFileStore fs : fileSystem.getFileStores()) {
            long usable = fs.getUsableSpace();
            long total = fs.getTotalSpace();
            disco.add(String.format(
                    " %s (%s) [%s] Usados: %s de %s (%.1f%%) \n",
                    fs.getName(), fs.getDescription().isEmpty() ? "file system" : fs.getDescription(), fs.getType(),
                    FormatUtil.formatBytes(usable), FormatUtil.formatBytes(fs.getTotalSpace()), 100d * usable / total));
        };
     return disco.toString();
    }
    
   // public String nomeDisc(Integer numb){
    //    String nomeDisco = discoDisp.get(numb).getModel();
   ///     return nomeDisco.substring(0, nomeDisco.indexOf("("));
   // }
    
   // public Double tamanhoDisco(Integer numb){
   //     return Formatacao.toGigab(discoDisp.get(numb).getSize());
   // }
    
     // public List<String> getPartitionsMountPoint(Integer index) {
     //   HWDiskStore disk = discoDisp.get(index);
      //  List<String> mountPoints = new ArrayList<>();
        
      //  for (HWPartition partitions : disk.getPartitions()) {
       //     if (!partitions.getMountPoint().equals(""))
       //         mountPoints.add(partitions.getMountPoint());
       // }
        
      //  return mountPoints;
    //}//
    
    
   // public Double espacoLivreDisco(Integer numb){
    //    Long tamanho = 0L;
        
      //  for(String parada : getPartitionsMountPoint(numb)){
     //       File file = new File(parada);
     //       tamanho += file.getFreeSpace();
     ///   }
    //    return Formatacao.toGigab(tamanho);
    //}
    
    //public Integer discoPorcentagem(Integer numb){
        
    //    Double total = tamanhoDisco(numb);
      //  Double usado = espacoLivreDisco(numb);
        
     //   return Double.valueOf(((100 - usado) * 100) / total).intValue();
  //  }
    
   
}
