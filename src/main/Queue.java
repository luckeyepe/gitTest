package main;

public class Queue
{
    Node head, tail;

    public boolean isEmpty()
    {
        return (null==head || null==tail);
    }

    public void push(int data)
    {
        if(isEmpty())
        {
            head = new Node(data);
            tail = head;
            return;
        }

        Node newNode = new Node(data);
        tail.next = newNode;
        tail = tail.next;
        return;
    }

    public int pop()
    {
        int temp = head.data;

        head = head.next;
        return temp;
    }
}
