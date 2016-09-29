package helloworld;

public class Prime {
		
	static int number = 0;
		
	public static void main(String[] args) {

	//	PrimAusgabe();
		System.out.println(addiere(1,2));
		
		
		
	}
	
	public static int addiere(int zahl1, int zahl2){
		return zahl1+zahl2;
		
	}
		
		
	public static void PrimAusgabe(){
		int ausgabe=0;
		
	System.out.println("Primzahlen");
		
	for(int i=number; i<=10000; i++){
		if(isPrime(i)){
		 System.out.print(i +",");
		 ausgabe++;
		 
		 if(ausgabe%30==0){
			System.out.println("");
			ausgabe=0;}
		}
	}
		
		
		
	}
	
		
		public static boolean isPrime(int number) {
			
				if(number<2){return false;}
			
			
				for(int i=2; i<number/2; i++){
				if(number%i==0){
					return false;}
				
			}

			return true;

		}

	}


