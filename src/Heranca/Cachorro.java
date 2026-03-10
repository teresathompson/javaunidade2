package Heranca;

public class Cachorro extends Animal implements Treinavel {
    @Override
    public void Falar() {
        System.out.println("O cachorro late.");
    }

    @Override
    public void executarComando(String comando) {
        System.out.println("O cachorro executou o comando: " + comando);
    }

}
