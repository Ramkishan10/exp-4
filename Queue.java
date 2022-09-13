import java.util.Scanner;
public class Queue {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        MyQueue que=new MyQueue();
        System.out.println("Implementation of Queue using Array");
        int ch=0;
        do
        {
            System.out.println("\n\n1.Insert 2.Delete 3.Display 4.Exit");
            System.out.println("Enter your choice:");
            ch=s.nextInt();
            switch(ch)
            {
            case 1:
                que.enqueue();
                que.display();
                break;
            case 2:
                que.dequeue();
                que.display();
                break;
            case 3:
                que.display();
                break;
            case 4:
                System.exit(0);
            }
        }
        while(ch<5);
    }
} 
interface QueueOperation
{
    public void enqueue();
    public void dequeue();
    public void display();
}
class MyQueue implements QueueOperation
{
    Scanner sc=new Scanner(System.in);
    int Queue[]=new int[100];
    int front=0;
    int n=Queue.length;
    int rear=-1;
    int data;
        public void enqueue()
        {
            MyQueue u=new MyQueue();
            if(rear==n-1)
            {
                System.out.println("Queue is full");
            }
            else
            {
                System.out.println("Enter a element-->:");
                data=sc.nextInt();
                rear=rear+1;
                Queue[rear++]=data;
            }
        }
        public void dequeue()
        {
            System.out.println(Queue[front]);
            front ++;
        }
        public void display()
        {
            System.out.println("The Elements Are-->:");
            for(int i=front;i<=rear-1;i++)
            {
                System.out.print("||"+Queue[i]+"||--");
            }
        }
    }
