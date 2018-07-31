package com.pkg.testingProj;

public class TNode {
    int NUM_CHAR = 26;
    TNode[] children = new TNode[NUM_CHAR];
    int size = 0;


    protected int getCharindex(char c) {
        return c - 'a';
    }

    protected TNode getNode(char c) {
        return children[getCharindex(c)];
    }

    protected char getCharfromNode(int charIndex) {
        return (char)(65+charIndex);

    }


    protected void setNode(char c, TNode TNode) {
        children[getCharindex(c)] = TNode;

    }

    protected void add(String s, int index) {
        size++;
        if (s.length() == index) return;
        char current = s.charAt(index);
        TNode child = getNode(current);
        if (child == null)
        {
            child = new TNode();
            setNode(current, child);
        }
        child.add(s, index+1);

    }

    protected int findCount(String s, int index, TNode child) {
        if (s.length() == index) {
            printNodes(child);
            return size;
        }
         child = getNode(s.charAt(index));
        if (child == null) {
            return 0;
        } else {
            return child.findCount(s, index + 1,child);
        }


    }

    private void printNodes(TNode child) {
        StringBuffer st = new StringBuffer();
            if(child.size>0)
            {
                for (int i =0 ;i<26;i++) {
                    TNode c = child.children[i];
                    if (c !=null)
                    {
                       //st.append(getCharfromNode(i));
                        //child = getNode(s.charAt(index));

                        printNodes(c.getNode(getCharfromNode(i)));
                    }

                }


            }

    }







}