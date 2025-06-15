public class DeleteDuplicatesLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);

        System.out.println(deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;

        while (prev.next != null) {
            if (prev.val == prev.next.val) {
                prev.next = prev.next.next;
            }
            else {
                prev = prev.next;
            }
        }
        return head;
    }

}

