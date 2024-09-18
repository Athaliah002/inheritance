public class Vehicle{

   //attribute,properties
    private String brand;
	private String color;
	private int year;
    private double price;   
   
   // null
   public Vehicle (){
   }
   // overload constructor
	  public Vehicle(String brand,String color,int year,double price){
         this .brand = brand;
		 this.color =color;
		 this.year= year;
		 this.price=price ;
	  }// en of constructor	
	  
	     // setter
	  public void  setBrand (String brand){
		  this.brand = brand;
	  }// end of the setBrandd setter
	  
	  //getter
	  public String getBrand (){
		  return brand;
	      }// end of getBrand 
		  public void go(){
			  System.out.println("The vehicle is moving !!!");
		  }// end of the method
		  public void stop(){
			  System.out.println("The vehicle is stopped");
		  }
		  
}
 