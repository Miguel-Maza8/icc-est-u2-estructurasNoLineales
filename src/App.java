import models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.IntTree;

  public class App {
    public static void main(String[] args) throws Exception {
       runIntTree();
       //runBinaryTree();

       runEjercicios();
        // IntTree arbolNumeros = new IntTree();
        // arbolNumeros.add(50);
        // arbolNumeros.add(10);
        // arbolNumeros.add(30);
        // arbolNumeros.add(60);
        // arbolNumeros.add(70);
        // arbolNumeros.add(55);
        // System.out.println("Preorden");
        // arbolNumeros.preOrden();
        // System.out.println("Posorden");
        // arbolNumeros.posOrden();
        // System.out.println("inOrden");
        // arbolNumeros.inOrden();
        // System.out.print("Altura = ");
        // int altura = arbolNumeros.getHeight();
        // System.out.println(altura);
        // System.out.print("Peso = ");
        // int peso = arbolNumeros.getWeigth();
        // System.out.println(peso);


    }
  

     private static void runEjercicios() {
       Ejercicio1 ejercicio1 = new Ejercicio1();
       int[] numeros = new int[] {5,3,7,2,4,6,8};
       System.out.println("in-orden");
       ejercicio1.insert(numeros);
       
    
       
    }

     
    //  private static void runBinaryTree() {
    //   BinaryTree<String> arbolString = new BinaryTree<>();
    //   BinaryTree<Persona> arbolPersonas = new BinaryTree<>();
    //   arbolPersonas.add(new Persona("Miguel",2));
    //   arbolPersonas.add(new Persona("Maria", 30));
    //   arbolPersonas.add(new Persona("Pedro", 20));
    //   arbolPersonas.add(new Persona("Ana", 35));
    //   System.out.println("Arbol Personas");
    //   arbolPersonas.preOrden();
    // }


     private static void runIntTree() {
        
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
       
       
       
}


}
