package Homework4;

public class Accord2017 extends Accord2016{
	String name;
	String model;
     int year=2017;
    final  double interest=0.9;
     static int milage;
     String color;
     String feature;
     //default constructor
      public Accord2017(){
    	  
      }
      //constructor1
      public Accord2017(String name){
    	  this.name=name;
      }
    // //constructor2
	public Accord2017(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	// //constructor3
	public Accord2017(String model, String color,String feature) {
		super();
		this.model = model;
		this.color = color;
		this.feature=feature;
	}
	//gettter and setter method
	 public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public static int getMilage() {
			return milage;
		}
		public static void setMilage(int milage) {
			Accord2017.milage = milage;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getFeature() {
			return feature;
		}
		public void setFeature(String feature) {
			this.feature = feature;
		}
		public int getYear() {
			return year;
		}
		public double getInterest() {
			return interest;
		}

	
     public int year(){
    	 System.out.println("this is Accord "+year);
    	 return year;
    	 
    	 
     }
     double interest(){
    	 System.out.println("interest rate are:  "+interest);
    	 
    	 return interest;
     }
	
	public String SMA_15() {
		System.out.println("It has "+SMA);
		return SMA;
	}
	
	public void Antilock_Break_15() {
		System.out.println("amazing things are it has antilock Break system");
	}
	
	public void Traction_Control15() {
		System.out.println("nice  things are it has Traction Control system");
		
	}
	
	public int milage2015() {
		int milage=20;
		System.out.println("it goes "+milage+" mile per hour");
		return milage;
	}
	
	void technology(String aplplay, String androidplay) {
		System.out.println("It has 2 types of technology one is: "+aplplay+" the other one is: "+androidplay);
	}
	
	int milage_2016() {
		int milage=30;
		System.out.println("it goes "+milage+" mile per hour");
		return milage;
	}
	//polimorfism
	@Override
	public int year15() {
		int year=2015;
		System.out.println("this is accord "+year);
		return year;
	}
	
	public double interest15() {
		System.out.println("interest rate are:  "+interest);
		return interest;
	}
	
	double intrst16() {
		System.out.println("interest rate are:  "+interest);
		return interest;
	}
     
}
