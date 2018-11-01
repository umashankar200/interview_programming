package interview_programming;

public class StringReverse {
	
	String reverseString="umashankar";
	
	public static void main(String[] args) {
		StringReverse obj=new StringReverse();
		String convertIntoCharArray ="umashankar";
		int dataLength=convertIntoCharArray.length()-1;
		String reverseData="";
		for(int i=dataLength;i>=0;i--) {
			 reverseData =reverseData+convertIntoCharArray.charAt(i);
		}
		
		System.out.println("reverseData is "+reverseData);
		
	}
	

}
