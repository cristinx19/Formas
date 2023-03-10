package parte2;

import java.time.LocalDate;
import java.util.*;


/**
 * Class PuestoTrabajo
 */
public class PuestoTrabajo {

  //
  // Fields
  //

  private String nombre;
  private LocalDate fechaInicio;
  private LocalDate fechaFin;
  private float salario;
  private String lugar;
  
  //
  // Constructors
  //
  public PuestoTrabajo () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of fechaInicio
   * @param newVar the new value of fechaInicio
   */
  public void setFechaInicio (LocalDate newVar) {
    fechaInicio = newVar;
  }

  /**
   * Get the value of fechaInicio
   * @return the value of fechaInicio
   */
  public LocalDate getFechaInicio () {
    return fechaInicio;
  }

  /**
   * Set the value of fechaFin
   * @param newVar the new value of fechaFin
   */
  public void setFechaFin (LocalDate newVar) {
    fechaFin = newVar;
  }

  /**
   * Get the value of fechaFin
   * @return the value of fechaFin
   */
  public LocalDate getFechaFin () {
    return fechaFin;
  }

  /**
   * Set the value of salario
   * @param newVar the new value of salario
   */
  public void setSalario (float newVar) {
    salario = newVar;
  }

  /**
   * Get the value of salario
   * @return the value of salario
   */
  public float getSalario () {
    return salario;
  }

  /**
   * Set the value of lugar
   * @param newVar the new value of lugar
   */
  public void setLugar (String newVar) {
    lugar = newVar;
  }

  /**
   * Get the value of lugar
   * @return the value of lugar
   */
  public String getLugar () {
    return lugar;
  }

  //
  // Other methods
  //

}
