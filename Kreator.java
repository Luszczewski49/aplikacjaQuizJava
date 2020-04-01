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
import java.util.Scanner;


/**
 *
 * @author Dell
 */
public class Kreator {
    private String t;
    private String a;
    private String b;
    private String c;
    private String d;
    private String p;
    private String s;
    List<String> listaDoZapisu = new ArrayList<>();
    
    Scanner skan = new Scanner(System.in);
    
    
    
    public void UruchomKreator(){
        
        Quiz q1 = new Quiz();
        
        for(int i = 0; i < 5; i++){
        System.out.println();
        System.out.print("Podaj treść pytania nr " + (i+1) + ": ");
        this.t = skan.nextLine();
        System.out.print("Podaj odpowiedź A: ");
        this.a = skan.nextLine();
        System.out.print("Podaj odpowiedź B: ");
        this.b = skan.nextLine();
        System.out.print("Podaj odpowiedź C: ");
        this.c = skan.nextLine();
        System.out.print("Podaj odpowiedź D: ");
        this.d = skan.nextLine();
        
        do{
        System.out.print("Podaj poprawną odpowiedź (a, b, c lub d): ");
        this.p = skan.nextLine();
        
        if(!(p.equals("a")||p.equals("b")||p.equals("c")||p.equals("d"))){
            System.out.println("Wprowadzono błędną odpowiedź.");
        }
        
        }while(!(p.equals("a")||p.equals("b")||p.equals("c")||p.equals("d")));
        
        
        Pytanie p1 = new Pytanie(t, a, b, c, d, p);
        
        q1.dodajPytanie(p1);
        
        DodajDoListy(p1);

        }
            
        System.out.println("Podaj ścieżkę zapisu pliku (np. E:\\\\plik.txt): ");
        s = skan.nextLine();
        
        ZapiszListe();
        
        System.out.println("Udany zapis quizu!");
        
    }
    
    
    
            public void DodajDoListy(Pytanie p){
                listaDoZapisu.add(p.doZapisu());
            }
            
            public void ZapiszListe(){
                
        try {
            Files.write(Paths.get(s), listaDoZapisu);
        } catch (IOException ex) {
           
            System.out.println("Nie udało się zapisać pliku.");
            
                  }
      
            
          }
            
}
