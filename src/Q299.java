import java.util.*;
public class Q299 {
	 public String getHint(String secret, String guess) {
	        HashMap<Character,Integer>secretMap=new  HashMap<Character,Integer>();
	        HashMap<Character,Integer>guessMap=new  HashMap<Character,Integer>();
	        int bull=0,cow=0;
	        for(int i=0;i<secret.length();i++)
	            {
	        	if(!secretMap.containsKey(secret.charAt(i)))
	        		secretMap.put(secret.charAt(i), 1);
	        	else secretMap.put(secret.charAt(i), secretMap.get(secret.charAt(i))+1);
	            }
	        for(int i=0;i<secret.length();i++){
	        	if(secret.charAt(i)==guess.charAt(i)) {
	        	secretMap.put(secret.charAt(i), secretMap.get(secret.charAt(i))-1);
	        	bull++;
	        	}}
	        for(int i=0;i<secret.length();i++){
	        	if(secret.charAt(i)!=guess.charAt(i)&&secretMap.containsKey(guess.charAt(i))&&
	        			secretMap.get(guess.charAt(i))>=0) {cow++;
	        	secretMap.put(guess.charAt(i), secretMap.get(guess.charAt(i))-1);
	        	}}
	        
	        return bull+"A"+cow+"B";
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String secret = "1123", guess = "0111";
		System.out.print(new Q299().getHint(secret, guess));
	}

}
