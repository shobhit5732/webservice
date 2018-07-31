package testingphase2;


class CNode {
    int item;
    CNode next;

    CNode(int data) {
        item = data;
        next = null;
    }

}

class cicuLL {
    CNode head;


    cicuLL() {
        head = null;
    }


    void sortedPush(CNode new_node) {
        CNode current = head;
        //check item size
        if (head == null) {
            new_node.next = new_node;
            head = new_node;
        } else
            if (current.item > new_node.item) { //new node has smaller value
                while (current.next != head) current = current.next;


                current.next = new_node;
                new_node.next = head;
                head = new_node;


            }


        else if(current.next.item < new_node.item)
        {
            while (current.next != head) current = current.next;

            new_node.next = current.next;
            current.next = new_node;

        }

    }

    public static void main(String[] args) {

        int arr[] = new int[]{12, 56, 2, 11, 1, 90};
        cicuLL newObj = new cicuLL();
        for (int i = 0; i < arr.length; i++) {
            CNode temp = new CNode(arr[i]);

            newObj.sortedPush(temp);
        }
        newObj.printList();

    }

    void printList()
    {
        if (head != null)
        {
            CNode temp = head;
            do
            {
                System.out.print(temp.item + " ");
                temp = temp.next;
            }  while (temp != head);
        }
    }




}
