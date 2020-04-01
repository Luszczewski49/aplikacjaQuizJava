/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikacjaquiz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Dell
 */
public class Odczyt {
    String sciezkaPliku;
    List<String> tymczasowaLista = new ArrayList<>();
    String[] tablicaOdczytu = new String[5];
    String[] tablicaJednejLinii = new String[6];
    
    public Odczyt(String sciezka){
        this.sciezkaPliku = sciezka;
    }
    
    public void odczytajPlik(){
        try {
            this.tymczasowaLista = Files.readAllLines(Paths.get(sciezkaPliku));
        } catch (IOException ex) {
            System.out.println("Błąd odczytu.");
        }
    }
    
    public void setTablicaOdczytu(){
        for(int i = 0; i < 5; i++){
        this.tablicaOdczytu[i] = tymczasowaLista.get(i);
        }
        
    }
    
    public void przygotowanieTablicyJednejLinii(int numerLinii){
        
         this.tablicaJednejLinii = tablicaOdczytu[numerLinii].split("///");
    }

    
    
    public String getTresc(){
        return tablicaJednejLinii[0];
    }
    
    public String getOdpA(){
        return tablicaJednejLinii[1];
    }
    
    public String getOdpB(){
        return tablicaJednejLinii[2];
    }
    
    public String getOdpC(){
        return tablicaJednejLinii[3];
    }
    
    public String getOdpD(){
        return tablicaJednejLinii[4];
    }
    
    public String getOdpPoprawna(){
        return tablicaJednejLinii[5];
    }
    
    
    
    
   
}
