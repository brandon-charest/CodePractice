
public class MatchingBrakets {
	public static void main(String[] args){		
		String list1=("[{()}]");
		String list2=("({[()]})");
		String list3=("{[(])}");
		
		System.out.println(matchingParenthensies(list1));
		System.out.println(matchingParenthensies(list2));
		System.out.println(matchingParenthensies(list3));
	}
	
	private static boolean matchingParenthensies(String s){
		Stack stack = new Stack();
		for(int i=0; i<s.length(); i++){
			char c= s.charAt(i);
			
			if(c == '(' || c== '[' || c== '{'){
				stack.push(c);
			}
			else if( c== ')' || c==']' || c=='}'){
				if(s.isEmpty()){
					return false;
				}
				switch(c){
				case ')':
					if(stack.pop() != '('){
						return false;
					}
					break;
				case ']':
					if(stack.pop() != '['){
						return false;
					}
					break;
				case '}':
					if(stack.pop() != '{'){
						return false;
					}
					break;
				default:
					break;
				}
			}			
		}
		if(stack.isEmpty()){
			return true;
		}
		return false;
	}

}
