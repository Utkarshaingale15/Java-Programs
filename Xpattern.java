
class Xpattern
{  
    public static void main(String []args)
    {  
      
       int lines=8,i,j;  
        
        for(i=1;i<lines;i++)
        {
            for(j=1;j<=lines/2;j++)
            { 
                if(i==j)
                {  
                    System.out.print(j);  
                }  
                else if(i>4 && j==lines-i)
                {  
                    System.out.print(j);  
                }  
                else
                {  
                   System.out.print(" ");  
                }  
            }  
            j=j-2;  

            while(j>0)
            { 
                if(i==j)
                {  
                System.out.print(j);  
                }  
                else if(i>4 && j==lines-i)
                {  
                    System.out.print(j);  
                }  
                else
                {  
                    System.out.print(" ");  
                }  
      
                j--;  
            }  
            System.out.println("");  
        }  
    }  
}  



OUTPUT :-
    
    
         *
PS F:\Java> javac Xpattern.java
PS F:\Java> java Xpattern

1     1
 2   2
  3 3
   4
  3 3
 2   2
1     1
    
    
    