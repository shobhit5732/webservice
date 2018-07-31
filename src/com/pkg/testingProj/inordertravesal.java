package com.pkg.testingProj;


import java.util.Stack;
/*
class Node {

    char data;
    CNode left, right;
    Node(){}
    Node(char item) {
        this.data = item;
        this.left = null;
        this.right = null;
    }

}*/


class inordertravesal {}/*{
    CNode root;


    void iterativeTraversal(CNode node) {

        if (node == null) return;
        Stack<CNode> stacknode = new Stack<>();
        stacknode.push(node);

        while (stacknode.empty() == false) {

            CNode temp = stacknode.peek();
            System.out.println(temp.data);
            stacknode.pop();

            if (temp.right != null)
                stacknode.push(temp.right);


            if (temp.left != null)
                stacknode.push(temp.left);


        }
    }

    // driver program to test above functions
    public static void main(String args[]) {
       *//* inordertravesal tree = new inordertravesal();
        tree.root = new CNode(14);
        tree.root.left = new CNode(8);
        tree.root.right = new CNode(2);
        tree.root.left.left = new CNode(3);
        tree.root.left.right = new CNode(5);
        tree.root.right.left = new CNode(1);*//*
        //tree.iterativeTraversal();
       // System.out.println("Maximum width is " + tree.getMaxWidth(tree.root));
       // System.out.println("get level diff " + tree.getLevelDiff(tree.root));
       // System.out.println(""+parenthesisBalance("[(])".toCharArray()));
         System.out.println("number of possible moves: "+possibleMoves(5));



    }


    *//* Function to get the maximum width of a binary tree*//*
    int getMaxWidth(CNode node) {
        int maxWidth = 0;
        int width;
        int h = height(node);
        int i;

		*//* Get width of each level and compare
		the width with maximum width so far *//*
        for (i = 1; i <= h; i++) {
            width = getWidth(node, i);
            if (width > maxWidth)
                maxWidth = width;
        }

        return maxWidth;
    }

    *//* Get width of a given level *//*
    int getWidth(CNode node, int level) {
        if (node == null)
            return 0;

        if (level == 1)
            return 1;
        else if (level > 1)
            return getWidth(node.left, level - 1)
                    + getWidth(node.right, level - 1);
        return 0;
    }

    *//* UTILITY FUNCTIONS *//*

    *//* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*//*
    int height(CNode node) {
        if (node == null)
            return 0;
        else {
            *//* compute the height of each subtree *//*
            int lHeight = height(node.left);
            int rHeight = height(node.right);

            *//* use the larger one *//*
            return (lHeight > rHeight) ? (lHeight + 1) : (rHeight + 1);
        }


    *//*
        14
       !  !
       8   2
     |  | | |
     3  5 1
     *//*
    }

    //int h = height(node);


    int getLevelDiff(CNode node)    {
        if(node ==null) return  0;

           else return   node.data - getLevelDiff(node.left)-getLevelDiff(node.right);



    }

    int diffOddEvenLevelOfTree(CNode node, int level)
    {
        int evenCount=0,oddCount=0;
        if(node.left == null && node.right == null ) return  node.data;

        while(node.left !=null || node.right != null)
        {

            if(node.left!=null || node.right!=null)
            if (level % 2 == 0) evenCount= node.left.data+node.right.data;
            if (level % 2 != 0) oddCount= node.left.data+node.right.data;

            level--;
          return   diffOddEvenLevelOfTree(node.left, level)+diffOddEvenLevelOfTree(node.right, level);


        }
        return oddCount-evenCount ;
    }

    static boolean matchParent(char ch1,char ch2)
    {
        if(ch1 == '{' && ch2 == '}')
        {
            return true ;
        }
        if(ch1 == '[' && ch2 == ']')
        {
            return true ;
        }
        if(ch1 == '(' && ch2 == ')')
        {
            return true ;
        }
        return false;
    }

    static boolean parenthesisBalance (char[]a) {
        boolean bool = true;
        Stack<Character> stack = new Stack<Character>();
        //{[()]}
        //}{[]

        for (int i = 0; i < a.length; i++) {
            bool = false;
            if (a[i] == '{' || a[i] == '[' || a[i] == '(') {
                stack.push(a[i]);
            }
                    if (a[i] == '}' || a[i] == ']' || a[i] == ')') {
if(stack.isEmpty()) return  false;
else  if(matchParent(a[i],stack.pop()))
                        { return true;}



                    }
                }
        return bool;


    }


   static int possibleMoves(int n)
    {

        if(n==0 || n==1) {
            return  1;
        }
        else {
         return   possibleMoves(n-1)+possibleMoves(n-2);
        }


    }

            //C
        //A     //A
    //R       //G
        //D


*//*
    class triesNode extends CNode
    {
        boolean isCompleted;
        Map<Character,triesNode> children ;
    }

    String printElem(CNode rootNode, String str)
    {
        char[] chArr = str.toCharArray();
        if (rootNode==null) return "";
        while(rootNode.left !=null || rootNode.right != null)
        {
            for (char c : chArr) {
                if(rootNode.left !=null && rootNode.left.data ==c) {}
            }


        }



    }

    void addElements(triesNode tNode, char c)
    {
        if(tNode.children.get(c)!=null) {
            tNode.children.put(c,tNode);
        }
    }*//*



*/

