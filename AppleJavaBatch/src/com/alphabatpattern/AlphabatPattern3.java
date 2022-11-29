package com.alphabatpattern;

public class AlphabatPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*B
		 *C C
		 *D D D
		 *E E E E
		 * 
		 */
		
		
		
		
		int count =65;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(((char)(count+i)+" "));
			}
			System.out.println();
		}
	}

}
