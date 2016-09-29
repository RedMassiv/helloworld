package ARQ_1_0;

public class ARQ {
	
	//Attribute
	public double x;
	public double y;
	
	//Kostruktor
	public ARQ(double x, double y){
		
		this.x=x;
		this.y=y;
		
	
	}
	
	//Mainmethode
	public static void main(String[] args) {
		
		ARQ v1 = new ARQ(45,82);
		ARQ v2 = new ARQ(0,0);
	/*	ARQ v3 = new ARQ(34,67);
		ARQ v4 = new ARQ(0,30);
		ARQ v5 = new ARQ(32,12);
		ARQ v6 = new ARQ(78,0); */
		
		System.out.println("v1.x= "+v1.x);
		System.out.println("v2.x= "+v2.x);
	/*	System.out.println("v3.x= "+v3.x);
		System.out.println("v4.x= "+v4.x);
		System.out.println("v5.x= "+v5.x);
		System.out.println("v6.x= "+v6.x); */
		
		System.out.println("v1 "+v1);
	/*	System.out.println("v2 "+v2);
		System.out.println("v3 "+v3);
		System.out.println("v4 "+v4);
		System.out.println("v5 "+v5);
		System.out.println("v6 "+v6); */
		System.out.println(v1.lenght());
		System.out.println(v2.lenght());
	}

	public String toString() {return "("+x+", "+y+")" ;}
	
	public double lenght() {return Math.sqrt(x*x+y*y);}

}
