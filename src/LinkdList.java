import java.util.Scanner;

public class LinkdList
{
    public class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }

    Node head;

    public LinkdList()
    {
        this.head = null;
    }

    public void append(int data)
    {

        if(head == null)
        {
            head = new Node(data);
        }
        else
        {
            Node current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = new Node(data);

        }

    }

    public void prepend(int data)
    {
        Node current = new Node(data);
        current.next = head;
        head = current;
    }

    public void deleteWithValue(int data)
    {
        if(head == null) return;

        if(head.data == data)
        {
            head = head.next;
        }

        Node current = head;
        while(current.next != null)
        {
            if(current.next.data == data)
            {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }

    public void display()
    {
        if(head == null) return;

        Node current = head;
        while(current.next != null)
        {
            System.out.println(current.data);
            current = current.next;
        }

        if(current.next == null) System.out.println(current.data);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        LinkdList list = new LinkdList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(2);
        list.display();

    }
}
