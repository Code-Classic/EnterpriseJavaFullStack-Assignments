package loopnameprint;

public class AssignmentOne {

	public static void main(String[] args) {
		int k = 5;
		int n = 14;
		
		
		System.out.println("---------------------------");
		System.out.println("Question 1");
		System.out.println("---------------------------");
		for(int i=0; i<n ; i++) {
			
			//I
			System.out.print("    ");
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n-1)/2 || i==n-1) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//N
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==j || j==n-1) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//E
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0||i==(n-1)/2||i==n-1||j==0) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//U
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 && i!=n-1 || j==n-1 && i!=n-1 || (i==n-1 && j>0 && j<n-1)) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//R
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || (j==n-1 && i!=0 && i!=(n-1)/2 && i<(n-1)/2) || (i==0 && j<n-1)  || (i==j) && i>(n-1)/2 || (i==(n-1)/2 && j<n-1)) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//O
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 && i!=n-1 && i!=0 || j==n-1 && i!=n-1 && i!=0 || (i==n-1 && j>0 && j<n-1) || (i==0 && j>0 && j<n-1)) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//N
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==j || j==n-1) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//T
			System.out.print("\t\t");
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n-1)/2) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//E
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0||i==(n-1)/2||i==n-1||j==0) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//C
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 && j>=(n-1)/4 && j<=(3*n-1)/4 || 
						j==0 && i>=(n-1)/4 && i<=(3*n-1)/4 || 
						i==n-1 && j>=(n-1)/4 && j<=(3*n-1)/4 || 
						i+j==(n-1)/4 || 
						j-i==(3*n-1)/4 ||
						i-j ==(3*n-1)/4 ||
						i+j == (n-1)+(3*n-1)/4) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==(n-1)/2) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//N
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==j || j==n-1) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//O
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 && i!=n-1 && i!=0 || j==n-1 && i!=n-1 && i!=0 || (i==n-1 && j>0 && j<n-1) || (i==0 && j>0 && j<n-1)) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//L
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 || i==n-1) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//O
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0 && i!=n-1 && i!=0 || j==n-1 && i!=n-1 && i!=0 || (i==n-1 && j>0 && j<n-1) || (i==0 && j>0 && j<n-1)) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//G
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(i==0 && j>=(n-1)/4 && j<=(3*n-1)/4 || 
						j==0 && i>=(n-1)/4 && i<=(3*n-1)/4 || 
						i==n-1 && j>=(n-1)/4 && j<=(3*n-1)/4 || 
						i+j==(n-1)/4 || 
						j-i==(3*n-1)/4 ||
						i-j ==(3*n-1)/4 ||
						i+j == (n-1)+(3*n-1)/4 ||
						i==((3*n-1)/4)-1 && j>=(n-1)/2) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}
			
			//Y
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if((i<=(n-1)/2 && (i==j || j+i==n-1)) || (j==(n-1)/2) && i>=(n-1)/2) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
				
			}	
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("Question 2");
		System.out.println("---------------------------");
				for (int i = 1; i <= k - 1; i++) {
					for (int j = 1; j <= k - 1; j++) {
						System.out.print(i);
					}
					System.out.println();
				}

				System.out.println();
				System.out.println("---------------------------");
				System.out.println("Question 3");
				System.out.println("---------------------------");

				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i + j <= (n - 1) / 2 || j - i >= (n - 1) / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}

				System.out.println();
				System.out.println("---------------------------");
				System.out.println("Question 4");
				System.out.println("---------------------------");

				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (i-j >=(n - 1) / 2||i+j>=(n-1)+(n-1)/2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
				System.out.println("---------------------------");
				System.out.println("Question 4");
				System.out.println("---------------------------");
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (i==0||i==(n-1)||i + j <= (n - 1) / 2||i-j >=(n - 1) / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
	}

}


