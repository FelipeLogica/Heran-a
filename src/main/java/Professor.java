/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 16:22
 * @category Model
 */
public class Professor extends Pessoa  {

    private double horasTrabalhadas;
    private double valorPorHoraTrabalhada;

    public Professor() {
        super();
    }

    /**
     *
     * @param nome Recebe o nome do professor
     * @param sobrenome Recebe o sobrenome do professor
     * @param email Recebe o email do professor
     * @param dataNascimento Recebe a data de nascimento do professor
     * @param horasTrabalhadas Recebe as aulas trabalhadas do professor
     * @param valorPorHoraTrabalhada Recebe o valor por hora trabalhada do professor
     */
    public Professor(String nome, String sobrenome, String email, String dataNascimento,
                     double horasTrabalhadas, double valorPorHoraTrabalhada) {

        super(nome, sobrenome, email, dataNascimento);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHoraTrabalhada = valorPorHoraTrabalhada;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHoraTrabalhada() {
        return valorPorHoraTrabalhada;
    }

    public void setValorPorHoraTrabalhada(double valorPorHoraTrabalhada) {
        this.valorPorHoraTrabalhada = valorPorHoraTrabalhada;
    }

    /**
     * @return Retorna o salário bruto
     *
     */
    public double calcularSalarioBruto(){
        return (this.horasTrabalhadas * valorPorHoraTrabalhada);
    }

    /**
     * @return Retorna o salário menos o valor do FGTS
     *
     */
    public double calcularSalarioComDescontoDeFGTS(){
        return this.calcularSalarioBruto() - (this.calcularSalarioBruto()*0.08);
    }

    @Override
    public String toString() {
        return  "\nNome: " + this.getNome() + " " + this.getSobrenome()
                +"\nEmail: " + this.getEmail()
                +"\nData de nascimento: '" + this.getDataNascimento()
                +"\nHoras trabalhadas: " + this.horasTrabalhadas
                +"\nValor por hora trabalhada: " + this.valorPorHoraTrabalhada
                +"\nSalário bruto: " + this.calcularSalarioBruto()
                +"\nSalário liquido: " + this.calcularSalarioComDescontoDeFGTS()
                ;
    }
}
