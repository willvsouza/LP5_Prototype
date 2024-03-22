public class Motor implements Cloneable {
    private int numeroDeMotores;
    private String tipoDeMotor;

    public Motor(int numeroDeMotores, String tipoDeMotor) {
        super();
        this.numeroDeMotores = numeroDeMotores;
        this.tipoDeMotor = tipoDeMotor;
    }

    public int getNumeroDeMotores() {
        return numeroDeMotores;
    }

    public void setNumeroDeMotores(int numeroDeMotores) {
        this.numeroDeMotores = numeroDeMotores;
    }

    public String getTipo() {
        return tipoDeMotor;
    }

    public void setTipo(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Motor {" +
                "Nº de motores ='" + numeroDeMotores + '\'' +
                ", tipo de motor =" + tipoDeMotor +
                '}';
    }
}
