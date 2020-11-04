/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.pro.eagle;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import oshi.SystemInfo;

/**
 *
 * @author adais
 */
public class Formatacao {
    
    
    SystemInfo si = new SystemInfo();
    
    public static Double toGigab(Long bytes){
        return bytes / Math.pow(10, 9);
    }
    
    public static  Double toGigah(Long hertz){
        return  hertz / Math.pow(10, 9);
    }
    
    
        public static String formatElapsedSecs(long secs) {
        long eTime = secs;
        final long days = TimeUnit.SECONDS.toDays(eTime);
        eTime -= TimeUnit.DAYS.toSeconds(days);
        final long hr = TimeUnit.SECONDS.toHours(eTime);
        eTime -= TimeUnit.HOURS.toSeconds(hr);
        final long min = TimeUnit.SECONDS.toMinutes(eTime);
        eTime -= TimeUnit.MINUTES.toSeconds(min);
        final long sec = eTime;
        return String.format("%d dias, %02d:%02d:%02d", days, hr, min, sec); 
        
    }
    
    
}
