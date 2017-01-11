
public class CombinationsOfArray {

	public static void main(String[] args) {
		String[] first = {"The", "A", "That"};
		String[] second = {"Dog", "Cat", "Bear"};
		String[] third = {"Ran", "Jumped", "Swam", "Ate", "Walked"};
		
		for(int i=0; i<first.length; i++){
			for(int j=0; j<second.length; j++){
				for(int k=0; k<third.length; k++){
					System.out.print(first[i]+second[j]+third[k]+"\n");
				}
			}
		}
	}

}
