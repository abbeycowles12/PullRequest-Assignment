/**
 * @author Abigail Cowles
 * 	    - int threeAndFive() : Returns the sum of all the multiples of 3 or 5 below 1000
 * 		- int evenFibSum() : Returns the sum of the even-valued terms less than 4 million in the Fibonacci Sequence
 * 		- int largestPrimeFactor() : Returns the largest prime factor of the number 600851475143
 * 	- Create a separate Driver class and test your program by outputting the answers to your static methods
 */
package Cowles_Abigail;

public class Excercises {
	
	public int threeAndFive(){
		int sum = 0;
		
		for(int i = 0; i<1000;i++){
			if(i % 3 == 0 || i % 5 ==0){
				sum += i;
			}
		}
		
		return sum;
	}
	
	public int evenFibSum(){

	    int fir = 0;
	    int sec = 2; 
	    int sum = fir + sec; 
	  
	    while (sec <= 4000000) 
	    { 
	        int thi = 4*sec + fir; 
	        fir = sec; 
	        sec = thi; 
	        sum += sec; 
	    }
	  
	    return sum; 
		
	}
	
	public int largestPrimeFactor(){
		long num = 600851475143L;
		int fac = 0;
		boolean isPrime = true;

        for (long i = 1; i < num; i++) {
            if (num % i == 0 ) {
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                	fac = (int) i;
                }
            }
        }
        return fac;
	}
        
}
