package assignement;

public class AddLinkedList {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode listNode = addLinkedList(l1, l2);
		
		while (listNode!=null) {
			System.out.print(listNode.val + " ");
			listNode = listNode.next;
		}
	}

	public static ListNode addLinkedList(ListNode l1, ListNode l2) {
		String s1="";
		String s2="";
		
		while (l1!=null) {
			s1=l1.val+s1;
			l1=l1.next;
		}
		while (l2!=null) {
			s2=l2.val+s2;
			l2=l2.next;
		}
		
		Integer int1 = Integer.parseInt(s1);
		Integer int2 = Integer.parseInt(s2);
		String string = String.valueOf(int1+int2);
		ListNode ans = new ListNode(Integer.parseInt(String.valueOf(string.charAt(0))));
		ListNode point=ans;
		for (int i = 1; i < string.length(); i++) {
			point.next=new ListNode(Integer.parseInt(String.valueOf(string.charAt(i))));
			point=point.next;
		}	
		return ans;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}
