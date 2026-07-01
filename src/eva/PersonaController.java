package eva;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class PersonaController {
    public Set<Persona> filtrarYOrdenar (List<Persona> personas , int edadUmbral){   //Filtra si llegaron 10000 debo filtrar las personasa mayores a 18
          Set<Persona> perosnasFiltradas  = new TreeSet<>((p1 ,p2) -> { 
            int compE = Integer.compare(p2.getEdad(), p1.getEdad());

            if (compE  != 0 && p1.getNombre().equalsIgnoreCase(p2.getNombre())  ){

                return compE;
            }

            int comN = p1.getNombre().compareToIgnoreCase(p2.getNombre());
            return comN;
          }); 
          for ( Persona persona : personas){
            if(persona.getEdad()> edadUmbral){
                perosnasFiltradas.add(persona);
            }
              
          }
          return perosnasFiltradas;
          
          
          
          //Que quiera un orden tree si quiero que no se dupliquen has
    }
    public Map<String,Set<String>> agruparPorEdad (List<Persona> persona ){
     String nombre = "Juan Perez";
     nombre.split("");
     
     //Significa que lo divide donde encuentre espacios , e , o letras //Nos devuelve un arreglo de strings ["Juan", "Perez"]
     //String primerNombre = palabras[0];
     String pNombre = nombre.split(" ")[0];
     return null;
    }
}
