/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author garaguly.csaba
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     * 
     * sout (tab) = println
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
        
        
        int elemszám = nevek.size();
        System.out.println("A lista elemszáma: " + elemszám);
        //Hány elemet tartalmaz a lista  //(3)
        for (String elem: nevek) {
            System.out.println(elem);
        }
        
    }
    static void lista_kiir(ArrayList<String> lista)
    {
        int elemszám = lista.size();
        System.out.println("A lista elemszáma: " + elemszám);
        for (String elem: lista) {
            System.out.println(elem);
        }
    }
    
    
    
    //Részfeladat
    static void lista_feltolt_0_100(int elemszam, ArrayList<Integer> lista)
    {
        //import Random
        Random r = new Random();
        for (int i = 0; i <= elemszam; i++) {
            lista.add(r.nextInt(100));
        }
    }
    //Részfeladat
    
    
    
    
    static void lista_kiirINTEGER(ArrayList<Integer> listaINT)
    {
        int elemszám = listaINT.size();
        System.out.println("A lista elemszáma: " + elemszám);
        for (Integer elem: listaINT) {
            System.out.println(elem);
        }
    }
    
    static void masodikfeladat(String[] args)
    {
        //Lista létrehoz
        ArrayList<Integer> szamok = new ArrayList<>();
        
        System.out.println("Hány számot szeretne? ");
        //import scanner
        Scanner konzol = new Scanner(System.in);
        int db = konzol.nextInt();
        
        //**this madafaka**
        lista_feltolt_0_100(db,szamok);
        
        //??? Lista kiiratása
        lista_kiirINTEGER(szamok); 
        
        //Rendezzük sorba
        szamok.sort(null);
        lista_kiirINTEGER(szamok);
        
        System.out.println(" számok összege: " + lista_szum(szamok));
    }
    
    //számok összege
    static int lista_szum(ArrayList<Integer> lista)
    {
        int osszeg = 0;
        for (int x: lista) {
            osszeg += x;
        }
        return osszeg;
    }
    
}
