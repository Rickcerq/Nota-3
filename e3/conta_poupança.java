package e3;

public class conta_poupança extends conta_bancaria{
    private double selic = 11.25/100, rendimento;

    public void calcular_rendimento() {
    if (selic > 0.085) {
        rendimento = 0.005 * SaldoInicial;
    }
    else {
        rendimento = 0.007 * selic * SaldoInicial;
    }
    }

    public void mostrar_dados_poupança() {
        super.exibir();
        System.out.println("Rendimento:" + rendimento);
    }
}
