/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikacjaquiz;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Interfejs {
    private String wybor1;
    
    Scanner skan = new Scanner(System.in);
    
    public void start(){
        do{
        System.out.println();
        System.out.println("Co chcesz zrobić ?");
        System.out.println("[1] Dodaj nowy quiz");
        System.out.println("[2] Zagraj");
        System.out.println("[3] Wyjdź");
        this.wybor1 = skan.nextLine();
        
        switch(wybor1){
            case "1":
                Kreator k = new Kreator();
                k.UruchomKreator();
                break;
                
            case "2":
                Gra g = new Gra();
                g.startGry();
                break;
                
            default:
                System.out.println("Koniec.");
                break;
        }
        
        }while(!(wybor1.equals("3")));
    }
    
    
    
}
