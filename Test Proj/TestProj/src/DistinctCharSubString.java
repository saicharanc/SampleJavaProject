
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class DistinctCharSubString {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(reader);
		while(true){
			String input_string = new String(in.readLine().trim());
			distinctCharCalculator(input_string);
		}
	}

	private static void distinctCharCalculator(String input_string) {
		HashMap<Character, Integer> counter = new HashMap<Character, Integer>();
		int totalDistinctChars = 0;
		for (char c : input_string.toCharArray()){
			if (!counter.containsKey(c)){
				totalDistinctChars += 1;
				counter.put(c, 0);
			}
		}
		int totalCounts = 0,startIndex =0,minLength = input_string.length(),tempLength;
		for (int i = 0 ; i < input_string.length() ; i++){
			counter.put(input_string.charAt(i) , counter.get(input_string.charAt(i))+1);
			if (counter.get(input_string.charAt(i)) == 1){
				totalCounts += 1;
			}
			if (totalCounts == totalDistinctChars){
				while(counter.get(input_string.charAt(startIndex)) > 1){

					counter.put(input_string.charAt(startIndex) ,counter.get(input_string.charAt(startIndex)) -1);
					startIndex += 1;
				}
				tempLength = i + 1 - startIndex;
				if (tempLength < minLength){
					minLength = tempLength;
				}
			}
		}
		System.out.println(minLength);
	}
}