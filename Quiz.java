/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikacjaquiz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Quiz {
    List<Pytanie> listaPytan = new ArrayList<>();
    
    public void dodajPytanie(Pytanie p){
        listaPytan.add(p);
    }
    
    public Pytanie getPytanie(int l){
        return listaPytan.get(l);
    }

    public void setListaPytan(List<Pytanie> lista) {
        this.listaPytan = lista;
    }
    
    public void zapiszQuiz(){
        
    }

    public List<Pytanie> getListaPytan() {
        return listaPytan;
    }
    
    
    
}
