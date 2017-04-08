package Homework4;

public class MainHomework4 {

	public static void main(String[] args) {
		System.err.println("Description about honda accord 2017");
		Accord2017 accord17=new Accord2017();
		accord17.year();
		accord17.interest();
		accord17.setName("accord");
		accord17.setModel("sedan");
		accord17.setColor("red");
		accord17.setFeature("nice feature");
		System.out.println("from set method: "+accord17.getName()+" "+accord17.getModel()+" "+accord17.getColor()+" "+accord17.getFeature());
		Accord2017 accord17con=new Accord2017("Honda Accord 2017 sedan");
		System.out.println("constractor1: "+accord17con.getName());
		Accord2017 accord17con2=new Accord2017( "Accord sedan","black");
		System.out.println("constractor2: "+accord17con2.getModel()+" "+accord17con2.getColor());
		Accord2017 accord17con3=new Accord2017("Accord sedan","black","feature are sensing");
		System.out.println("Constractor3: "+accord17con3.getModel()+" "+accord17con3.getColor()+" "+accord17con3.getFeature());
		System.err.println("Description about honda accord 2016");
		Accord2016 accord16=new Accord2017();
		accord16.year16();
		accord16.milage_2016();
		accord16.intrst16();
		accord16.sensing(" lanesens"," parksens");
		accord16.technology("aplplay", "androidplay");
		System.err.println("Description about honda accord 2015");
		Accord2015 accord15=new Accord2017();
		accord15.year15();
		accord15.SMA_15();
		accord15.interest15();
		accord15.Antilock_Break_15();
		accord15.Traction_Control15();
		accord15.milage2015();
	}

}
