package star;
import java.util.*;
class prime{
	
		public static void main(String[] args) {
		    Scanner sc=new Scanner (System.in);
		    int flag=0;
		    
			System.out.print("enter no. :-   ");
			int n=sc.nextInt();
			
			for(int i=2;i<=n/2;i++){
			    if(n%i==0){
			    flag++;
			    }
			}
			if(flag==1){
			    System.out.println(n+"is prime");
			}
			else{
			    System.out.println(n+"is not prime");
			}
			
//			for(int i=1; i<=n; i++) {
//				for(int j=2;j<=i;j++) {
//					    if(i%j==0){
//					    flag++;
//					   
//					    }
//					   
//					}
//					if(flag==1){
//					    System.out.println("prime/n");
//					}
//					else{
//					    System.out.println("not"+i);
//					}
//				}
			}
		}
	