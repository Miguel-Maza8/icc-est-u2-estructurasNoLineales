package structures.trees.Ejercicio_04_depth;

import structures.node.Node;
import structures.trees.BinaryTree;

public class Depth {

    
    public void insert(int[] numeros){
        //CREAR EL ARBOL DE ENTEROS 

        BinaryTree<Integer> tree = new BinaryTree<>();
        
        //INSERTAR CADA NUMERO
    
     for ( int numero : numeros ){
        tree.add(numero);
     }
     
     
       //INVERTIR EL ARBOL
     
       printTree(tree.getRoot());
       System.out.println();
       System.out.println("Profundidad maxima: " + maxDepth(tree.getRoot()));
       System.out.println();
       
 
}

public int maxDepth (Node<Integer>root){
    if(root == null){
        return 0 ;
    }

    int left = maxDepth(root.getLeft());
    int rigtht = maxDepth(root.getRigtht());

    return Math.max(left, rigtht) +1;
}
   public void printTree(Node<Integer> root){
        printlTreeRecursivo(root, 0);
    }
   private void printlTreeRecursivo( Node<Integer> actual, int nivel) {
      if (actual == null){
         return ;
      }
      
      printlTreeRecursivo(actual.getRigtht(), nivel +1);

       for(int i = 0;  i < nivel; i++){
            System.out.print("\t");
        }
      System.out.println(actual.getValue());

      printlTreeRecursivo(actual.getLeft(), nivel +1 );
      
      
    }
}
