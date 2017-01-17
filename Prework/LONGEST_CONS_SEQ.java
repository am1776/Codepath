public class Solution {
	public int longestConsecutive(final List<Integer> a) {
	    if(a==null){
	      return 0;  
	    }
	    
	    if(a.size() == 0){
	        return 0;
	    }
	    
	    HashSet<Integer> hashSet = new HashSet();
	    int maxCount = 1;
	    
	    for(int n:a){
	        hashSet.add(n);
	    }
	    
	    for(int n:a){
	        int count = 1;
	        
	        int left = n - 1;
	        
	        while(hashSet.contains(left)){
	            hashSet.remove(left);
	            count ++;
	            left = left -1;
	        }
	        
	        int right = n +1;
	        
	        while(hashSet.contains(right)){
	            hashSet.remove(right);
	            count ++;
	            right = right + 1;
	        }
	        maxCount = Math.max(maxCount, count);
	    }
	    return maxCount;
	}
}