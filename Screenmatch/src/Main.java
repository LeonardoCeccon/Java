public class Main{
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Filme1");
        meuFilme.setAnoDeLancamento(2023);;
        meuFilme.setDuracaoEmMin(120);

        meuFilme.exibeFicha();
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.avalia(8);

        System.out.println(meuFilme.getSomaDeAv());
        System.out.println(meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        //calculadora.inclui(outro filme aqui);
        //e continua assim para adicionar outras coisas para o uso da calculadora
        System.out.println(calculadora.getTempoTotal());
    }
}