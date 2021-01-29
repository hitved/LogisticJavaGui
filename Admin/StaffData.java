/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Main.Data;

/**
 *
 * @author Fatih
 */
public class StaffData extends Data {
    
    protected String address, city;
    int phone;
    
    public StaffData(){
        
    }
     
    StaffData(int nik, String nama){
        super(nik, nama);
    }
    
    StaffData(int nik, String nama, String address, String city){
        super(nik,nama);
        this.address = address;
        this.city = city;
    }
    
    StaffData(int nik, String nama, String address, String city, int phone){
        super(nik,nama);
        this.address = address;
        this.city = city;
        this.phone = phone;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public String getCity (){
        return this.city;
    }
    
    public void setPhone(int phone){
        this.phone = phone;
    }
    
    public int getPhone (){
        return this.phone;
    }
    
}
