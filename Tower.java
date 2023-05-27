import java.util.Scanner;
public class Main {
    //this function is used to define the 
      public static void hanoi(int a,String source,String dest,String aux){
        if(a==1){
            System.out.println(source+" -- "+dest );
            return;//this gave our desire output in the form of A,B,C
        }
        hanoi(a-1,source,aux,dest);//by using this call we pass two disc in the aux
        System.out.println(source+" -- "+dest);
        hanoi(a-1,aux,dest,source);//by using this call we pass two disc from aux to source
        }
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        //System.in is used to find the input from the keyboard
        System.out.println("Enter the value of  n");
        int a=sc.nextInt();
        hanoi(a,"A","C","B");//this is used to call the function
    }
}
