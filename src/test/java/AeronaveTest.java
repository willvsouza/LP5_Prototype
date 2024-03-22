
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AeronaveTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Aeronave aeronave = new Aeronave(101254, "Boeing", "737 MAX", 120, new Motor(2, "TurboFan"));

        Aeronave aeronaveClone = aeronave.clone();
        aeronaveClone.setNumeroDeSerie(101010);
        aeronaveClone.setFabricante("Airbus");
        aeronaveClone.setModelo("A380");
        aeronaveClone.setNumeroPassageiros(656);
        aeronaveClone.getMotor().setNumeroDeMotores(4);

        assertEquals("Aeronave {Nº de série =101254, Fabricante ='Boeing', Modelo ='737 MAX', Nº de passageiros =120, Motor =Motor {Nº de motores ='2', tipo de motor =TurboFan}}", aeronave.toString());
        assertEquals("Aeronave {Nº de série =101010, Fabricante ='Airbus', Modelo ='A380', Nº de passageiros =656, Motor =Motor {Nº de motores ='4', tipo de motor =TurboFan}}", aeronaveClone.toString());
    }
}

