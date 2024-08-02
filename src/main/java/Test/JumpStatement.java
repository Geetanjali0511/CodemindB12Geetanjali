package Test;

public class JumpStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		
		while(true) {
				System.out.print(a+"  ");
				a++;
				if(a>20) {
					break;
					
				}
		}	
				System.out.println("");
				System.out.println("---------------------------------------------------------------");
			
				for(int i=1;i<=30;i++) {
					
					if(i>25 && i<29) {
						continue;
					}else {
						
						System.out.print(i +"  ");
						
					}
				}
	}

	}


