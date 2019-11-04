/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;

/**
 *
 * @author garaguly.csaba
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lista létrehoz
        ArrayList<String> nevek = new ArrayList<>();
        
        //Feltöltés
        nevek.add("István");
        nevek.add("Botond");
        //
        nevek.add("Karcsi");
        nevek.add("Béla");
        
        //Berakja 3. elemként
        nevek.add(2, "Józsi");
        
        //Elem törlése
        nevek.remove(1);
        nevek.remove(1);
        //István .. .. Karcsi Béla
        
        //Elem módosítás
        nevek.set(0, "Szent István");
        
        //Listaelem sorszámának lekérdezése
        int hanyadik = nevek.indexOf("Szent István");
        System.out.println((hanyadik + 1 ) + ". " + nevek.get(hanyadik));
        
        System.out.println(nevek);
    }
    static void lista_kiir(ArrayList<String> lista)
    {
        int elemszám = lista.size();
        System.out.println("");
    }
    
}
