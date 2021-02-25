/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class Class {
    int sisi;
    int luas;
    
    void Class(int sisi){
        this.sisi = sisi;
    }
    
    int hitung(){
        luas = sisi*sisi;
        System.out.println("Luas Persegi sisi 6 adalah " +luas);
        return luas;
                
    }
}
