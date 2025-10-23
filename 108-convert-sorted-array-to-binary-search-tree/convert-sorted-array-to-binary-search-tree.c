/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* sortedArrayToBST(int* nums, int numsSize) {
    if(numsSize<=0) return NULL;
    int index=numsSize/2;
    struct TreeNode *left=sortedArrayToBST(nums,(numsSize/2));
    struct TreeNode *right=sortedArrayToBST(nums+(numsSize/2)+1,numsSize-index-1);
    struct TreeNode * newnode=(struct TreeNode *)malloc(sizeof(struct TreeNode));
    newnode->val=nums[index];
    newnode->left=left;
    newnode->right=right;
    return newnode;
}