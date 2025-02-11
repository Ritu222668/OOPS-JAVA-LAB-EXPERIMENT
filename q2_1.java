
import java.util.*;
class q2_1{
     public static void main(String[] args) {
          int n;
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter number of rows::");
          n=sc.nextInt();
          for(int i=n;i>=0;i--){
               char ch='A';
               for(int j=0;j<i;j++){
                    System.out.print(ch++);
               }
               System.out.println();
          }
          sc.close();
     }
}