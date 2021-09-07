package bridgelabz;

public class Generics<T extends Comparable> {
	//declaring instance variable
	T x;
	T y;
	T z;
	
	//constructor
	Generics(T x,T y,T z){
		this.x=x;
		this.y=y;
		this.z=z;
		
	}
	
	
	
	//checking maximum
	void testMaximum() {
		T max =x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		System.out.println("Maximum is : " +max);
		
		
	}

	public static void main(String[] args) {
		Generics inte=new Generics(123,23455,234);
		Generics flt=new Generics(12.3 , 9.2 , 3.556655);
		Generics str=new Generics("Apple","Oranges","Grapes");
		
		inte.testMaximum();
		flt.testMaximum();
		str.testMaximum();
		
		
		
	}
}

