import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int data;
            int mes;

            System.out.println(" *****Não Sabe seu Signo!*****" + "\n" + "Informe sua Data de Nascimento e Mês. ");

            System.out.print("Data de Nascimento: ");
            data = scan.nextInt();
            System.out.print("Mês de Nascimento: ");
            mes = scan.nextInt();
            if ((data >= 21 && mes == 1) || (data <= 18 && mes == 2)) {
                System.out.print("Seu Signo é Aquarios. ");
            }
            else if ((data >=19 && mes == 2) || (data <= 20 && mes == 3)){
                System.out.println("Seu Signo é Peixe. ");
            }
            else if ((data >= 21 && mes == 3) || (data <= 20 && mes == 4)) {
                System.out.print("Seu Signo é Áries. ");
            }
            else if ((data >= 21 && mes == 4) || (data <=20 && mes == 5)) {
                System.out.println("Seu Signo é Touro. ");
            }
            else if ((data >=21 && mes == 5) || (data <= 20 && mes == 6)) {
                System.out.println("Seu Signo é Gêmeos. ");
            }
            else if ((data >= 20 && mes == 6) || (data <= 22 && mes == 7)) {
                System.out.println("Seu Signo é Câncer. ");
            }
            else if ((data >= 23 && mes == 7) || (data <= 22 && mes == 8)) {
                System.out.println("Seu Signo é Leão. ");
            }
            else if ((data >= 23 && mes == 8) || (data <= 22 && mes == 9)) {
                System.out.println("Seu Signo é Virgem. ");
            }
            else if ((data >= 23 && mes == 9) || (data <= 22 && mes == 10)) {
                System.out.println("Seu Signo é Libra. ");
            }
            else if ((data >= 22 && mes == 11) || (data <= 21 && mes == 12)) {
                System.out.println("Seu Signo é Sagitário. ");
            }
            else if ((data >= 23 && mes == 10) || (data <= 21 && mes == 11)) {
                System.out.println("Seu Signo é Escorpião. ");
            }
            else if ((data >= 22 && mes == 12) || (data <= 20 && mes == 1)) {
                System.out.println("Seu Signo é Capricórnio. ");
            }






        }
    }


