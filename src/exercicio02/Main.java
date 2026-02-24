package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente paciente = new Paciente();
        double[] alvo;

        System.out.print("Nome --> ");
        paciente.nome = sc.next();
        System.out.print("Idade --> ");
        paciente.idade = sc.nextInt();

        System.out.println("Frequência máxima: " + paciente.frequenciaMaxima());
        alvo = paciente.frequenciaAlvo();
        System.out.println("Início da frequência alvo " + alvo[0]);
        System.out.println("Fim da frequência alvo " + alvo[1]);

    }
}
