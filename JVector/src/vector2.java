
public class vector2 {

	public static void main(String[] args) {
			
		int [] v = new int[] {17, 12, 15, 9, 14};
		int x = 33;
		int index = indexOf(v , x);
		System.out.println("index = " + index );
		System.out.println("fin");
	}
	
	public static int indexOf(int[] v, int x ) {
		
		//Forma de hacerlo con while
		
		int index = 0;
		while (index < v.length  && v[index] != x)
			index ++;
		if (index == v.length)
			return -1;
		return index;
		
//		//Forma de hacerlo con FOR
//	 for (int index = 0; index < v.length; index++)
//		 if (v[index] == x)
//			 return index;
//	    return -1;
	}
}
