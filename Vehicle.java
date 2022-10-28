package umldesign;

public class Vehicle {
  private String BrandName;
  private String Model;
  private Double Price;
  
public Vehicle() {
	BrandName = "Tata";
	Model = "R8 2019";
	Price =250.98;
}
public Vehicle(String BrandName, String Model, Double Price) {
	this.BrandName = BrandName;
	this.Model = Model;
	this.Price = Price;
}
public String getBrandName() {
	return this.BrandName;
}
public void setBrandName(String BrandName) {
	this.BrandName = BrandName;
}
public String getModel() {
	return this.Model;
}
public void setModel(String Model) {
	this.Model = Model;
}
public Double getPrice() {
	return this.Price;
}
public void setPrice(Double Price) {
	this.Price = Price;
}
public String vehicleDescription() {
	String des ="Brief description of your car: \n"
			+"Brand Name: "+this.BrandName +"\n"
			+"Model:" +this.Model +"\n"
			+"Price:" +this.Price +"\n";
	return des;
}
}
