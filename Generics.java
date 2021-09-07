package bridgelabz;

@SuppressWarnings("rawtypes")
public class Generics<T extends Comparable> {
	// declaring instance array
	private T[] inputArray;
	
	// constructor
	Generics(T[] inputArray ) {
		this.inputArray=inputArray;
	}

	// checking maximum
	@SuppressWarnings("unchecked")
	void testMaximum() {
		T max = inputArray[0];
		for(T element:inputArray ) {
			if(element.compareTo(max)>0) {
				max=element;
			}
		}
		System.out.println("Maximum is : " + max);

	}

	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) {
		
		//declaring various arrays with various size
		Integer[] intArray= {1,2,345,678,3456};
		Double[] floatArray= {568.34 , 23.3 , 99.002 , 34.2};
		String[] stringArray= {"banana","Apple","peach"};
		
		@SuppressWarnings("unused")
		Generics inte = new Generics(intArray);
		Generics flt = new Generics(floatArray);
		Generics str = new Generics(stringArray);

		//inte.testMaximum();
		//flt.testMaximum();
		str.testMaximum();

	}
}
