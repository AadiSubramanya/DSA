/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    while (headA){
        struct ListNode *temp = headB;
        while(temp){
            if (temp == headA){
                return headA;
            }
            temp = temp->next;
        }
        headA = headA->next;
    }
    return NULL;
}