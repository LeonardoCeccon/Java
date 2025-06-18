public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1334, 33222);

        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.nome = "paulo silveira";

        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        System.out.println(conta.getTitular().getProfissao());



    }
}