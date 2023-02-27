public abstract class Vehicle{
  // attributes
  private String brand;
  private int kilometers;

  // constructors

  public Vehicle(String brand, int kilometers){
    this.brand = brand;
    this.kilometers = kilometers;
  }


  // getters and setters
  public String getBrand(){
    return this.brand;
  }

  public void setBrand(String newBrand){
    this.brand = newBrand;
  };


  public int getKilometers(){
    return this.kilometers;
  }
  
  public void setKilometers(int newKilometers){
    this.kilometers = newKilometers;
  }
  
  public abstract String doStuff();

  
}