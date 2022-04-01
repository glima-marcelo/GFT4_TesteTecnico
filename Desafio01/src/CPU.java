public class CPU {

    protected float clock;
    protected String modelo;

    public CPU(float clock, String modelo) {
        this.clock = clock;
        this.modelo = modelo;
    }

    public float getClock() {
        return clock;
    }

    public void setClock(float clock) {
        this.clock = clock;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "clock=" + clock +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
