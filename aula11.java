public class aula11 {
    class ContaBancaria {
        private String titular;
        private double saldo;

        ContaBancaria(String titular, double saldo){
            this.titular = titular;
            this.saldo = saldo;
        }

        public String depositar(double valor){
            if (valor > 0) {
                saldo += saldo;
                return "Deposito concluido.";
            }else {
                return "valor invalido. ";
            }
        }

        public String Saldo(double valor){
            if (saldo >= 0 && saldo <=saldo){
                this.saldo -= saldo;
                return "Valor invalido.";
            }else {
                return "Valor invalido ou saldo insuficiente.";
            }
        }

        public  double getSaldo() {
            return saldo;
        }
    }
   
}
