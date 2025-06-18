public class Gerente extends Funcionario implements Autenticavel {

    private int senha;
    private AutUtil autenticador;

    public Gerente() {
        this.autenticador = new AutUtil();
    }
    public int getSenha(int i) {
        return senha;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        this.autenticador.autentica(senha);
        return true;
    }

    public double getBonificacao(){
        System.out.println("chamando o metodo de bonificacao do Gerente");
        return 200;
    }

}
