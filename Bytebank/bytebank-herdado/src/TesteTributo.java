public class TesteTributo {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100.0);

        SeguroVida seguro = new SeguroVida();

        CalculaImposto calc = new CalculaImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }
}
