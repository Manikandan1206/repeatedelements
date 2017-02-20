import java.util.LinkedHashSet;
import java.util.*;
public class RepeatedElements {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
	    int size=in.nextInt();
	    System.out.println("Enter the Elements of an Array");
	    int array[]=new int[size];
	    for(int i=0;i<size;i++){
	    	array[i]=in.nextInt();
	    	
	    }
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		for(int i=0;i<array.length;i++){
			if(!(lh.add(array[i]))){
				System.out.println(array[i]);
				
			}
		}
	}

}
