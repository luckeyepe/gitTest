package main;

public class Main
{
    public static void  main(String[] args)
    {
        int[] ints = {1,2,3,4,5};
        Queue queue = new Queue();
        System.out.println("Hello World");
        System.out.println("Hello");
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);
        queue.push(8);
        queue.push(9);
        queue.push(10);

        while (!queue.isEmpty())
        {
            System.out.println(queue.pop());
        }

    }


}
