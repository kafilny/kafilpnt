package Homework4;

public abstract class Accord2016 implements Accord2015 {
	int year=2016;
	public int year16(){
	//	int year=2016;
		System.out.println("this is "+year+" Honda accord");
		return year;
	}
	void sensing(String lanesens,String parksens){
		System.out.println("It has 2 types of sensing one is: "+lanesens+" the other one is: "+parksens);
	}
    abstract void technology(String aplplay,String androidplay);
    abstract int milage_2016();
    abstract double intrst16(); 
}
