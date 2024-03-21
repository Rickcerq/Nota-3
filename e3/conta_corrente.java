package e3;

public class conta_corrente extends conta_bancaria{
    
    public double cheque_especial() {
        SaldoInicial = SaldoInicial + 1000;
        return SaldoInicial;
    }
}
