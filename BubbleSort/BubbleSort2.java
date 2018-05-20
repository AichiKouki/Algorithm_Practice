import java.util.Arrays;

public class BubbleSort2{

	public static void main(String[] args) {

		int[] array = new int[] { 5, 4, 6, 7, 1, 9, 8, 2, 3 };
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length - 1 - i; j++){
				if(array[j] > array[j + 1]){
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}