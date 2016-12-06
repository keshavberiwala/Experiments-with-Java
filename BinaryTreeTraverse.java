class Node
{
    Node left, right;
    int data;    
    public Node()
    {
        left= null;
        right=null;
        data=0;
    }

    public Node(int d, Node l, Node r)
    {
        left = l;
        right = r;
        data = d;
    }

    public void setRight(Node n)
    {
        right = n;
    }

    public void setLeft(Node n)
    {
        left = n;    
    }

    public void setData(int d)
    {
        data = d;
    }

    public Node getRight()
    {
        return right;
    }

    public Node getLeft()
    {
        return left;
    }
}

public class BinaryTreeTraversal
{
    void dispPreOrder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            dispPreOrder(root.left);
            dispPreOrder(root.right);
        }
    }

    void dispInOrder(Node root)
    {
        if(root!=null)
        {
            dispInOrder(root.left);
            System.out.print(root.data+" ");
            dispInOrder(root.right);
        }
    }

    void dispPostOrder(Node root)
    {
        if(root!=null)
        {
            dispPostOrder(root.left);
            dispPostOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

}
