import java.util.*;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.FileWriter;
class Crawler
{
    public static void file(String url)
    {
        Stack<String> s = new Stack<String>();
        Queue<String> q = new LinkedList<String>();
        try
        {
            
            File myobj = new File(url);
            if(myobj.createNewFile())
            {
                System.out.println("File created :- "+myobj.getName());
            }
            else
            {
                System.out.println("File already exists");
            } 
        }
        catch(IOException e)
        {
            System.out.println("File error occur ");
            e.printStackTrace();
        }
    }
    public static void write(String url)
    {
        try
        {
             FileWriter myWriter = new FileWriter(url);
             myWriter.write(url);
             myWriter.close();
             System.out.println("Successfully wrote to the file.");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void crawl(String url)
    {
        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        file(url);
        write(url);
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url below :- \n");
        String url = sc.next();
        System.out.println("the  urls crawled using the given url is as follows : ");
        crawl(url);
    }
}