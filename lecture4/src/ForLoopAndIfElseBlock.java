
public class ForLoopAndIfElseBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] number = {1, 4, 2, 3};
		int findNumber = 3;
		int numberFind = 0;
		
		for(int i = 0; i < number.length; i++){
			if(number[i]==findNumber){
				numberFind = number[i];
				
			}
		}
		
		if(numberFind == 1){
			System.out.println("one");
		}else if(numberFind == 2){
			System.out.println("two");
		}else if(numberFind == 3){
			System.out.println("three");
		}else if(numberFind == 4){
			System.out.println("four");
		}else{
			System.out.println("no such number");
			
	
		}
		
		
		
		
	
		
		

	}

}
