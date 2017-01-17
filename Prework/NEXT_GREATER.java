public class Solution {
	
	public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
	    if((a == null)||(a.size() == 0)){
	        return a;
	    }
	    Stack<Wrapper> s = new Stack<Wrapper>();
	    ArrayList<Integer> sol = new ArrayList<Integer>();
	    sol.add(-1);
	    s.push( new Wrapper(a.get(0), 0));
	    
	    int len = a.size();
	    
	    
	    for(int i = 1; i  < len; i++){
	        sol.add(-1);
	        while((!s.empty())&&(a.get(i) > s.peek().val)){
	           sol.set(s.peek().index, a.get(i));
	           s.pop();
	        }
	        s.push(new Wrapper(a.get(i), i));
	    }
	    
	    return sol;
	}
	
	private class Wrapper{
	    int val;
	    int index;
	    
	    Wrapper(int val, int index){
	        this.val = val;
	        this.index = index;
	    }
	}
}
