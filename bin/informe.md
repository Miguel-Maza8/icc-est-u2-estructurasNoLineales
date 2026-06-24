# Practica 4: Ejercicios de lógica con estructuras no lineales: árboles
## Datos del estudiante
- **Nombre:** Miguel Maza
- **Curso:** Computacion grupo 1
- **Fecha:** 23-06-2026

**Descripción:** Desarrollo de multiples ejercicios que involucran el uso de arboles binarios utlizando java con el objetivo de entender el funcionamiento de la estructura de datos (arboles).

## Ejercicio 01: Insertar en un Árbol Binario de Búsqueda
**Metodo insert**
```java
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

```
**Explicacion:** Este metodo instancia un arbol de enteros de tipo BinaryTree en el cual se inserta mediante un bucle for el arreglo de numeros recibido y finalmente lo imprime llamando al metodo puente el cual llama al metodo recursivo.

**Metodo Recursivo**
```java
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
```
**Explicacion:** Este metodo recursivo se encarga de imprimir el arbol binario de lado, el metodo recibe como parametros el nodo actual y el nivel del arbol, si el nodo no es nulo se termina la recursion, luego primero recorre el subarbol derecho llamando al lado derecho del actual y sumando en 1 el nivel, dependiendo del nivel del arbol y con un ciclo for imprime los valores  agregando una tabulacion y finalmente recorre el subarbol izquierdo enviando los parametros del actual izquierdo y el nivel +1 . El recorrido es similar a in-Orden pero enves de recorrer de izquierda-raiz-derecha lo hace de derecha-raiz-izquierda, es por eso que al llamar al metodo recursivo primero le enviamos el valor de la derecha del actual con getRigth() y le sumamos 1 al nivel.

**Salida en consola con diferentes casos**

```text

Imput:
5 ,3 ,7 ,2 ,4 ,6 ,8 ,

Output:
 
                8
        7
                6
5
                4
        3
                2
```
**Arbol Vacio**
```text

Imput:


Output:
 
```
**Con un solo nodo**

```text

--Con un solo nodo-- 


Imput:
6 ,

Output:
 
6
 
```
**Con nodos solo a la izquierda**

```text
Imput:
6 ,4 ,3 ,1 ,

Output:
 
6
        4
                3
                        1

 
```
## Ejercicio 02: Invertir un Árbol Binario

**Metodo invertTree**

```java
public Node<Integer>  invertTree(Node<Integer> root){
        System.out.println("\n Input :\n");
        printlTreeRecursivo(root, 0);

        invertTreeRecursivo(root);
        System.out.println("\n Ouput:\n");
        printlTreeRecursivo(root,0);
        return root;

    }
```
**Explicacion:** El metodo se encarga de hacer puente con la clase invertTreeRecursion y el printTreeRecursivo primero se invierten los nodos y luego lo imprimimos.

**Metodo recursivo**

```java

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

```
**Explicacion:** Este metodo recursivo se encarga de invertir un arbol binario lo que significa intercambiar el hijo izquierdo y el hijo derecho de cada nodo, recibe como parametros el nodo actual  y  pregunta si el actual es nulo, si esto se cumple nos retorna null y si no continua a la recursion este seria el caso base que se encarga de terminar con la recursion. Luego se crea un nodo auxiliar con el valor izquierdo del actual para poder setear el valor derecho en el izquierdo sin perder el valor izquierdo para poder seteralo en el derecho. Luego se vuelve a llamar al metodo para invertir el subarbol izquiedo y derecho al final nos retornara la raiz del arbol.

**Salida en consola con diferentes casos**

```text
----Ejercicio 2---


Arbol con varios niveles


 Input :

                8
        7
                6
5
                4
        3
                2

 Ouput:

                2
        3
                4
5
                6
        7
                8

```
**Arbol Vacio**

```text
Arbol vacio


 Input :


 Ouput:

```
**Arbol con un solo nodo**

```text
Arbol con un solo nodo


 Input :

1

 Ouput:

1
 
```

**Arbol con nodos hacia la derecha**

```text
 Arbol con nodos hacia la derecha


 Input :

                        80
                70
        60
50

 Ouput:

50
        60
                70
                        80
 
```

## Ejercicio 03: Listar Niveles en Listas Enlazadas

**Metodo listLevels**

```java
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

```
**Explicacion:** Este metodo hace un recorrido por niveles donde cada nivel representa una lista enlazada. El metodo recibe como parametro el nodo actual luego instancia una lista de tipo ArrayList en donde se guardaran los resultados, el caso base se aplica cuando el actual sea nulo retornandonos el resultado se instancia una cola y le agregamos el actual luego mediante un ciclo while toma todos los nodos de un nivel , lo proceso uno por uno, guarda los hijos para el siguiente nivel y guarda cada nivel en una lista final.

**Metodo de impresion**

```java
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
```
Este metodo se encarga de imprimir los niveles segun el formato establecido, mediante un ciclo for anidado.

**Salida en consola con diferentes casos**

```text
---Ejercicio3---


Arbol con varios niveles

Nivel 0: 5
Nivel 1: 3--> 7
Nivel 2: 2--> 4--> 6--> 8

```
**Arbol con un solo nodo**

```text
Arbol con un solo nodo

Nivel 0: 1

```
**Arbol con nodos hacia la derecha**

```text
Arbol con nodos hacia la derecha

Nivel 0: 50
Nivel 1: 60
Nivel 2: 70
Nivel 3: 80

```
## Ejercicio 04:  Calcular la Profundidad Máxima

**Metodo maxDepth**

```java
public int maxDepth (Node<Integer> root){
    if(root == null){
        return 0 ;
    }

    int left = maxDepth(root.getLeft());
    int rigtht = maxDepth(root.getRigtht());

    return Math.max(left, rigtht) +1;
}

```
**Explicacion:** El metodo se recibe como parametros la raiz del arbol y nos retorna un valor entero que representa la profundidad maxima, si el nodo es nulo nos retorna un produndidad de 0 y luego calculamos mediante la recursividad 
la profundidad maxima del subarbol izuierdo y derecho, estos datos se guardaran en dos variables de tipo entero para con estos retornar cual de los dos es el mayor mediante el math.max sumando +1 .

**Salida en consola con diferentes casos**

```text
Arbol con varios nodos

                8
        7
                6
5
                4
        3
                2

Profundidad maxima: 3

```
**Arbol con un solo nodo**

```text

Arbol con un solo nodo

1

Profundidad maxima: 1
Profundidad maxima: 3

```
**Arbol vacio**

```text

Arbol vacio


Profundidad maxima: 0

```
**Arbol con nodos hacia la derecha**

```text

Arbol con nodos hacia la derecha

                        80
                70
        60
50
        30
                25

Profundidad maxima: 4

```
**Main**


```java
private static void runEjercicios() {
      //EJERCICIO 1
       InsertBSTTest ejercicio1 = new InsertBSTTest();
       System.out.println("\n---Ejercicio1---\n");
       int[] numeros = new int[] {5,3,7,2,4,6,8};
       ejercicio1.insert(numeros);
       // Vacio 
       int[] n = new int[]{};
       ejercicio1.insert(n);
       // Un solo nodo
       System.out.println("\n--Con un solo nodo-- \n");
       int[] n2 = new int[]{6};
       ejercicio1.insert(n2);
       // Varios niveles 
       System.out.println("\n--Con varios niveles--\n");
       int[] n3  = new int[]{6,5,8,7};
       ejercicio1.insert(n3);
       System.out.println();
       // Con nodos solo al la izquierda
       System.out.println("\nCon nodos solo a la iquierda\n");
       int[] n4  = new int[]{6,4,3,1};
       ejercicio1.insert(n4);
       System.out.println();

       // EJERCICIO 2 
       InvertBinaryTree ejercicio2 = new InvertBinaryTree();
       System.out.println("\n----Ejercicio 2---\n");
       System.out.println("\nArbol con varios niveles\n");
       int[] numeros2 = new int[] { 5,3,7,2,4,6,8};
       ejercicio2.insert(numeros2);
       System.out.println("\nArbol vacio\n");
       int[] nI3 = new int[] { };
       ejercicio2.insert(nI3);
       System.out.println("\nArbol con un solo nodo\n");
       int[] nI4 = new int[] {1 };
       ejercicio2.insert(nI4);
       System.out.println("\nArbol con nodos hacia la derecha\n");
       int[] nI5 = new int[] { 50,60,70,80};
       ejercicio2.insert(nI5);
       
       //EJERCICIO 3
       ListLevels ejercicio3 = new ListLevels();
       int[] numeros3 = new int[] { 5,3,7,2,4,6,8};
       System.out.println("\n---Ejercicio3---\n");
       System.out.println("\nArbol con varios niveles\n");
       ejercicio3.insert(numeros3);
       
       System.out.println("\nArbol vacio\n");
       int[] nL3 = new int[] { };
       ejercicio3.insert(nL3);
       System.out.println("\nArbol con un solo nodo\n");
       int[] nL4 = new int[] {1 };
       ejercicio3.insert(nL4);
       System.out.println("\nArbol con nodos hacia la derecha\n");
       int[] nL5 = new int[] { 50,60,70,80};
       ejercicio3.insert(nL5);


       //EJERCICIO 4
       Depth ejercicio4 = new Depth();
       int[] numeros4 = new int[] { 5,3,7,2,4,6,8};
       System.out.println("\n---Ejercicio 3---\n");
       System.out.println("\nArbol con varios nodos\n");
       ejercicio4.insert(numeros4);
       System.out.println("\nArbol vacio\n");
       int[] nP3 = new int[] { };
       ejercicio4.insert(nP3);
       System.out.println("\nArbol con un solo nodo\n");
       int[] nP4 = new int[] {1 };
       ejercicio4.insert(nP4);
       System.out.println("\nArbol con nodos hacia la derecha\n");
       int[] nP5 = new int[] { 50,60,70,80,30,25};
       ejercicio4.insert(nP5);
    }

```
**Enlace al repositorio:**  https://github.com/Miguel-Maza8/icc-est-u2-estructurasNoLineales.git

