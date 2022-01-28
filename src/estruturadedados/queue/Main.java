package estruturadedados.queue;

public class Main {

    public static void main(String[] args) {

        Queue<String> myqueue = new Queue<>(); // a fila pode conter apenas Strings

        myqueue.enqueue(" First ");
        myqueue.enqueue(" Second ");
        myqueue.enqueue(" Third " );
        myqueue.enqueue( " 4 " ); // string

        System.out.println(myqueue);

        System.out.println(myqueue.dequeue()); // remove o primeiro nó

        System.out.println(myqueue);

        myqueue.enqueue(" Last "); // adiciona o ultimo atrás do quarto nó.

        System.out.println(myqueue);

        System.out.println(myqueue.first()); // second

        System.out.println(myqueue); // deve conter o second na fila
    }





}
