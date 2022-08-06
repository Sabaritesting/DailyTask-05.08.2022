package Task8;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a sample string.";
        char[] arr = new char[] { ' ', ' ', ' ', ' ',' ', ' ', ' ', ' ' };
        str.getChars(4, 10, arr, 2);
        System.out.println("The char array equals \"" +
            arr + "\"");
	}

}
