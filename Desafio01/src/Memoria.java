public class Memoria {

    protected float frequencia;
    protected int capacidade;
    protected String tipo;

    public Memoria(float frequencia, int capacidade, String tipo) {
        this.frequencia = frequencia;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "frequencia=" + frequencia +
                ", capacidade=" + capacidade +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
