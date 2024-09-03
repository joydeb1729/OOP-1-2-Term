

package JavaLabDay1;

public class Die {
  private int numFaces;  // maximum face value
  private int faceValue;  // current value showing on the die
  
  //  Constructor: Sets the initial face value.
  public Die(int _numFaces)  {
    numFaces = _numFaces;
    roll();
  }
  
  //  Constructor: Sets the initial face value.
  public Die(int _numFaces, int _faceValue)  {
    numFaces = _numFaces;
    faceValue = _faceValue;
    //roll();
  }
  
  //  Constructor: Sets the default face value.
  //public Die()  {
  //  numFaces = 6;
  //  roll();
  //}
  
  //  Rolls the die
  public void roll() {
    faceValue = (int)(Math.random() * numFaces) + 1;
  }
  
  //  Face value setter/mutator.
  public void setFaceValue (int value)  {
    if (value <= numFaces)
      faceValue = value;
  }
  //  Face value getter/accessor.
  public int getFaceValue() {
    return faceValue;
  }
  
  //  Face value getter/accessor.
  public int getNumFaces() {
    return numFaces;
  }
  
  //  Returns a string representation of this die.
  public String toString() {
    return "F: " + numFaces +
      " V: " + faceValue;
 }
}
