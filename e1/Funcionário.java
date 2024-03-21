package e1;

public class Funcionário {
    protected String nome;
    protected double salario, valopH, horasTrab;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValopH() {
        return valopH;
    }

    public void setValopH(double valopH) {
        this.valopH = valopH;
    }

    public double getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(double horasTrab) {
        this.horasTrab = horasTrab;
    }

    public double calcular_salario() {
        salario = horasTrab * valopH;
        return salario;
    }

    public void exibir() {
        System.out.println(nome);
        System.out.println(salario);
    };
}