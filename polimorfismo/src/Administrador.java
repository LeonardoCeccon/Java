public class Administrador extends Funcionario implements Autenticavel {

    private int senha;
    private AutUtil autenticador;

    public Administrador(){
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
    @Override
    public double getBonificacao() {
        return 50;
    }
}
