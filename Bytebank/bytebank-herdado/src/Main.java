public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100.0);

        ContaCorrente cp = new ContaCorrente(222,222);
        cc.deposita(200.00);

        cc.transfere(10.0, cp);

        System.out.println("CC: "+ cc.getSaldo());
        System.out.println("CP: "+ cp.getSaldo());
    }
}