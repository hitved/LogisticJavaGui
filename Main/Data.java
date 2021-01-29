/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Fatih
 */
public class Data {
   public String nama;
   public int id;
 
   public Data(){
       
   }
   
   public Data(String nama){
       this.nama = nama;
   }
   
    public Data(int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getId(){
        return this.id;
    }
}