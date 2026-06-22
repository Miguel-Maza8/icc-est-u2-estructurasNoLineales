package structures.trees;

import structures.node.Node;

public class Ejercicio1 {
     
    
    public void printTree(Node<Integer> root){
        printlOrdenRecursivo(root, 0);
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

    public void insert(int[] numeros){
        //CREAR EL ARBOL DE ENTEROS 

        BinaryTree<Integer> tree = new BinaryTree<>();
        
        //INSERTAR CADA NUMERO
    
     for ( int numero : numeros ){
        tree.add(numero);
     }
     
     
       //IMPRIMIR EL ARBOL
     tree.inOrden(); 
     System.out.println("\nImpresion del arbol \n ");
     printTree(tree.getRoot());
    
     

    
       

    
    
}


}
