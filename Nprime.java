import java.util.Scanner;
class Nprime
{
    public static void main(String[] args) 
    {
        int n,i,c=0,num=1;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n :-");
        n=sc.nextInt();

        while(c<n)
        {
            num=num+1;
            for(i=2;i<=num;i++){
                if(num%i==0){
                break;
            }
        }
       
        if(i==num)
        {
            c=c+1;
        }
    }
        System.out.println("The value of Nth Prime number is = "+num);

    }
}


OUTPUT :-
    
    7 power of 5 is :- 16807
PS F:\Java> javac Nprime.java
PS F:\Java> java Nprime 
Enter the value of n :-
8
The value of Nth Prime number is = 19
    
    
