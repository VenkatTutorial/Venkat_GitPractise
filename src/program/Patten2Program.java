package program;

public class Patten2Program {

	public static void reversePattern(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				if(j<i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
