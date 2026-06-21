package structures.trees;

import structures.node.Node;

//Clase de arbol de solo enteros

public class IntTree {
    
    private Node<Integer> root;
    private int peso;
    //Constructor

    public IntTree() {
        this.root = null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root, int peso) {
        this.root = root;
        this.peso = peso;
    }
    
     public void setRoot(Integer value){
        Node<Integer> node = new Node<Integer>(value);
        this.root = node;
        

    }
    public void add(int value){
        Node<Integer> node = new Node<Integer>(value);
        root = addRecursivo(root, node);
        peso++;
    }
    //Preorden 


    private Node<Integer> addRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar){
        if (actual == null) 
            
            return nodeInsertar;

        if ( actual.getValue() > nodeInsertar.getValue()){
           
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

    private void preOrdenRecursivo(Node<Integer> actual ) {
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
    private void posOrdenRecursivo(Node<Integer> actual ) {
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
    
   
    private void inOrdenRecursivo(Node<Integer> actual ) {
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

    private int getHeightRecursivo(Node<Integer> actual) {
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

    private int getWeigthRecursivo(Node<Integer> actual) {
        if ( actual == null)
            return 0;
        
        int heightLeft = getWeigthRecursivo(actual.getLeft());
        int heightRight = getWeigthRecursivo(actual.getRigtht());

        //int masAlto = Math.max(heightLeft, heightRight);

        return heightLeft + heightRight + 1;
    }
}
