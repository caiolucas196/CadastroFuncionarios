packege application;

import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Systeam.out.print("Quantos funcionários serão registrados?");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {

            Systeam.out.println("Funcionario #" + (i + 1) + ":");
            System.out.println("Id: " + sc.next());
            System.out.println("Nome: " + sc.next());
            System.out.println("Salario: " + sc.nextDouble());

            Funcionario emp = new Funcionario(id, nome, salario);

            list.add(emp)


        }

        sc.close();
    }


}
