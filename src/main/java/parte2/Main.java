package parte2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        PuestoTrabajo Jardinero = new PuestoTrabajo();
        PuestoTrabajo Guardia = new PuestoTrabajo();
        Persona p1 = new Persona("Paco", "Ruiz", "Martinez", LocalDate.of(1996, 10, 18), "Hombre", 3, 638287473, Jardinero);
        Persona p2 = new Persona("Paco", "Ruiz", "Martinez", LocalDate.of(1996, 10, 18), "Hombre", 3, 638287473, Guardia);
    }

}
