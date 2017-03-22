package leetcode;

public class AddTwoNumbers {
	public static ListNode Solution(ListNode l1, ListNode l2){
		ListNode prev = new ListNode(0);
		ListNode head = prev;
		int carry = 0;
		while(l1!=null || l2!=null || carry !=0){
			ListNode curr = new ListNode(0);
			int val1 = (l1 == null)?0:l1.val;
			int val2 = (l2 == null)?0:l2.val;
			int sum = val1+val2+carry;
			carry = sum/10;
			curr.val = sum%10;
			//why not prev? if set to prev, prev.val will be overridden.
			prev.next = curr;
			// move the prev pointer to next
			prev = prev.next;
			l1 = (l1==null)?l1:l1.next;
			l2 = (l2==null)?l2:l2.next;
		}
		return head.next;
	}
	public static void main(String[] args){
		ListNode l11 = new ListNode(2);
		ListNode l12 = new ListNode(4);
		ListNode l13 = new ListNode(3);
		ListNode l21 = new ListNode(5);
		ListNode l22 = new ListNode(6);
		ListNode l23 = new ListNode(4);
		l11.next = l12;
		l12.next = l13;
		l21.next = l22;
		l22.next = l23;
		ListNode res = Solution(l11, l21);
		while(res!=null){
			System.out.print(res.val+"\n");
			res = res.next;
		}
	}

}
