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

public class BinarySearchTree
{
    boolean search(Node root, int item)
    {
        boolean found=false;
        if(root!=null)
        {
            if(item==root.data)
                found=true;
            else if(item<root.data)
                return search(root.left, item);
            else if(item>root.data)
                return search(root.right, item);
        }
        return found;
    }
}
