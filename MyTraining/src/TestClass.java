import java.io.*;
import java.util.StringTokenizer;

public class TestClass {
    public static void main(String args[] ) throws Exception {
    	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	   int n = Integer.parseInt(br.readLine());
    	   StringTokenizer st = new StringTokenizer(br.readLine());
    	   int cost = 0, sum = 0;
    	   int[] arr = new int[n];
    	   int[] arrc = new int[n];
    	   int[] arrcc = new int[n];

    	  for(int i = 0; i < n; i++) {
    		  arr[i] = Integer.parseInt(st.nextToken());
    		  if(arr[i] == 0) {
    			  cost++;
    			  arrc[i] =  cost;
    			 //System.out.print(cost + " ");
    		  }else {
    			  if(cost > 0) cost--;
    			  arrc[i] = cost;
     			 //System.out.print(cost + " ");

    		  }
    		  sum = sum + arr[i];
    	  }
    	  //System.out.println();
    	  int max = arrc[0];
    	  int imax1 = 0, imax2 = 0;
    	  for(int i = 1; i < n; i++) {
    		  if(arrc[i] > max) {
    			  max = arrc[i];
    			  imax1 = i;
    		  }
    	  }
    	  int costt = 0;
    	  for(int i = n-1; i >=0; i--) {
    		  if(arr[i] == 0) {
    			  costt++;
    			  arrcc[i] =  costt;
     			 //System.out.print(costt + " ");

    		  }else {
    			 if(cost > 0) costt--;
    			  arrcc[i] = costt;
      			 //System.out.print(costt + " ");

    		  }
    	  }
    
    	  int max2 = arrcc[0];
    	  for(int i = 1; i < n; i++) {
    		  if(arrcc[i] >= max2) {
    			  max2 = arrcc[i];
    			  imax2 = i;
    		  }
    	  }
    
    	  int r = 0, f = 0;
    	  for(int i = 0; i < n; i++) {
    		  if(i <= imax1 && i >= imax2) {
    			  if(arr[i] == 0) {
        			  r++;
        		  }
    		  }else {
    			  if(arr[i] == 1) {
        			  r++;
        			  f++;
        		  }
    		  }
    	  }
    	  if(f == n) {
        	  r = n-1;
    	  }
    	  System.out.println(r);

    }
}