/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
void klol(struct TreeNode* root, int* post, int* i) {
    if (!root) return;

    klol(root->left, post, i);
    klol(root->right, post, i);
    post[(*i)++] = root->val;
}

int* postorderTraversal(struct TreeNode* root, int* returnSize) {
    int* postorder = (int*)malloc(sizeof(int)*100);
    int i = 0;

    klol(root, postorder, &i);
    *returnSize = i;

    return postorder;
}