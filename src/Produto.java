public class Produto{
    String nome;
    double preco;


    public Produto(String nome, double preco){
 this.nome = nome;
 this.preco = preco;
    }

    public Produto(String nome){
this.nome=nome;
this.preco = 10.0;
    }

    public void exibirDetalhes(){
        System.out.println("Produto: " + nome + ", preço:" + preco);
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("lápis", 3.0);
        Produto p2 = new Produto("borracha");

        p1.exibirDetalhes();
        p2.exibirDetalhes();
    }
}