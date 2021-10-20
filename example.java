//java program to demonstrate threads
class Count implements Runnable
{
   public void run()
   {
      try
      {
        for (int i=0 ;i<20;i++)
        {
          System.out.println("Printing the count value" + i);
          Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println(e.toString());
     }
     System.out.println("child run() is dead!!!!" );
   }
}
class example
{

    public static void main(String args[])
    {
       Count c = new Count();
       Thread obj = new Thread(c);
       obj.start();
       try
       {
          while(obj.isAlive())
          {
            System.out.println("main() thread will be alive till its child is alive:("); 
            Thread.sleep(1500);
          }
       }
       catch(InterruptedException e)
       {
          System.out.println(e.toString());
       }
       System.out.println("Main thread run() is dead!!!!!" );
    }
}