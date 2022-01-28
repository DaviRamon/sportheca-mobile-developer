package estruturadedados.queue;

public class Main {

    public static void main(String[] args) {

        Queue myqueue = new Queue();

        myqueue.enqueue(new Node(" First "));
        myqueue.enqueue(new Node(" Second "));
        myqueue.enqueue(new Node(" Third "));
        myqueue.enqueue(new Node(" Four "));

        System.out.println(myqueue);

        System.out.println(myqueue.dequeue()); // remove o primeiro nó

        System.out.println(myqueue);

        myqueue.enqueue(new Node(" Last ")); // adiciona o ultimo atrás do quarto nó.

        System.out.println(myqueue);

        System.out.println(myqueue.first()); // second

        System.out.println(myqueue); // deve conter o second na fila
    }





}
