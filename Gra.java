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
public class Gra {
    private String sciezka;
    private int wynik = 0;
    private String odpowiedz;
    private String pkt;
    Quiz q2 = new Quiz();
    Scanner skan = new Scanner(System.in);
    
    
    public void startGry(){
        
        System.out.print("Podaj ścieżkę, w której znajduje się quiz (np. E:\\\\quiz.txt): ");
        this.sciezka = skan.nextLine();
        
        Odczyt o = new Odczyt(sciezka);
        
        o.odczytajPlik();
        o.setTablicaOdczytu();
        
        System.out.println("Odpowiadaj na pytania wybierając spośród odpowiedzi a, b, c lub d");
        for(int i = 0; i < 5; i++){
        o.przygotowanieTablicyJednejLinii(i);
        System.out.println("Pytanie" + (i+1) + ": ");
        System.out.println(o.getTresc());
        System.out.println("A: " + o.getOdpA());
        System.out.println("B: " + o.getOdpB());
        System.out.println("C: " + o.getOdpC());
        System.out.println("D: " + o.getOdpD());
        
        do{
        System.out.print("Twoja odpowiedz to: ");
        this.odpowiedz = skan.nextLine();
        if(!(odpowiedz.equals("a")||
                 odpowiedz.equals("b")||
                 odpowiedz.equals("c")||
                 odpowiedz.equals("d"))){
            System.out.println("Spróbuj jeszcze raz.");
        }
        }while(!(odpowiedz.equals("a")||
                 odpowiedz.equals("b")||
                 odpowiedz.equals("c")||
                 odpowiedz.equals("d")));
        
        if(o.getOdpPoprawna().equals(odpowiedz)){
            System.out.println("Poprawna odpowiedź!");
            this.wynik++;
        }else{
            System.out.println("Odpowiedż błędna :( ");
        }
            System.out.println();
        }
        if((wynik == 0)||(wynik == 5)) {pkt = "punktów";}
        else{if(wynik == 1){ pkt = "punkt";}
        else{pkt = "punkty";}

        System.out.println("Koniec gry.");
        System.out.println("Zdobyłeś " + wynik + " " + pkt + " na 5 możliwych.");
        
        }
    }
    
}
