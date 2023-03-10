package org.example;

/**
 * Class rectangulo
 */
public class Rectangulo {

  //
  // Fields
  //

  private String color;
  private int base;
  private int altura;
  
  //
  // Constructors
  //
  public Rectangulo() { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of color
   * @param newVar the new value of color
   */
  public void setColor (String newVar) {
    color = newVar;
  }

  /**
   * Get the value of color
   * @return the value of color
   */
  public String getColor () {
    return color;
  }

  /**
   * Set the value of base
   * @param newVar the new value of base
   */
  public void setBase (int newVar) {
    base = newVar;
  }

  /**
   * Get the value of base
   * @return the value of base
   */
  public int getBase () {
    return base;
  }

  /**
   * Set the value of altura
   * @param newVar the new value of altura
   */
  public void setAltura (int newVar) {
    altura = newVar;
  }

  /**
   * Get the value of altura
   * @return the value of altura
   */
  public int getAltura () {
    return altura;
  }

  //
  // Other methods
  //

}
