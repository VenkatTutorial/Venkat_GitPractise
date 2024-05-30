package program;

public class Pattern3 {
	
	public static void main(String[] args) {
			forwardPattern(5);
			topToBottomPattern(5);
			reversePattern(5);
			reverseTopToBottom(5);

	}

	public static void forwardPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void topToBottomPattern(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	
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
	

	
	public static void reverseTopToBottom(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
