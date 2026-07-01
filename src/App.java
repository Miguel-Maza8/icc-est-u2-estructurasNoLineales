import java.util.Set;

import collections.maps.Maps;
import collections.set.Sets;
import models.Contacto;
import models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio_01_insert.*;
import structures.trees.Ejercicio_02_invert.InvertBinaryTree;
import structures.trees.Ejercicio_03_listLeves.ListLevels;
import structures.trees.Ejercicio_04_depth.Depth;
import structures.trees.IntTree;

  public class App {
    public static void main(String[] args) throws Exception {
      // runIntTree();
      // runBinaryTree();
      runSet();
      runMap();
      

       //runEjercicios();
    //     IntTree arbolNumeros = new IntTree();
    //     arbolNumeros.add(50);
    //     arbolNumeros.add(10);
    //     arbolNumeros.add(30);
    //     arbolNumeros.add(60);
    //     arbolNumeros.add(70);
    //     arbolNumeros.add(55);
    //     System.out.println("Preorden");
    //     arbolNumeros.preOrden();
    //     System.out.println("Posorden");
    //     arbolNumeros.posOrden();
    //     System.out.println("inOrden");
    //     arbolNumeros.inOrden();
    //     System.out.print("Altura = ");
    //     int altura = arbolNumeros.getHeight();
    //     System.out.println(altura);
    //     System.out.print("Peso = ");
    //     int peso = arbolNumeros.getWeigth();
    //     System.out.println(peso);


    }
    
    

    private static void runMap() {
        Maps mapa = new Maps();
        System.out.println("\n---Maps---\n");
        mapa.costruirHashMap();
        mapa.cLinkedHashMap();
        mapa.cTreeMap();
    }



    private static void runSet() {
      Sets sets = new Sets();

      //Implementacion -> HashSet hascode 
      System.out.println("\n---HashCode---\n");
      Set<String> hashSet = sets.construirHashSet();
      System.out.println(hashSet);
      System.out.println("Size ="+ hashSet.size());
      System.out.println(hashSet.contains("F"));
      

      //Implementacion -> LindedHashSet hashcode 
       System.out.println("\n---LinkedHashCode---\n");
      Set<String> lSet = sets.construirLinkedHashSet();
      System.out.println(lSet);
      System.out.println("Size ="+ lSet.size());
      System.out.println(lSet.contains("F"));

      //Implementacion -> TreeSet hashcode 
       System.out.println("\n---TreeSet---\n");
      Set<String> tSet = sets.construirTree();
      System.out.println(tSet);
      System.out.println("Size ="+ tSet.size());
      System.out.println(tSet.contains("F"));
      
      //Implementacion -> Hash Contacto hashcode 
       System.out.println("\n---Hash Contacto Set---\n");
      Set<Contacto> cSet = sets.construirHasSetContacto();
      System.out.println(cSet);
      System.out.println("Size ="+ cSet.size());
      
       //Implementacion -> Tree Contacto  Set hashcode 
       System.out.println("\n---Tree Contacto Set---\n");
       Set<Contacto> tcSet = sets.construirTreeSetContacto();
       System.out.println(tcSet);
       System.out.println("Size ="+ tcSet.size());
    }
  
     
    //  private static void runEjercicios() {
    //   //EJERCICIO 1
    //    InsertBSTTest ejercicio1 = new InsertBSTTest();
    //    System.out.println("\n---Ejercicio1---\n");
    //    int[] numeros = new int[] {5,3,7,2,4,6,8};
    //    ejercicio1.insert(numeros);
    //    // Vacio 
    //    int[] n = new int[]{};
    //    ejercicio1.insert(n);
    //    // Un solo nodo
    //    System.out.println("\n--Con un solo nodo-- \n");
    //    int[] n2 = new int[]{6};
    //    ejercicio1.insert(n2);
    //    // Varios niveles 
    //    System.out.println("\n--Con varios niveles--\n");
    //    int[] n3  = new int[]{6,5,8,7};
    //    ejercicio1.insert(n3);
    //    System.out.println();
    //    // Con nodos solo al la izquierda
    //    System.out.println("\nCon nodos solo a la iquierda\n");
    //    int[] n4  = new int[]{6,4,3,1};
    //    ejercicio1.insert(n4);
    //    System.out.println();

    //    // EJERCICIO 2 
    //    InvertBinaryTree ejercicio2 = new InvertBinaryTree();
    //    System.out.println("\n----Ejercicio 2---\n");
    //    System.out.println("\nArbol con varios niveles\n");
    //    int[] numeros2 = new int[] { 5,3,7,2,4,6,8};
    //    ejercicio2.insert(numeros2);
    //    System.out.println("\nArbol vacio\n");
    //    int[] nI3 = new int[] { };
    //    ejercicio2.insert(nI3);
    //    System.out.println("\nArbol con un solo nodo\n");
    //    int[] nI4 = new int[] {1 };
    //    ejercicio2.insert(nI4);
    //    System.out.println("\nArbol con nodos hacia la derecha\n");
    //    int[] nI5 = new int[] { 50,60,70,80};
    //    ejercicio2.insert(nI5);
       
    //    //EJERCICIO 3
    //    ListLevels ejercicio3 = new ListLevels();
    //    int[] numeros3 = new int[] { 5,3,7,2,4,6,8};
    //    System.out.println("\n---Ejercicio3---\n");
    //    System.out.println("\nArbol con varios niveles\n");
    //    ejercicio3.insert(numeros3);
       
    //    System.out.println("\nArbol vacio\n");
    //    int[] nL3 = new int[] { };
    //    ejercicio3.insert(nL3);
    //    System.out.println("\nArbol con un solo nodo\n");
    //    int[] nL4 = new int[] {1 };
    //    ejercicio3.insert(nL4);
    //    System.out.println("\nArbol con nodos hacia la derecha\n");
    //    int[] nL5 = new int[] { 50,60,70,80};
    //    ejercicio3.insert(nL5);


    //    //EJERCICIO 4
    //    Depth ejercicio4 = new Depth();
    //    int[] numeros4 = new int[] { 5,3,7,2,4,6,8};
    //    System.out.println("\n---Ejercicio 3---\n");
    //    System.out.println("\nArbol con varios nodos\n");
    //    ejercicio4.insert(numeros4);
    //    System.out.println("\nArbol vacio\n");
    //    int[] nP3 = new int[] { };
    //    ejercicio4.insert(nP3);
    //    System.out.println("\nArbol con un solo nodo\n");
    //    int[] nP4 = new int[] {1 };
    //    ejercicio4.insert(nP4);
    //    System.out.println("\nArbol con nodos hacia la derecha\n");
    //    int[] nP5 = new int[] { 50,60,70,80,30,25};
    //    ejercicio4.insert(nP5);
    // }

     
    // //   private static void runBinaryTree() {
    // //    BinaryTree<String> arbolString = new BinaryTree<>();
    // //    BinaryTree<Persona> arbolPersonas = new BinaryTree<>();
    // //    arbolPersonas.add(new Persona("Miguel",2));
    // //    arbolPersonas.add(new Persona("Maria", 30));
    // //    arbolPersonas.add(new Persona("Pedro", 20));
    // //    arbolPersonas.add(new Persona("Ana", 35));
    // //    System.out.println("Arbol Personas");
    // //    arbolPersonas.preOrden();
    // //  }


    // private static void runIntTree() {
        
    //    IntTree arbolNumero = new IntTree();
    //    Node<Integer> node1 = new Node(50);
    //    Node<Integer> node2 = new Node(10);
    //    Node<Integer> node3 = new Node(30);
       

      // IntTree arbolNumeros = new IntTree();
      //   arbolNumeros.add(50);
      //   arbolNumeros.add(10);
      //   arbolNumeros.add(30);
      //   arbolNumeros.add(60);
      //   arbolNumeros.add(75);
      //   arbolNumeros.add(55);


      //   System.out.println("Preorden");
      //   arbolNumeros.preOrden();
      //   System.out.println("Posorden");
      //   arbolNumeros.posOrden();
      //   System.out.println("inOrden");
      //   arbolNumeros.inOrden();

    //    arbolNumero.setRoot(node1);
    //    node1.setRigtht(node2);
    //    node2.setLeft(node3);


    //    System.out.println(arbolNumero.getRoot());
    //    System.out.println(arbolNumero.getRoot().getLeft().getRigtht());
       
       
       
//}


}
  