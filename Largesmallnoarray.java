
import java.util.Scanner;

class Largesmallnoarray
{   
    public static void main(String[] args)   
    {   
        int size,i;
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the size of the array :- ");
            size=sc.nextInt();

            int array[]=new int[size];

            System.out.println("Enter the elements of the array :- ");
            for(i=0; i<size; i++)  
            {    
                array[i]=sc.nextInt();  
            }  
            
            System.out.println("Entered elements are :- ");
            sc.close();

            for (i = 0; i < size - 1; i++) 
            {
                System.out.print(array[i] + "  ,  ");
            } 

            System.out.println(array[array.length - 1]);

            int max = array[0];  
            for (i = 0; i < size; i++) 
            {  
                if(array[i] > max)  
                max = array[i];  
            }  
            System.out.println("Largest element present in the array :- " + max);  

            int min = array[0];  
            for (i = 0; i < size; i++) 
            {  
                if(array[i] < min)  
                min = array[i];  
            }  
            System.out.println("Smallest element present in the array :- " + min);  
        }
    }
}


OUTPUT :-
    
    PS F:\Java> javac Largesmallnoarray.java
PS F:\Java> java Largesmallnoarray      
Enter the size of the array :- 
5
Enter the elements of the array :- 
89
12
56
9
51
Entered elements are :- 
89  ,  12  ,  56  ,  9  ,  51
Largest element present in the array :- 89
Smallest element present in the array :- 9

    
