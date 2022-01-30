package estruturadedados.ringbuffer;

public class Main {
    public static void main(String[] args) {

        RingBuffer<String> myRingBuffer = new RingBuffer<>();

        myRingBuffer.add("c0");

        System.out.println(myRingBuffer);


        myRingBuffer.remove(0);
        System.out.println(myRingBuffer);

        myRingBuffer.add("c1");
        System.out.println(myRingBuffer);

        myRingBuffer.add("c2");
        myRingBuffer.add("c3");
        System.out.println(myRingBuffer);

//        System.out.println(myRingBuffer.get(0)); // indice 0 é a cauda
//        System.out.println(myRingBuffer.get(1));
//        System.out.println(myRingBuffer.get(2));
//        System.out.println(myRingBuffer.get(3)); // retorna pra cabeça da lista.
//        System.out.println(myRingBuffer.get(5));

        for(int i =0; i < 20; i++){
            System.out.println(myRingBuffer.get(i));
        }
}
}
