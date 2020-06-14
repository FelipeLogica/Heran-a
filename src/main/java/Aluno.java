/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 16:40
 * @category Model
 */
public class Aluno extends Pessoa {

    private double nota1;
    private double nota2;

    public Aluno() {
        super();
    }

    /**
     *
     * @param nome Recebe o nome do aluno
     * @param sobrenome Recebe o sobrenome do aluno
     * @param email Recebe o email do aluno
     * @param dataNascimento Recebe a data de nascimento do aluno
     * @param nota1 Recebe a prmeira nota do aluno
     * @param nota2 Recebe a segunda nota do aluno
     */
    public Aluno(String nome, String sobrenome, String email, String dataNascimento, double nota1, double nota2) {
        super(nome, sobrenome, email, dataNascimento);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     *
     * @return Retorna a média do aluno
     */
    public double calcularMediaAritimetica(){
        return (this.nota1+this.nota2)/2;
    }

    @Override
    public String toString() {
        return  "\nNome: " + this.getNome() + " " + this.getSobrenome()
                +"\nEmail: " + this.getEmail()
                +"\nData de nascimento: '" + this.getDataNascimento()
                +"\nNota 1: " + this.nota1
                +"\nNota 2: " + this.nota2
                +"\nMédia do aluno" + this.calcularMediaAritimetica();
    }
}
