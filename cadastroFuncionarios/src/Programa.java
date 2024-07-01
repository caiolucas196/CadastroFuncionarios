package Aplicacao;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            while (hasId(funcionarios, id)) {
                System.out.print("Id já cadastrado ");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            Funcionario emp = new Funcionario(id, nome, salario);
            funcionarios.add(emp);
        }

        System.out.println("Diga qual funcionario terá aumento salarial: ");
        int idsalario = sc.nextInt();
        Integer pos = position(funcionarios, idsalario);
        if (pos == null) {
            System.out.println("Esse Id não existe!");
        }
        else{
            System.out.println("Entre com a porcentagem: ");
            double porcentagem = sc.nextDouble();
            funcionarios.get(pos).increaseSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista dos funcionarios");
        for (Funcionario func : funcionarios) {
            System.out.println(func);
        }

        sc.close();
    }

    public static Integer position(List<Funcionario> funcionarios, int id) {
        for(int i = 0; i < funcionarios.size(); i++) {
            if(funcionarios.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Funcionario> funcionarios, int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return true;
            }
        }
        return false;
    }
}