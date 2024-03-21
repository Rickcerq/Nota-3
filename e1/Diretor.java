package e1;

public class Diretor extends Funcionário{
    private int ações;

    public int getAções() {
        return ações;
    }

    public void setAções(int ações) {
        this.ações = ações;
    }

    public void exibir_dadosDiretor() {
        super.exibir();
        System.out.println(ações);
    }
}