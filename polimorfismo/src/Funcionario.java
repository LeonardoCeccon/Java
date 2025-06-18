public abstract class Funcionario {
// não se pode instanciar pois o objeto funcionario pois é abstrato
    private String nome;
    private String cpf;
    private double salario;



    public abstract double getBonificacao();
        // metodo sem corpo/ as implementações vão ser feitas pelas classes herdada

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }
}
