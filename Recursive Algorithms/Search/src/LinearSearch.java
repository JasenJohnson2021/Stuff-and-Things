
public class LinearSearch {

	public static void main(String[] args) {
		//create some dummy data for our method 
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
				'n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
			//call your methods here
			LinearSearch ls = new LinearSearch();
			
			System.out.println(ls.findIndex('a', letters));
		}
	
	//create your first method here 
	public int findIndex(char target, char[] data) {
		if (date == null) return -1;
		int result = -1;
		
		//loob through the data 
		for(int i = 0; i < data.length;i++) {
			char temp = data[i];
			
			if (temp == target) {
				return i;
			}
		}
		
		return result;
	}
	}


