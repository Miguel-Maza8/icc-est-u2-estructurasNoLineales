package structures.trees.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import structures.node.Node;
import structures.trees.BinaryTree;

public class ListLevels {
    public List<List<Node<Integer>>> listLevels(Node<Integer> actual) {
        List<List<Node<Integer>>> resultado = new ArrayList<>();

        if (actual == null) {
               return resultado; 
        }
        Queue<Node<Integer>> cola = new LinkedList<>();
        cola.add(actual);

        while (!cola.isEmpty()){
            int cantidad = cola.size();
            List<Node<Integer>> nivel = new ArrayList<>();
            for(int i = 0; i< cantidad; i++){
                Node<Integer> nodo = cola.poll();
                nivel.add(nodo);
                if ( nodo.getLeft() != null){
                    cola.add(nodo.getLeft());
                }
                if (nodo.getRigtht() != null){
                    cola.add(nodo.getRigtht());
                }
            }
            resultado.add(nivel);
        }
        return resultado;
    }
    
    public void printTree(List<List<Node<Integer>>> print){
        int level = 0;
        for(List<Node<Integer>> nivel : print){
            System.out.print("Nivel " + level + ": ");
            for(int i = 0; i< nivel.size(); i++){
                if(i == nivel.size()-1 || nivel.size()==1){
                   System.out.println(nivel.get(i).getValue());

                }else{
                    System.out.print(nivel.get(i).getValue()+ "--> ");
                }
            }
            level++;
        }

    }


    public void insert(int[] numeros){
        //CREAR EL ARBOL DE ENTEROS 

        BinaryTree<Integer> tree = new BinaryTree<>();
        
        //INSERTAR CADA NUMERO
    
     for ( int numero : numeros ){
        tree.add(numero);
     }
     
     
       //INVERTIR EL ARBOL
     
       printTree(listLevels(tree.getRoot()));
       
 
}



}
