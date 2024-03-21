package e2;

public class Main {
    public static void main(String[] args) {
        televisão p1 = new televisão();

        p1.setNome("Smart TV 60 LG 4K");
        p1.setPreço(2369);
        p1.setEstoque(520);
        p1.acessarCanais();

        smartphone p2 = new smartphone();

        p2.setNome("Samsung Galaxy S23");
        p2.setPreço(2989.81);
        p2.setEstoque(1234);
        p2.Ligação();
    }
}
