package atribuicaoereferencia;

public class Objeto {

    Integer num;

    public Objeto(Integer num) {
        this.num = num;
    }

    public  void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
