import java.util.Scanner;
	class Cube{
		public static void main(String args[]){
			int a,per,tsa,csa,vol;
			Scanner sc=new Scanner(System.in);
			
            System.out.println("Enter the length of Cube :-");
            a=sc.nextInt();

            per=6*a;
		    System.out.println("Perimeter of Cube = "+per);

		    tsa=6*(a*a);
		    System.out.println("Total surface area of Cube = "+tsa);

			csa=4*(a*a);
			System.out.println("Curved surface area of Cube = "+csa);

			vol=a*a*a;
			System.out.println("Volume of Cube = "+vol);
			}
	}


OUTPUT :-
	
	PS F:\Java> javac Cube.java
PS F:\Java> java Cube
Enter the length of Cube :-
5
Perimeter of Cube = 30
Total surface area of Cube = 150
Curved surface area of Cube = 100
Volume of Cube = 125
	
	
