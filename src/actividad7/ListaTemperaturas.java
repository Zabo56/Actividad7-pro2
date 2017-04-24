/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class ListaTemperaturas {
    private final HashMap<String, Double> ciudad;

    public ListaTemperaturas() {
        ciudad = new HashMap();
    }
    
    public void inserta(String c, Double t){
        
        ciudad.put(c, t);
   
    }
    
    public double get(String c){
                
        return ciudad.get(c);
    }
    
    public String getCiudades(){
        StringBuilder toret = new StringBuilder();
        
        for(String key: ciudad.keySet()){
            toret.append("\n"+ key);
        }
        
        return toret.toString();
    }
    
    public String toString(){
        StringBuilder toret = new StringBuilder();
        
        for(String key: ciudad.keySet()){
            toret.append("\n"+ key +": "+ ciudad.get(key) +"º"); 
        }
        
        return toret.toString();
    }
    //
    
    
}
