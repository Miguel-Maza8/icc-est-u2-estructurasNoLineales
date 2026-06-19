package structures.trees;

import models.Persona;
import structures.node.Node;

public class BinaryTree<T extends Comparable<T>> {
 
    private Node<T> root ;
    
    private int peso;

    public BinaryTree(Node<T> root, int peso) {
        this.root = root;
        this.peso = 0;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    //Constructor

    public void add(Persona value){
        Node<T> node = new Node<T>(value);
        root = addRecursivo(root, node);
    }
    //Preorden 


    private Node<T> addRecursivo(Node<T> actual, Node<T> nodeInsertar){
        if (actual == null) 
            
            return nodeInsertar;

        if ( actual.getValue().compareTo(nodeInsertar.getValue()) > 0){
           
            // IZQUIERDA
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
        }else {
            actual.setRigtht(addRecursivo(actual.getRigtht(), nodeInsertar));

        }


        
        return actual;
    }

    public void preOrden(){
        preOrdenRecursivo(root);
    }

    private void preOrdenRecursivo(Node<T> actual ) {
      if (actual == null){
        return;
      }
      System.out.println(actual + "");
      preOrdenRecursivo(actual.getLeft());
      preOrdenRecursivo(actual.getRigtht());



    }

    public void posOrden(){
        posOrdenRecursivo(root);
    }
    
    // IZQUIERDA -DERECHA-RAIZ
    private void posOrdenRecursivo(Node<T> actual ) {
      if (actual == null){
        return;
      }

      posOrdenRecursivo(actual.getLeft());
      posOrdenRecursivo(actual.getRigtht());
      System.out.println(actual + "");
    }
    
    public void inOrden(){
        inOrdenRecursivo(root);
    }
    
   
    private void inOrdenRecursivo(Node<T> actual ) {
      if (actual == null){
        return;
      }

      inOrdenRecursivo(actual.getLeft());
      System.out.println(actual + "");
      inOrdenRecursivo(actual.getRigtht());
      
    }
    

    public int getHeight(){
        return getHeightRecursivo(root);
    }

    private int getHeightRecursivo(Node<T> actual) {
        if ( actual == null)
            return 0;
        
        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRigtht());

        int masAlto = Math.max(heightLeft, heightRight);
        return masAlto + 1;
    }

    public int getWeigth(){
        return getWeigthRecursivo(root);
    }

    private int getWeigthRecursivo(Node<T> actual) {
        if ( actual == null)
            return 0;
        
        int heightLeft = getWeigthRecursivo(actual.getLeft());
        int heightRight = getWeigthRecursivo(actual.getRigtht());

        //int masAlto = Math.max(heightLeft, heightRight);

        return heightLeft + heightRight + 1;
    }
}