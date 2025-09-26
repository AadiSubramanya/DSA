/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    if(list1 == NULL)
    {
        return list2;
    }
    

    if(list2 == NULL)
    {
        return list1;
    } 


    struct ListNode *temp = list1;

    if (list1->val > list2->val){
        temp = list2;
        list2 = list2->next;
    }
    else{
        list1 = list1->next;
    }

    struct ListNode *curr = temp;

    while (list1 && list2){
        if(list1 -> val < list2 -> val){
            curr->next = list1;
            list1 = list1 -> next;
        }
        else{
            curr->next = list2;
            list2 = list2 -> next;
        }
        curr = curr -> next;
    }

    if(!list1)
        curr -> next = list2;
    else
        curr -> next = list1;

    return temp;
}