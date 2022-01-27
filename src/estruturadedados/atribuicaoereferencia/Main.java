package estruturadedados.atribuicaoereferencia;

public class Main {

    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("IntA = " + intA + " intB = " + intB);
        intA =2;
        System.out.println("IntA = " + intA + " intB = " + intB); // continua atribuindo 1.

        Objeto objetoA = new Objeto(1);
        Objeto objetoB = objetoA;  // atribuo o valor de A em B // copia a referencia de memoria, aponta para o mesmo endereço de memória.
        System.out.println("objetoA = " + objetoA + "objetoB = " + objetoB);


        objetoA.setNum(2); // vai no endereço de memória e atribui o valor 2.   O dois objetos apontam para o mesmo valor de memória.
        System.out.println("objetoA = " + objetoA + "objetoB = " + objetoB);
    }
}
