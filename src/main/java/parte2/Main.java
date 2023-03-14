package parte2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        PuestoTrabajo Jardinero = new PuestoTrabajo("Jardinero", LocalDate.of(2020, 05, 01), LocalDate.of(2022, 07, 28), 1000, "Jaen");
        PuestoTrabajo Guardia = new PuestoTrabajo("Guardia", LocalDate.of(2018, 10, 12), LocalDate.of(2019, 11, 23), 1200, "Granada");
        PuestoTrabajo Niñero = new PuestoTrabajo("Niñero", LocalDate.of(2015, 03, 20), LocalDate.of(2017, 12, 13), 800, "Almería");
        Persona p1 = new Persona("Paco", "Ruiz", "Martinez", LocalDate.of(1996, 10, 18), "Hombre", 3, 638287473);
        p1.getTrabajos().add(Jardinero);
        p1.getTrabajos().add(Guardia);
        p1.getTrabajos().add(Niñero);
    }

}
