
public class Array {

	public static void main(String[] args) {

		int array[] = new int[10];
		rellenaArray(array);
		
	}
	
	public static void rellenaArray(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			array[i]= (int) Math.round(Math.random()*20);
		}
		
	}

}
