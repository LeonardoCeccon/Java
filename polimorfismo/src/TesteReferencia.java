public class TesteReferencia {
    public static void main(String[] args) {

        // lado direito = objeto (mais generico) // lado esquerdo = chamar o metodo construtor(mais espeficico)
        Funcionario g1 = new Gerente();
        g1.setNome("Leonardo Ceccon");
        g1.setSalario(5000.0);

        Funcionario ev = new EditorVIdeo();
        ev.setSalario(2500.0);

        Funcionario d = new Designer();
        d.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());

    }
}
