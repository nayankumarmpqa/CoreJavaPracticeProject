package logicalProblems;

public class PrintHelloinCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String s = "ahceclwlxo";
		// Approach1
		String[] split = s.split("");
		for (int i = 1; i < split.length; i = i + 2) {
		System.out.print(split[i].toUpperCase());
		}
		
	}

}
