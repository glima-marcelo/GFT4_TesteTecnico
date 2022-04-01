import java.time.LocalDate;
import java.util.Date;

public class Pessoa {

    protected String nome;
    protected String sexo;
    protected Date dataNascimento;

    public Pessoa(String nome, String sexo, Date dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void imprimeTempoVidaRestante() {
        if (this.getSexo().equals("M")) {
            int idade = (LocalDate.now().getYear()) - this.getDataNascimento();
        }
    }
}
