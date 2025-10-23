/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* bst(int *nums, int beg, int end){
    if(end < beg)
        return NULL ;
    int mid = beg + (end-beg)/2 ;
    struct TreeNode* root = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    root->val = nums[mid];
    root->left = bst(nums, beg, mid-1);
    root->right = bst(nums, mid+1, end);
    return root;
}
struct TreeNode* sortedArrayToBST(int* nums, int numsSize){
    if(numsSize <= 0)
        return NULL;
    else
        return bst(nums, 0, numsSize-1);
}