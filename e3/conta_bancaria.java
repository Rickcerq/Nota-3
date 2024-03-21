package e3;

public class conta_bancaria {
    protected String nome;
    protected double SaldoInicial = 0, DinheiroSacado, DinheiroDepositado;

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    
    public void setSaldoInicial(double saldoInicial) {
        SaldoInicial = saldoInicial;
    }

    public double getSaldoInicial() {
        return SaldoInicial;
    }

    
    public void setDinheiroDepositado(double dinheiroDepositado) {
        DinheiroDepositado = dinheiroDepositado;
    }

    public double getDinheiroDepositado() {
        return DinheiroDepositado;
    }

    
    public void setDinheiroSacado(double dinheiroSacado) {
        DinheiroSacado = dinheiroSacado;
    }

    public double getDinheiroSacado() {
        return DinheiroSacado;
    }
    

    public double DepositarDinheiro() {
        SaldoInicial = SaldoInicial + DinheiroDepositado;
        System.out.println("Você depositou: " + DinheiroDepositado);
        return SaldoInicial;
    }


    public double SacarDinheiro() {
        SaldoInicial = SaldoInicial - DinheiroSacado;
        System.out.println("Você sacou: " + DinheiroSacado);
        return SaldoInicial;
    }

    public void exibir() {
        System.out.println("Nome do titular: " + nome);
        System.out.println("Saldo atual: " + SaldoInicial);
    }
}
