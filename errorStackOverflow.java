public class errorStackOverflow{
	public static void main(String [] args){
		doNotCodeThis(0);
	}
	public static void doNotCodeThis(int num){
		doNotCodeThis(1);
	}
}