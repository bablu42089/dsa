package trees;

import java.util.Scanner;

public class binarytree {
    class Node
    {
        int value;
        Node left;
        Node right;

        Node(int value)
        {
            this.value=value;
        }
    }
   public Node root;
    public  void populate(Scanner scanner)
    {
        System.out.println("enter the root node:");
        int val=scanner.nextInt();
        root=new Node(val);
        populate(scanner,root);
    }
    public void populate(Scanner scanner,Node root)
    {
        System.out.println("do you want to enter left of:"+root.value);
        boolean left=scanner.nextBoolean();
        if(left)
        {
            System.out.println("enter the vlaue of the left of"+root.value);
            int val=scanner.nextInt();
            root.left=new Node(val);
            populate(scanner,root.left);
        }
        System.out.println("do you want to enter right of:"+root.value);
        boolean right=scanner.nextBoolean();
        if(right)
        {
            System.out.println("enter the vlaue of the left of"+root.value);
            int val=scanner.nextInt();
            root.right=new Node(val);
            populate(scanner,root.right);
        }
    }
public  void display()
{
    display(root," ");
}
public void display(Node root,String indent)
{
    if(root==null)
    {
        return;
    }
    System.out.println(indent+root.value);
    display(root.left,"\t");
    display(root.right,"\t");

}
public  void pd()
{
    pd(root,0);
}
void pd(Node node,int level)
{
    if(node==null)
    {
        return;
    }
    pd(node.right,level+1);
    if(level!=0)
    {
        for (int i = 0; i < level-1; i++) {
            System.out.print("|\t\t");
        }
        System.out.println("|------>"+node.value);
    }
    else
    {
        System.out.println(node.value);
    }
    pd(node.left,level+1);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        binarytree t=new binarytree();
        t.populate(sc);
        t.pd();
    }
}
