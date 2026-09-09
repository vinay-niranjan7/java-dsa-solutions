/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {

        StringBuilder firstNumber=new StringBuilder();
        StringBuilder secondNumber=new StringBuilder();

        while(firstList!=null){
            firstNumber.append(firstList.val);
            firstList=firstList.next;
        }

        while(secondList!=null){
            secondNumber.append(secondList.val);
            secondList=secondList.next;
        }

        BigInteger number1=new BigInteger(firstNumber.reverse().toString());
        BigInteger number2=new BigInteger(secondNumber.reverse().toString());

        BigInteger sum=number1.add(number2);

        String result=sum.toString();

        ListNode dummyNode=new ListNode(0);
        ListNode currentNode=dummyNode;

        for(int i=result.length()-1;i>=0;i--) {
            currentNode.next=new ListNode(result.charAt(i)-'0');
            currentNode=currentNode.next;
        }

        return dummyNode.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna