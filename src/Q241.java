
import java.util.*;
public class Q241 {
public List<Integer> diffWaysToCompute(String input) {
	List<Integer> list=new ArrayList<Integer>();
	List<Integer> split=new ArrayList<Integer>();
	for(int i=0;i<input.length();i++)
		{
		char ch=input.charAt(i);
		if(ch=='+'||ch=='-'||ch=='*')
			split.add(i);
		}
	if(split.isEmpty()) {
		list.add(Integer.parseInt(input));
		return list;
	}
	//HashSet<Integer>set=new HashSet<Integer>();
	for(int i=0;i<split.size();i++) {
		int index=split.get(i);
		String left=input.substring(0, index);
		String right=input.substring(index+1);
		List<Integer> listleft=diffWaysToCompute(left);
		List<Integer> listright=diffWaysToCompute(right);
		switch(input.charAt(index)) {
		case '+':
			for(int temp1:listleft)
				for(int temp2:listright)
					list.add(temp1+temp2);
			break;
		case '-':
			for(int temp1:listleft)
				for(int temp2:listright)
					list.add(temp1-temp2);
			break;
		case '*':
			for(int temp1:listleft)
				for(int temp2:listright)
					list.add(temp1*temp2);
			break;
		}
		
	}
        //list.addAll(set);
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="2*3-4*5";
		List<Integer> list=new Q241().diffWaysToCompute(input);
		for(int temp:list)System.out.println(temp);
	}

}
