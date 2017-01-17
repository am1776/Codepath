public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int kthsmallest(final List<Integer> a, int k) {
	    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
	  
	    for(Integer i:a){
	        maxHeap.add(i);
	        if(maxHeap.size() == k+1){
	            maxHeap.remove();
	        }
	    }
	    
	    return maxHeap.peek();
	}
}
