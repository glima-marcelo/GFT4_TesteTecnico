import java.time.LocalDate;
import java.util.Date;

public class Pessoa {

    protected String nome;
    protected String sexo;
    protected String dataNascimento;

    public Pessoa(String nome, String sexo, String dataNascimento) {
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void imprimeTempoVidaRestante() {
        int tempoRestante = 0;
        int anoAtual = LocalDate.now().getYear();
        LocalDate dt = LocalDate.parse(this.getDataNascimento());
        int anoNascimento = dt.getYear();
        int delta = anoAtual - anoNascimento;
        if (this.getSexo().equals("M")) {
            tempoRestante = 73 - delta;
        } else if (this.getSexo().equals("F")) {
            tempoRestante = 80 - delta;
        }
        System.out.println("O tempo restante de vida para " + this.getNome() + " do sexo " + this.getSexo() + " nascido(a) em " + this.getDataNascimento() + " é de " + tempoRestante + "anos");
    }
}
