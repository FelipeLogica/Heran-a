import java.util.Scanner;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 16:45
 * @category View
 */
public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\f");

        System.out.println("Digite o nome do funcionario");
        String nome = scanner.next();
        System.out.println("Digite o sobrenome do funcionario");
        String sobrenome = scanner.next();
        System.out.println("Digite o email do funcionario");
        String email = scanner.next();
        System.out.println("Digite a data de nascimento do funcionario");
        String dataNascimento = scanner.next();
        System.out.println("Digite o numero de registro do funcionario");
        int numeroRegistro = scanner.nextInt();
        System.out.println("Digite o salario dofuncionário");
        double salario = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome,sobrenome,email,dataNascimento,numeroRegistro,salario);
        System.out.println(funcionario);

        System.out.println("Digite o nome do professor");
        String nome1 = scanner.next();
        System.out.println("Digite o sobrenome do professor");
        String sobrenome1 = scanner.next();
        System.out.println("Digite o email do professor");
        String email1 = scanner.next();
        System.out.println("Digite a data de nascimento do professor");
        String dataNascimento1 = scanner.next();
        System.out.println("Digite a quantidade de horas trabalhadas");
        double horasTrabalhadas = scanner.nextDouble();
        System.out.println("Digite o valor por hora trabalhadas");
        double valorPorHorasTrabalhadas = scanner.nextDouble();

        Professor professor = new Professor(nome1,sobrenome1,email1,dataNascimento1,horasTrabalhadas,
                                            valorPorHorasTrabalhadas);
        System.out.println(professor);

        System.out.println("Digite o nome do aluno");
        String nome2 = scanner.next();
        System.out.println("Digite o sobrenome do aluno");
        String sobrenome2 = scanner.next();
        System.out.println("Digite o email do aluno");
        String email2 = scanner.next();
        System.out.println("Digite a data de nascimento do aluno");
        String dataNascimento2 = scanner.next();
        System.out.println("Digite a nota 1");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2");
        double nota2 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome1,sobrenome1,email1,dataNascimento1,nota1,nota2);
        System.out.println(aluno);






    }
}
