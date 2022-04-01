public class Hardware {

    protected int id;
    protected String descricao;
    protected float valor;
    protected String fabricante;
    protected CPU cpu;
    protected Memoria memoria;
    protected DiscoRigido discoRigido;

    public Hardware(int id, String descricao, float valor, String fabricante,
                    CPU cpu, Memoria memoria, DiscoRigido discoRigido) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.fabricante = fabricante;
        this.cpu = cpu;
        this.memoria = memoria;
        this.discoRigido = discoRigido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public DiscoRigido getDiscoRigido() {
        return discoRigido;
    }

    public void setDiscoRigido(DiscoRigido discoRigido) {
        this.discoRigido = discoRigido;
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", fabricante='" + fabricante + '\'' +
                ", \ncpu=" + cpu +
                ", \nmemoria=" + memoria +
                ", \ndiscoRigido=" + discoRigido +
                '}';
    }
}
