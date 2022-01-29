package estruturadedados.listasencadeadas;



public class Main {
    public static void main(String[] args) {

        LinkedLists<String> myLinkedList = new LinkedLists<>();

        myLinkedList.add("teste 1");
        myLinkedList.add("teste 2");
        myLinkedList.add("teste 3");
        myLinkedList.add("teste 4");


        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));



        System.out.println(myLinkedList);

        System.out.println(myLinkedList.remove(3)); //teste 4

        System.out.println(myLinkedList);

    }
}
