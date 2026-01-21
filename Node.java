//singly Linked List
public class Node {
    int data;
    Node next;
 
    public Node(int data){
        this.data=data;
        next=null;
        System.out.println("Node created success");
    }
    public void dislay(Node head){
        Node temp=head;
   
        while(temp!=null){
            System.out.print("----->"+temp.data);//10------>20----->30
            temp=temp.next;
        }
       
    }
   
    //Operatio1: Insert New Node at Starting of Singly Linked List
    public Node insertNewNodeAtStart(Node head,int data){// Time Complexity : O(1)
        //step1:
        //step2:
        Node newNode=new Node(data);
        //step3:
        newNode.next=head;
        //step4:
        head=newNode;
        //step5:
        return head;
    }
   
     //Operatio1: Insert New Node at Starting of Singly Linked List
    public Node insertNewNodeAtEnd(Node head,int data){// Time Complexity : O(n)
       //step1 &&step2
       Node newNode=new Node(data);
       //step3:
       if(head==null){
           head=newNode;
         
       }else{
           //step4:
           Node temp=head;
           while(temp.next!=null){
               temp=temp.next;
           }
           //step5:
           temp.next=newNode;
           
       }
       //step:6
         return head;
    }
    public Node insertAtPos(Node head,int data,int pos){
        //step1 and Step2:
        Node newNode=new Node(data);
        //step3:
        if(pos==1){
            newNode.next=head;
            head=newNode;
        }else{
            Node temp1=head;
            Node temp2=head.next;
            pos--;//3
            while(pos>1){
                temp1=temp1.next;
                temp2=temp2.next;
                pos--;//1
            }
            temp1.next=newNode;
            newNode.next=temp2;
                   
        }
        return head;
    }
    public Node deleteLastNode(Node head){
        if(head==null){
            System.out.println("List is Empty");
        }else if(head.next==null){
            Node temp=head;
            head=head.next;
            temp=null;
            return head;
        }else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            Node t=temp.next;
            temp.next=null;
            t=null;
        }
        return head;
    }


    public static void main(String[] args) {
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
       
        Node head=first;
        //CONNEect first node to second Node
        first.next=second;
        //connect second to third node via head
       head.next.next=third;
        System.out.println(""+head.data+"====>"+head.next.data+"=====>"+head.next.next.data);
        //print Element of the Singly Linked List Linked List
        Node temp=head;
        head.dislay(head);
       head= head.insertNewNodeAtStart(head, 5);
        System.out.println("Print after insert new Node at Start \n");
        head.dislay(head);
        head= head.insertNewNodeAtEnd(head, 40);
        System.out.println("Print after insert new Node at End\n");
        head.dislay(head);
      head=head.insertAtPos(head, 25, 4);
        System.out.println("Print after insert new Node atSpecific Position \n");
       head.dislay(head);
       
    }
}