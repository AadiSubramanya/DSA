/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
static struct TreeNode* buildBST(int *nums, int beg, int end) {
    if (beg > end) return NULL;

    int mid = (beg + end) >> 1;  // faster than (beg + (end - beg) / 2)

    struct TreeNode* root = malloc(sizeof(*root)); // cleaner, safer
    if (!root) return NULL; // safety check in real systems

    root->val = nums[mid];
    root->left = buildBST(nums, beg, mid - 1);
    root->right = buildBST(nums, mid + 1, end);
    return root;
}

struct TreeNode* sortedArrayToBST(int* nums, int numsSize) {
    if (!nums || numsSize <= 0) return NULL;
    return buildBST(nums, 0, numsSize - 1);
}