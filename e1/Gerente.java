package e1;

public class Gerente extends Funcionário {
    private String departamento;
    private double salarioBonus;

    public double getSalarioBonus() {
        return salarioBonus;
    }

    public void setSalarioBonus(double salarioBonus) {
        this.salarioBonus = salarioBonus;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double calcularBonus() {
        salarioBonus = ((salario * 10)/100) + salario;
        return salarioBonus;
    }

    public void exibirDadosGerente() {
        super.exibir();
        System.out.println(salarioBonus);
        System.out.println(departamento);
    }
}