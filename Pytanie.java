/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikacjaquiz;

/**
 *
 * @author Dell
 */
public class Pytanie {
    private String tresc;
    private String odpowiedzA;
    private String odpowiedzB;
    private String odpowiedzC;
    private String odpowiedzD;
    private String poprawna;

    public Pytanie(String tresc, String odpowiedzA, String odpowiedzB, String odpowiedzC, String odpowiedzD, String poprawna) {
        this.tresc = tresc;
        this.odpowiedzA = odpowiedzA;
        this.odpowiedzB = odpowiedzB;
        this.odpowiedzC = odpowiedzC;
        this.odpowiedzD = odpowiedzD;
        this.poprawna = poprawna;
    }


    
    public String doZapisu(){
        return tresc + "///" 
                + odpowiedzA + "///" 
                + odpowiedzB + "///" 
                + odpowiedzC + "///" 
                + odpowiedzD + "///" 
                + poprawna;
    }
    
    public void wyswietl(){
        
        System.out.println(tresc);
        System.out.println("A: " + odpowiedzA);
        System.out.println("B: " + odpowiedzB);
        System.out.println("C: " + odpowiedzC);
        System.out.println("D: " + odpowiedzD);
        
    }
    
    

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public String getOdpowiedzA() {
        return odpowiedzA;
    }

    public void setOdpowiedzA(String odpowiedzA) {
        this.odpowiedzA = odpowiedzA;
    }

    public String getOdpowiedzB() {
        return odpowiedzB;
    }

    public void setOdpowiedzB(String odpowiedzB) {
        this.odpowiedzB = odpowiedzB;
    }

    public String getOdpowiedzC() {
        return odpowiedzC;
    }

    public void setOdpowiedzC(String odpowiedzC) {
        this.odpowiedzC = odpowiedzC;
    }

    public String getOdpowiedzD() {
        return odpowiedzD;
    }

    public void setOdpowiedzD(String odpowiedzD) {
        this.odpowiedzD = odpowiedzD;
    }

    public String getPoprawna() {
        return poprawna;
    }

    public void setPoprawna(String poprawna) {
        this.poprawna = poprawna;
    }
    
    
    
    
    
    
    
    
}
