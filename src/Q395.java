import java.text.DateFormat;
import java.util.*;
 public class Q395 {
     public int longestSubstring(String s, int k) {
         int n=s.length();
         
         if(n==0)return 0;
        int []count=new int[26];
        List<Integer>list=new ArrayList<Integer>();
        for(int h=1;h<=26;h++) {
            int ans=0;
            Arrays.fill(count, 0);
           
            
            int i=0,j=0,countUnique=0,countNoLessThanK=0;
           while(j<n) {
             // loop until s[i...j)satisfies the condition but s[i...j] doesn't
               //countUnique means unique characters in s[i...j]
               while(countUnique<=h&&j<n) {
                  
                   if(count[s.charAt(j)-'a']==0)countUnique++;
                count[s.charAt(j)-'a']++;
                if(count[s.charAt(j)-'a']==k)countNoLessThanK++;
                j++;
                if(countUnique==h&&countNoLessThanK==h)ans=Math.max(ans, j-i);
               }
              
               
               while(countUnique>h&&i<j) {
                   if(count[s.charAt(i)-'a']==1)countUnique--;
                   if(count[s.charAt(i)-'a']==k)countNoLessThanK--;
                   count[s.charAt(i)-'a']--;
                   
                   i++;
               }
           }
           list.add(ans);
         }
        return Collections.max(list);
     }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //String s="aaabbb"; int k=3;
        //System.out.print(new Q395().longestSubstring(s, k));
        Date date=new Date();
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());
        java.sql.Date utilDate=new java.sql.Date(System.currentTimeMillis());
        DateFormat ddtf = DateFormat.getDateTimeInstance();  
        System.out.println(ddtf.format(utilDate));
    }

}
