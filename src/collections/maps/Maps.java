package collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Contacto;



public class Maps {
    //Map<K,V>
    //Map >tipo de clave , tipo valor>
    //Map <String, integer>
    public Map<String, Integer > costruirHashMap(){
        Map<String,Integer> mapa = new HashMap<>(); //Hash significa que no guarda un orden 
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);  //Cuando un tipo de clave es igual solo se vuelve a actualizar la contraseña
        System.out.println(mapa.size());
        System.out.println(mapa);   //Para imprimir un diccionario

        for ( int i = 0 ; i< mapa.size() ; i++){
            System.out.println(mapa.values().toArray()[i]);   //Imrrimir solo los valores nos devuelve un arreglo
        }
        for (String key : mapa.keySet() ){
            System.out.println(key);      // Imprime las claves  nos devuelve un set 
        }
        System.out.println( mapa.get("A"));
        System.out.println( mapa.get("B"));
        System.out.println( mapa.get("F"));   //Cuando una llave no existe nos retorna null 
        

        mapa.putIfAbsent("F", 100);
        mapa.putIfAbsent("A", 200);
        System.out.println(mapa);
        return mapa;
    }

    public Map<String,Integer> cLinkedHashMap(){
        Map<String,Integer> mapa = new LinkedHashMap<>(); //Hash significa que no guarda un orden 
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);  //Cuando un tipo de clave es igual solo se vuelve a actualizar la contraseña
        System.out.println(mapa.size());
        System.out.println(mapa);
        return mapa;
    }
    public Map<String,Integer> cTreeMap(){
        Map<String,Integer> mapa = new TreeMap<>(); 
        mapa.put("J", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);      //Ordena en orden natural a las claves o keys en este caso String  
        mapa.put("A", 50);       // Se compara solo la primera letra en  caso de ser String 
        System.out.println(mapa.size());
        System.out.println(mapa);
        return mapa;
    }
    public Set<Contacto> ordenarUnicos(List<Contacto> contactos){
        return null;
        //Retornar contactos unicos ( ser unico retorna un set )
        //Unicos-> nombre 

       

        // Ordene segun el apellido de manera descendente 

    }
}
