package SistemaAluno;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Sistema sistema = new Sistema();

        System.out.println("Escreva o nome do aluno: ");
        sistema.setAluno(scan.next());

        System.out.println("Escreva a idade do aluno: ");
        sistema.setIdade(scan.nextDouble());

        System.out.println("Aluno cadastrado com sucesso!");
        System.out.println("Aluno: " +sistema.Aluno);
        System.out.println("Idade: "+sistema.verificarIdade());


        System.out.println("Deseja inserir mais um Cadastro de Aluno?");
        int adicionar = scan.nextInt();
        }


}

