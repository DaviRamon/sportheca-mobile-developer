package estruturadedados.listasencadeadas;

public class LinkedLists<T> {

    Node<T> entryReference;

    /* construtor, lista inicia vazia */
    public LinkedLists(){
        this.entryReference = null;
    }


    /* adiciona um elemento na lista*/
    public void add(T content){ // recebe um conteudo do tipo generico
        Node<T> newnode = new Node<>(content); // instancio um novo objeto generico
        if(this.isEmpty()){
            entryReference = newnode; // se vazio, a referencia de entrada é onovo nó
            return;
        }

        Node<T> assistantNode = entryReference;
        for(int i = 0; i < this.size()-1; i++ ){ //  quando chegar ao final da lista -1, encontra o nó auxiliar
            assistantNode= assistantNode.getNextNode();
        }
        assistantNode.setNextNode((newnode)); //adiciona o nó seguinte ao auxiliar como novo nó

    }


    // retorna o conteúdo do nó
    public T get(int index){
        return getNode(index).getContent();
    }


    // metodo interno que retorna o Nó.
    private Node<T> getNode(int index){

        validateIndex(index);  // chama o método de validação de indice
        Node<T> assistantNode = entryReference;
        Node<T> returnNode = null;

        for(int i = 0; i <= index; i++ ){
            returnNode = assistantNode; // antes de passar para o no seguinte ele armazena o valor
            assistantNode = assistantNode.getNextNode();
        }
        return returnNode;
    }


    /* retorna o tamanho da lista*/
    public int size(){
        int sizeList = 0;
        Node<T> assistantReference = entryReference;
        while(true){
            if(assistantReference != null){
                sizeList++;
                if(assistantReference.getNextNode() != null){
                    assistantReference = assistantReference.getNextNode();

                } else {
                    break;
                }

            } else {
                break;
            }
        }
        return sizeList;
    }


    // retorna o conteudo do nó removido
    public T remove(int index){
        Node<T> pivotNode = this.getNode(index);
        if(index == 0){ // se o indice for zero, é o primeiro nó.
            entryReference = pivotNode.getNextNode();// aponto a referência de entrada para o segundo nó
            return pivotNode.getContent();

        }
        Node<T> previousNode = getNode(index -1); // subtrai 1 do valor do índice.
        previousNode.setNextNode(pivotNode.getNextNode()); // o nó seguinte será o depois do da frente deste.
        return pivotNode.getContent(); // aqui acontece a remoção, pois é perdida a referência do método. e a JVM deleta o objeto sem referência.
    }



    /* Esse metodo serve para validar se é possivel adicionar um novo indice a lista.
    * Por exemplo, a lista tem dois indices, e eu quero adicionar o indice 5.. não será possivel*/
    public void validateIndex(int index){
        if(index >= size()){
            int lastIndex = size() -1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no indice: " + index + " desta lista. A lista vai até o indice " + lastIndex + ". ");
        }

    }


    /* verifica se a lista está vazia*/
    public boolean isEmpty(){
        return entryReference == null ? true : false;

    }


    @Override
    public String toString() {
        String strReturn = "";
        Node<T> assistantNode = entryReference;
        for(int i = 0; i <this.size(); i++){
            strReturn += " [ Node {" + "entryReference=" + assistantNode.getContent() + "}] ---> ";
            assistantNode = assistantNode.getNextNode();
        }
        strReturn += "null";
        return strReturn;
    }
}








