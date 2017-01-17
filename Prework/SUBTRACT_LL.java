public class Solution {
	public ListNode subtract(ListNode a) {
	    if(a == null){
	        return a;
	    }
	    
	    ListNode slow = a;
	    ListNode fast = a;
	    
	    while((fast.next != null) && (fast.next.next != null)){
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    
	    ListNode first = a;
	    ListNode second = reverse(slow.next);
	    ListNode temp = second;
	    
	    while(second != null){
	        first.val = second.val - first.val;
	        second = second.next;
	        first = first.next;
	    }
	    
	    reverse(temp);
	    return a;
	}
	
	
	private ListNode reverse(ListNode b){
	    if(b == null){
	        return null;
	    }
	    
	    ListNode  prev, curr, next;
	    
	    prev = b;
	    curr = prev.next;
	    prev.next = null;
	    
	    while(curr != null){
	        next = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr  = next;
	    }
	    return prev;
	}
}