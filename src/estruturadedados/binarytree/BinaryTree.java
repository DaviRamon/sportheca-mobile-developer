package estruturadedados.binarytree;

public class BinaryTree<T extends Comparable<T>> {

    private BinNode<T> raiz;

    public BinaryTree(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BinNode<T> novoNo = new BinNode<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BinNode<T> inserir(BinNode<T> atual, BinNode<T> novoNo){
        if(atual == null){
            return novoNo;
        }else if(novoNo.getContent().compareTo(atual.getContent()) < 0){
            atual.setLeftNode(inserir(atual.getLeftNode(), novoNo));
        }else{
            atual.setRightNode(inserir(atual.getRightNode(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNode<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getLeftNode());
            System.out.print(atual.getContent() + ", ");
            exibirInOrdem(atual.getRightNode());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNode<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getLeftNode());
            exibirPosOrdem(atual.getRightNode());
            System.out.print(atual.getContent() + ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNode<T> atual){
        if(atual != null){
            System.out.print(atual.getContent() + ", ");
            exibirPreOrdem(atual.getLeftNode());
            exibirPreOrdem(atual.getRightNode());
        }
    }

    public void remover(T conteudo){
        try{
            BinNode<T> atual = this.raiz;
            BinNode<T> pai = null;
            BinNode<T> filho = null;
            BinNode<T> temp = null;

            while (atual != null && !atual.getContent().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getContent()) < 0){
                    atual = atual.getLeftNode();
                }else {
                    atual = atual.getRightNode();
                }
            }

            if(atual == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            if(pai == null){
                if(atual.getRightNode() == null){
                    this.raiz = atual.getLeftNode();
                }else if(atual.getLeftNode() == null){
                    this.raiz = atual.getRightNode();
                }else {
                    for(temp = atual, filho = atual.getLeftNode();
                        filho.getRightNode() != null;
                        temp = filho, filho = filho.getLeftNode()
                    ){
                        if(filho != atual.getLeftNode()){
                            temp.setRightNode(filho.getLeftNode());
                            filho.setLeftNode(raiz.getLeftNode());
                        }
                    }
                    filho.setRightNode(raiz.getRightNode());
                    raiz = filho;
                }
            }else if(atual.getRightNode() == null){
                if(pai.getLeftNode() == atual){
                    pai.setLeftNode(atual.getLeftNode());
                }else {
                    pai.setRightNode(atual.getLeftNode());
                }
            }else if(atual.getLeftNode() == null){
                if(pai.getLeftNode() == atual){
                    pai.setLeftNode(atual.getRightNode());
                }else {
                    pai.setRightNode(atual.getRightNode());
                }
            }else{
                for(
                        temp = atual, filho = atual.getLeftNode();
                        filho.getRightNode() != null;
                        temp = filho, filho = filho.getRightNode()
                ){
                    if(filho != atual.getLeftNode()){
                        temp.setRightNode(filho.getLeftNode());
                        filho.setLeftNode(atual.getLeftNode());
                    }
                    filho.setRightNode(atual.getRightNode());
                    if(pai.getLeftNode() == atual){
                        pai.setLeftNode(filho);
                    }else{
                        pai.setRightNode(filho);
                    }
                }
            }
        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }

}