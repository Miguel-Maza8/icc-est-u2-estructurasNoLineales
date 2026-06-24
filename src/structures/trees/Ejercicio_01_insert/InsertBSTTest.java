package structures.trees.Ejercicio_01_insert;

import structures.node.Node;
import structures.trees.BinaryTree;

public class InsertBSTTest {
     
    
    public void printTree(Node<Integer> root){
        printlOrdenRecursivo(root, 0);
    }
    
    public void printEntrada(int[] numero){
      System.out.println("\nImput:");
      
      for(int n : numero ) {

         System.out.print(n + " ,");
         

      }
      System.out.println();
    }

      
    
   
    private void printlOrdenRecursivo( Node<Integer> actual, int nivel) {
      if (actual == null){
         return ;
      }
      
      printlOrdenRecursivo(actual.getRigtht(), nivel +1);
       for(int i = 0;  i < nivel; i++){
            System.out.print("\t");
        }
      System.out.println(actual.getValue());

      printlOrdenRecursivo(actual.getLeft(), nivel +1 );
      
      
    }

    public Node<Integer> insert(int[] numeros){
        //CREAR EL ARBOL DE ENTEROS 

        BinaryTree<Integer> tree = new BinaryTree<>();
        
        //INSERTAR CADA NUMERO
    
        for ( int numero : numeros ){
        tree.add(numero);
         }
     
     
       //IMPRIMIR EL ARBOL
        printEntrada(numeros);
        System.out.println("\nOutput:\n ");
        printTree(tree.getRoot());
        return tree.getRoot(); 
      }


}
