public class CadastroPessoas {

    public static void main(String[] args) {

        Pessoa[] pessoa = new Pessoa[2];

        pessoa[0] = new Pessoa("Pedro", "M", "1980-03-29");
        pessoa[1] = new Pessoa("Maria", "F", "1990-03-01");

        for (Pessoa p : pessoa) {
            p.imprimeTempoVidaRestante();
        }
    }
}
