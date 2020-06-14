/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 16:11
 * @category Model
 */
public class Funcionario extends Pessoa {

    private int numeroDeRegistro;
    private double salarioFixo;

    public Funcionario() {
        super();
    }

    /**
     *
     * @param nome Recebe o nome do funcionário
     * @param sobrenome Recebe o sobrenome do funcionário
     * @param email Recebe o Email do funcionário
     * @param dataNascimento Recebe a data do aniverssário do funcionário
     * @param numeroDeRegistro Recebe o numero de registro do funcionário
     * @param salarioFixo Recebe o valor de salario fixo do funcionário
     */
    public Funcionario(String nome, String sobrenome, String email, String dataNascimento, int numeroDeRegistro,
                       double salarioFixo) {

        super(nome, sobrenome, email, dataNascimento);
        this.numeroDeRegistro = numeroDeRegistro;
        this.salarioFixo = salarioFixo;
    }

    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    /**
     *
     * @return Retorna o desconto do FGTS do funcionário
     */
    public double calcularSalarioComDescontoDeFGTS(){
        return this.salarioFixo - (this.salarioFixo*0.08);
    }

    @Override
    public String toString() {
        return  "\nNome: " + this.getNome() + " " + this.getSobrenome()
                +"\nEmail: " + this.getEmail()
                +"\nData de nascimento: '" + this.getDataNascimento()
                +"\nNumero de registro: " + this.numeroDeRegistro
                +"\nSalario fixo: " + this.salarioFixo
                +"\nSalario liquido: " + this.calcularSalarioComDescontoDeFGTS();
    }
}
