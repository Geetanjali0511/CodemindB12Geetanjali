package Test;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArithmeticOperators AO= new ArithmeticOperators();
    
    AO.operator(23);
	}

     public void operator( int age) {
      String country="india";
      //String country="India";
       boolean eligibleforvoting;
  
       eligibleforvoting=age>18 && country.equals("india")?true:false;
       System.out.println("Eligibleforvoting: "+ eligibleforvoting);
     
     }
}