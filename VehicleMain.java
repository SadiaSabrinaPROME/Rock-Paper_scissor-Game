package umldesign;
import java.util.Scanner;
public class VehicleMain {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String BrandName= input.nextLine();
		
		Vehicle audi = new Vehicle("Audi","R8 2019",1711.556);
		System.out.println(audi.vehicleDescription()+"\n");
		
		Vehicle tata = new Vehicle();
		System.out.println(tata.vehicleDescription()+"\n");
		
		audi.setModel("R10 2018");
		tata.setPrice(500.98);
		tata.setBrandName(BrandName);
		System.out.println("After setting the data:");
		System.out.println(audi.vehicleDescription()+"\n");
		System.out.println(tata.vehicleDescription()+"\n");
	}

}