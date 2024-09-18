public class Main {
 public static void main (String [] args){
    //inheritance = the process of where one 
	//acquirances the attributesand method of another
	
	Motor motor = new Motor();
	motor.setBrand("Honda click");
	motor.setColor("black");
	motor.setYear(2024);
	motor.setPrice(348000);
 
	
	System.out.println("Brand:"+ motor.getBrand());
	System.out.println("Color:"+ motor.getBColor());
	System.out.println("Year:"+ motor.getYear());
	System.out.println("Price:"+ motor.getPrice());
		
	Bicycle bicycle = new Bicycle();
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