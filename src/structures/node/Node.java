package structures.node;

import models.Persona;

public class Node<T> {
    private T value ;
    private Node<T> left;
    private Node<T> rigtht;

    //CREO UN NODO
    //INSTANCIO EL NODE -> Constructor
    // tiene que crearse con el valor 

    public Node(T value){
        this.value= value;
        this.left = null;
        this.rigtht= null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRigtht() {
        return rigtht;
    }

    public void setRigtht(Node<T> rigtht) {
        this.rigtht = rigtht;
    }

    @Override
    public String toString() {
        return "Node [" + value + "]";
    }
    
    
    
}
