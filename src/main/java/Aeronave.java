import java.util.Date;

public class Aeronave implements Cloneable {
    private int numeroDeSerie;
    private String fabricante;
    private String modelo;
    private int numeroPassageiros;
    private Motor motor;

    public Aeronave(int numeroDeSerie, String fabricante, String modelo, int numeroPassageiros, Motor motor) {
        this.numeroDeSerie = numeroDeSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.motor = motor;
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public Aeronave clone() throws CloneNotSupportedException {
        Aeronave aeronaveClone = (Aeronave) super.clone();
        aeronaveClone.motor = (Motor) aeronaveClone.motor.clone();
        return aeronaveClone;
    }

    @Override
    public String toString() {
        return "Aeronave {" +
                "Nº de série =" + numeroDeSerie +
                ", Fabricante ='" + fabricante + '\'' +
                ", Modelo ='" + modelo + '\'' +
                ", Nº de passageiros =" + numeroPassageiros +
                ", Motor =" + motor +
                '}';
    }
}
