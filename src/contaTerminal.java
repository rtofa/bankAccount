import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner dados = new Scanner(System.in);

        System.out.print("please enter the customer's name: ");
        String customerName = dados.nextLine();

        System.out.print("Please enter the Agency number: ");
        int agency = dados.nextInt();
        dados.nextLine();

        System.out.print("Please enter Account number:  ");
        String accountnumber = dados.nextLine();

        System.out.print("Please enter Account balance:  ");
        double balance = 0.0;




        boolean inputValido = false;
        while (!inputValido) {
            try {
                String saldoInput = dados.nextLine();
                balance = Double.parseDouble(saldoInput);
                inputValido = true;
            } catch (NumberFormatException e) {
                System.out.print("Invalid value. Please enter a valid balance amount: ");
            }
        }

        dados.nextLine();
        dados.close();

        String mensagem = "Hello " + customerName + ", thank you for creating an account with our bank,\n" +
                "your agency is " + agency + ", account " + accountnumber + " and your balance " + balance + " is now available for withdrawal.";

        System.out.println(mensagem);
    }
}
