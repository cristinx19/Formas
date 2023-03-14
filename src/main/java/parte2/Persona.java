package parte2;

import java.time.LocalDate;
import java.util.*;


/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  private String nombre;
  private String apellido1;
  private String apellido2;
  private LocalDate fechaNacimiento;
  private String sexo;
  private int numeroID;
  private int telefono;

  private ArrayList <PuestoTrabajo> trabajos;

  public Persona(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, String sexo, int numeroID, int telefono) {
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.fechaNacimiento = fechaNacimiento;
    this.sexo = sexo;
    this.numeroID = numeroID;
    this.telefono = telefono;
    this.trabajos = new ArrayList<>();
  }

  public ArrayList<PuestoTrabajo> getTrabajos() {
    return trabajos;
  }

  public void setTrabajos(ArrayList<PuestoTrabajo> trabajos) {
    this.trabajos = trabajos;
  }
  //
  // Constructors
  //

  
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
   * Set the value of apellido1
   * @param newVar the new value of apellido1
   */
  public void setApellido1 (String newVar) {
    apellido1 = newVar;
  }

  /**
   * Get the value of apellido1
   * @return the value of apellido1
   */
  public String getApellido1 () {
    return apellido1;
  }

  /**
   * Set the value of apellido2
   * @param newVar the new value of apellido2
   */
  public void setApellido2 (String newVar) {
    apellido2 = newVar;
  }

  /**
   * Get the value of apellido2
   * @return the value of apellido2
   */
  public String getApellido2 () {
    return apellido2;
  }

  /**
   * Set the value of fechaNacimiento
   * @param newVar the new value of fechaNacimiento
   */
  public void setFechaNacimiento (LocalDate newVar) {
    fechaNacimiento = newVar;
  }

  /**
   * Get the value of fechaNacimiento
   * @return the value of fechaNacimiento
   */
  public LocalDate getFechaNacimiento () {
    return fechaNacimiento;
  }

  /**
   * Set the value of sexo
   * @param newVar the new value of sexo
   */
  public void setSexo (String newVar) {
    sexo = newVar;
  }

  /**
   * Get the value of sexo
   * @return the value of sexo
   */
  public String getSexo () {
    return sexo;
  }

  /**
   * Set the value of numeroID
   * @param newVar the new value of numeroID
   */
  public void setNumeroID (int newVar) {
    numeroID = newVar;
  }

  /**
   * Get the value of numeroID
   * @return the value of numeroID
   */
  public int getNumeroID () {
    return numeroID;
  }

  /**
   * Set the value of telefono
   * @param newVar the new value of telefono
   */
  public void setTelefono (int newVar) {
    telefono = newVar;
  }

  /**
   * Get the value of telefono
   * @return the value of telefono
   */
  public int getTelefono () {
    return telefono;
  }

  //
  // Other methods
  //

}
