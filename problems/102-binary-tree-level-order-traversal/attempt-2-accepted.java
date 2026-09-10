
class Solution {
    public void Order(TreeNode root, List<List<Integer>> ans, int level) {
        if (root == null) return;

        if (ans.size() == level) {
            ans.add(new ArrayList<>());
        }

        ans.get(level).add(root.val);

        Order(root.left, ans, level + 1);
        Order(root.right, ans, level + 1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Order(root, ans, 0);
        return ans;
    }
}