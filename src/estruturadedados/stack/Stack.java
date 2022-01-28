package estruturadedados.stack;

public class Stack {

    private Node refNodeEntraceStack;

    public Stack() {

        this.refNodeEntraceStack = null; // quando instancio um nó, sua referência é nula
    }

    // acrescenta um novo valor a pilha
    public void push(Node newNode){
        Node  refAuxNode = refNodeEntraceStack;  // quarda a referência do topo da pilha.
        refNodeEntraceStack = newNode;   // a referência da pilha passa ser o novo nó recebido, novo TOPO.
        refNodeEntraceStack.setRefNo(refAuxNode);    // o apontamento, ou referencia ao nó de baixo, passar a ser o antigo TOPO.
    }

    // exclui o primeiro elemento da pilha
    public Node pop() {
        if(!this.isEmpty()){ // executa o código se a pilha não estiver vazia
            Node noPoped = refNodeEntraceStack; // nó retirado
            refNodeEntraceStack = refNodeEntraceStack.getRefNo(); // passa a referencia de TOPO da pilha para o no seguinte, no caso o nó de baixo.
            return noPoped;
        }
        return null;
    }



    // esse método retorta a referência do TOPO da pilha
    public  Node top(){
        return refNodeEntraceStack;

    }

    public boolean isEmpty() {
        return refNodeEntraceStack == null ? true : false;
    }



    // FUnção para mostrar o Nó.
    @Override
    public String toString() {
        String stringReturn = "____________________\n";
        stringReturn += "        Pilha\n";
        stringReturn += "____________________\n";

        // utiliza o Nó de referência para percorrer a pilha e dar um println
        Node nodeAssistant  = refNodeEntraceStack;

        while (true){
            if (nodeAssistant != null){
                stringReturn += "[No {dado = " + nodeAssistant.getDado() +"}]\n";
                nodeAssistant = nodeAssistant.getRefNo(); // o RefNo() recebe a referÊncia do nó seguinte, imprimindo o nó seguinte da pilha. (no caso ele mesmo agora.)

            } else {
                break;
            }
        }
        stringReturn += "====================\n";
        return stringReturn;
    }
}
