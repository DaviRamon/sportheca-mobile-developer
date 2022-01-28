package estruturadedados.queue;

public class Queue {

    private Node refNodeFinalEntrance;


    // contrutor, ao instanciar a fila ela estará vazia.
    public Queue() {
        this.refNodeFinalEntrance = null;
    }



    // metodo que adiciona um novo nó na fila
    public void enqueue(Node newNode){
        newNode.setRefNode(refNodeFinalEntrance); // a referência do nó que entra na fila, é a referencia de entrada da fila, ou seja, null ou o utlimo nó da fila
        refNodeFinalEntrance = newNode; // a referência de entrada da fila passa a ser o novo nó, que agora é o ultimo nó.
    }


    // metodo que verifica quem é o primeiro elemento do nó da fila
    public Node first() {
        if(!this.isEmpty()){ // se a fila não está vazia...
            Node firstNode = refNodeFinalEntrance; // se há somente 1 nó na fila, ele referencia ele mesmo.

            // caso haja mais nós na fila ele vai verificando elemento por elemento até um deles apontar para null, indicando que é o primeiro da fila.
            while(true){
                if(firstNode.getRefNode() != null){ // verifica se a referência do proximo elemento que ele está no momento é diferente de nula.
                    firstNode = firstNode.getRefNode(); // caso não seja null, ele verifica o elemento da frente.

                }else{ // quando a referência do elemento da frente for null, ele para a verificação pois achou o primeiro elemento da fila.
                    break;
                }

            }

        }
        return null; // caso esteja vazia
    }



    // metodo que verifica  e remove o primeiro elemento da fila
    public Node dequeue() {
        if(!this.isEmpty()){ // se a fila não está vazia...
            Node firstNode = refNodeFinalEntrance; // se há somente 1 nó na fila, ele referencia ele mesmo.
            Node nodeAssistant = refNodeFinalEntrance; //  se o primeiro nó está em "i" elemento, o no assistente fica um elemento anterior. i -1

            // caso haja mais nós na fila ele vai verificando elemento por elemento até um deles apontar para null, indicando que é o primeiro da fila.
            while(true){
                if(firstNode.getRefNode() != null){ // verifica se a referência do proximo elemento que eles estã no monento é diferente de nula.
                    nodeAssistant = firstNode; // antes da verificação do nó passar para o elemento seguinte, ela é guardada em um nó auxiliar, elemento anterior.
                    firstNode = firstNode.getRefNode(); // caso não seja null, ele verifica o elemento da frente.

                }else{ // quando a referência do elemento da frente for null, ele para a verificação pois achou o primeiro elemento da fila.
                    nodeAssistant.setRefNode(null); // quando o primeiro nó é encontrado, a referência do no auxiliar, que antes era elemento anterior, passa a ser nulo.
                    break;
                }

            }
            return firstNode; // retorna o primeiro nó para ser deletado.
        }
        return null; // caso esteja vazia
    }


    // metodo que verifica se a fila está vazia.
    public boolean isEmpty() {
        return refNodeFinalEntrance == null ? true : false;
    }


    // função toString, para imprimir os valores
    @Override
    public String toString() {
        String stringReturn = ""; // inicia vazia.

        Node nodeAssistant = refNodeFinalEntrance;

        if(refNodeFinalEntrance != null){
            while(true){
                stringReturn += "[No{objeto = " + nodeAssistant.getObject() + "}]---> "; // imprime o no auxiliar

                if(nodeAssistant.getRefNode() != null){ //se há somente um elemento na fila..
                    nodeAssistant = nodeAssistant.getRefNode(); // o no auxiliar se torna o nó seguinte.

                } else { // quando chegar no primeiro elemento da fila ele aponta para nulo.
                    stringReturn += "null";
                    break;
                }
            }

        } else {
            stringReturn = "null";
        }



        return stringReturn;
    }





















}
