/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class ClassBaru {
    int sisi;
    int keliling;
    
    void ClassBaru(int sisi){
      this.sisi = sisi; 
    }
    
    int sisi(){
          return sisi;
    }
     
    int hitung(){
        keliling = 4*sisi;
        System.out.println("Keliling Persegi sisi 10 aadalah : " +keliling);
        return keliling;
    }
}