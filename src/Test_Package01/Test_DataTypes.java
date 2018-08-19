package Test_Package01;

public class Test_DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 11111;
		double d = 10.0;
		float f = 5.335646461313131313f;
		//when initializing we have to put the suffix "f" at end, otherwise the compiler will identify it as a double value
		long l = 121133l;
		char c = 'g'; // only one character is allowed 
		Boolean b = true;	
		String s = "My First String";
		
		String a = new String(); // bcz String is a class not a data type.
		s = "This " + "is " + "called "+ "the " +"concatenation " + b; // can be concatenated with another data type also 
		
		System.out.println(s);
		
		//*****************************************************//
		//Ternary Operator - it's like a if else statement
		//*****************************************************//
	
		Boolean bt = false;
		String sg = (bt==true? "True" : "False");
		System.out.println(sg);
		
		
	}

}
