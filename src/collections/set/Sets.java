package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {

    public Sets() {
    }
    
    public Set<String> construirHashSet(){
            Set<String> hashSet = new HashSet<>(); //No garantiza un orden y no permite valores duplicados (HashSet)
            hashSet.add("A");
            hashSet.add("B");                  //Se usa si no se necesita un orden a lo largo de la ejecucion 
            hashSet.add("C");
            hashSet.add("D");
            hashSet.add("E");
            hashSet.add("F");
            hashSet.add("A");
            hashSet.add("B");
            hashSet.add("C");
            hashSet.add("A");
            hashSet.add("D");
            hashSet.add("E");
            hashSet.add("F");
            hashSet.add("1Ggggggeegeg");
            hashSet.add("2G2gggggeegeg");
            hashSet.add("3Gggggeegeg");
            hashSet.add("4Ggggggeegeg");
            hashSet.add("5Ggggggeegeg");
            hashSet.add("5Ggggggeegeg");
            hashSet.add("6Ggggggeegeg");
            hashSet.add("G7gggggeegeg");
            return hashSet;



    }

    public Set<String> construirLinkedHashSet(){
         Set<String> lSet = new LinkedHashSet<>();  //Ademas de implemendtar el hashSet implementa el linked que es una coleccion basada en nodos que conocen donde se ubican loas s
                                                     //siguientes nodos mediante referencias hacia adelante y atras.
            lSet.add("A");                                     
            lSet.add("B");                  
            lSet.add("C");
            lSet.add("D");
            lSet.add("E");
            lSet.add("F");
            lSet.add("A");
            lSet.add("B");
            lSet.add("C");
            lSet.add("A");
            lSet.add("D");
            lSet.add("E");
            lSet.add("F");
            lSet.add("1Ggggggeegeg");
            lSet.add("2G2gggggeegeg");
            lSet.add("3Gggggeegeg");
            lSet.add("4Ggggggeegeg");
            lSet.add("5Ggggggeegeg");
            lSet.add("5Ggggggeegeg");
            lSet.add("6Ggggggeegeg");
            lSet.add("G7gggggeegeg");
            return lSet;
    }

   
    public Set<String> construirTree(){  



          Set<String> lSet = new TreeSet<>();

            lSet.add("A");                                     
            lSet.add("B");                  
            lSet.add("C");
            lSet.add("D");
            lSet.add("E");
            lSet.add("F");
            lSet.add("A");
            lSet.add("B");
            lSet.add("C");
            lSet.add("A");
            lSet.add("D");
            lSet.add("E");
            lSet.add("F");
            lSet.add("1Ggggggeegeg");
            lSet.add("2G2gggggeegeg");
            lSet.add("3Gggggeegeg");
            lSet.add("4Ggggggeegeg");
            lSet.add("5Ggggggeegeg");
            lSet.add("5Ggggggeegeg");
            lSet.add("6Ggggggeegeg");
            lSet.add("G7gggggeegeg");
            return lSet;
    }
    
    public Set<Contacto> construirHasSetContacto(){
        Set<Contacto> hCSet = new HashSet<>();
        Contacto c1 = new Contacto("Juan", "Perez", "123456789");
        Contacto c2 = new Contacto("Juan", "Perez", "123456789");
        Contacto c3 = new Contacto("Ana", "Gomez", "987654321");
        Contacto c4 = new Contacto("Pedro", "Lopez", "456789123");
        Contacto c5 = new Contacto("Maria", "Rodriguez", "78912356");
        Contacto c6 = new Contacto("Juan", "Perez", "123456789");       // Duplicado, no se agregará
        Contacto c7 = new Contacto("Juan", "Lopez", "123456789");
        
        System.out.println(c1.hashCode());
        System.out.println(c5.hashCode());
        hCSet.add(c1);
        hCSet.add(c2);
        hCSet.add(c3);
        hCSet.add(c4);
        hCSet.add(c5);
        hCSet.add(c6);
        hCSet.add(c7);


        return hCSet;
    }

public Set<Contacto> construirTreeSetContacto(){
    Set<Contacto> tCSet  = new TreeSet<>((c1,c2)-> {             //Sirve para comparar 2 formas 
        int compN =  c1.getNombre().compareTo(c2.getNombre());
        if (compN != 0)
            return compN;
        int compA = c1.getApellido().compareTo(c2.getApellido());
        return compA;
    });
        tCSet.add(new Contacto("Juan", "Perez", "123456789"));
        tCSet.add(new Contacto("Ana", "Gomez", "987654321"));
        tCSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        tCSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        tCSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado, no se agregará
        tCSet.add(new Contacto("Juan", "Lopez", "123456789"));
        return tCSet;
}
}

