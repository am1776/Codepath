public class Solution {
	public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
	    ArrayList<ArrayList<Integer>> solution = new ArrayList<ArrayList<Integer>>();
	    
	    if(a<1){
	        return solution;
	    }
	    
	    for(int i = 0; i < (2*a - 1); i++){
	        ArrayList<Integer> temp = new ArrayList<Integer>();
	        for(int j = 0; j < (2*a - 1); j++){
	                int x1 = Math.abs(i-(a-1));
	                int y1 = Math.abs(j-(a-1)); 
	                temp.add(Math.max(x1,y1)+1);
	        }
	        solution.add(temp);
	    }
	    return solution;
	}
}
