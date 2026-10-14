import java.util.*;
class Paranthesis
{
	public static boolean check(String s)
	{
		Stack <Character> stk=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='{' ||ch=='('||ch=='[')
			 {
				stk.push(ch);
			 }
			 else
			 {
				 if(stk.isEmpty())
				 {
					 return false;
				 }
				 else
				 {
					 int top=stk.pop();
					 if ((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top != '[')) 
					{
                    return false;
				    }
			     }
				 if(stk.size()==0)
				 {
					 return true;
				 }
				 
			 }	
		}
		return stk.isEmpty();
		
	}
public static void main(String args[])
{
	String s="(){}";
	System.out.println(check(s));
}
}