
package programa1;
import java.util.Scanner;

public class Programa1 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int n;
        long sum=0,sumt=0;
        System.out.print("Cuantos numero desea sumar? ");n=leer.nextInt();
        
        int fibo[]=new int[n];
        fibo[0]=1;fibo[1]=2;
        for(int i=2;i<fibo.length;i++)
        {fibo[i]=fibo[i-1]+fibo[i-2];
        }
        for(int i=0;i<fibo.length;i++)
        {if(((i+1)%2)==0)
           {sum=sum+fibo[i];   }
         if(fibo[i]%2==0)
            {sumt=sumt+fibo[i]; }
        }
        for(int i=0;i<fibo.length;i++)
        {System.out.print(fibo[i]+" ");
        }
        System.out.println(" ");
        System.out.print("La suma posicion pares es: "+sum);
        System.out.println("\nLa suma de terminos pares es: "+sumt);
        
        
    }//main
    
}//public class
