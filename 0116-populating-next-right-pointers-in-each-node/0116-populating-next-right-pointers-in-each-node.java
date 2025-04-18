/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){return null;}
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int n = q.size();
            Node prevNode = null;
            for(int i=0; i<n; i++){
                Node currNode = q.poll();
                if(prevNode != null){
                    prevNode.next = currNode;
                }
                prevNode = currNode;
                

                if(currNode.left !=null) {q.offer(currNode.left);}
                if(currNode.right !=null){q.offer(currNode.right);}
            }
            prevNode.next = null;
        }

        return root;
        
        
    }
}