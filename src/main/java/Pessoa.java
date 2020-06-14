/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 15:58
 * @category Model
 */
public abstract class Pessoa {

    private String nome;
    private String sobrenome;
    private String email;
    private String dataNascimento;

    public Pessoa() {
        super();
    }

    /**
     *
     * @param nome Recebe o nome da pessoa
     * @param sobrenome Recebe o sobrenome da pessoa
     * @param email Recebe o Email da pessoa
     * @param dataNascimento Recebe a data do aniverssário da pessoa
     */
    public Pessoa(String nome, String sobrenome, String email, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return  "\nNome: " + this.nome + " " + this.sobrenome
                +"\nEmail: " + this.email
                +"\nData de nascimento: '" +this.dataNascimento;
    }
}
