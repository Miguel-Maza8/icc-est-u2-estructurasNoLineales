package structures.trees.Ejercicio_02_invert;

import structures.node.Node;
import structures.trees.BinaryTree;

public class InvertBinaryTree {
    

   public Node<Integer>  invertTree(Node<Integer> root){
        System.out.println("\n Input :\n");
        printlTreeRecursivo(root, 0);

        invertTreeRecursivo(root);
        System.out.println("\n Ouput:\n");
        printlTreeRecursivo(root,0);
        return root;

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
    
    public Node<Integer> invertTreeRecursivo(Node<Integer> actual) {
        if ( actual == null){
            return null;
        }
        Node<Integer> aux = actual.getLeft();
        actual.setLeft(actual.getRigtht());
        actual.setRigtht(aux);
        invertTreeRecursivo(actual.getLeft());
        invertTreeRecursivo(actual.getRigtht());
        return actual;
    }

    public void insert(int[] numeros){
        //CREAR EL ARBOL DE ENTEROS 

        BinaryTree<Integer> tree = new BinaryTree<>();
        
        //INSERTAR CADA NUMERO
    
     for ( int numero : numeros ){
        tree.add(numero);
     }
     
     
       //INVERTIR EL ARBOL
     
       invertTree(tree.getRoot());
    
}

  
}
