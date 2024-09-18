public class Main {
 public static void main (String [] args){
    //inheritance = the process of where one 
	class acquirances the attributes and method of another 
	Car car = new car();
	car.setBrand("Honda click");
	car.setColor("black");
	car.setYear(2024);
	car.setPrice(348000);
	
	System.out.println("Brand:"+ car.getBrand());
	System.out.println("Color:"+ car.getBColor());
	System.out.println("Year:"+ car.getYear());
	System.out.println("Price:"+ car.getPrice());
		
	Bicycle bicycle = new bicycle();
	bicycle.setBrand("Mitzuki");
	bicycle.setColor("pink");
	bicycle.setYear(2019);
	bicycle.setPrice(4000);
	
	System.out.println("Brand:"+ bicycle.getBrand());
	System.out.println("Color:"+ bicycle.getBColor());
	System.out.println("Year:"+ bicycle.getYear());
	System.out.println("Price:"+ bicycle.getPrice());
	
	
	motor.go();
	motor.stop();
	
	bicycle.go();
	bicycle.stop();
  }//end of the main method
}//end of the class