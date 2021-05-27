import java.util.*;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.FileWriter;
import java.io.*;
import java.net.*;
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
    public static void write(String url,String line)
    {
        try
        {
             FileWriter myWriter = new FileWriter(url);
             myWriter.write(line);
             myWriter.close();
             System.out.println("Successfully wrote to the file.");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void crawl(String url,String ul)
    {
        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        file(ul);
        String line ; 
        URL u ;//= new URL(url);
        InputStream is=null;// = u.openStream();
         BufferedReader br ;// = new BufferedReader(new InputStreamReader(is));
         try {
        u = new URL(url);
        is = u.openStream();  // throws an IOException
        br = new BufferedReader(new InputStreamReader(is));
line = br.readLine();/*
        while ((line = br.readLine();) != null) {
            System.out.println(line);
        }*/
         write(ul,line);
    } catch (MalformedURLException mue) {
         mue.printStackTrace();
    } catch (IOException ioe) {
         ioe.printStackTrace();
    } finally {
        try {
            if (is != null) is.close();
        } catch (IOException ioe) {
            // nothing to see here
        }
    }
   
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url below :- \n");
        String url = sc.next();
        System.out.println("Enter the filen name : ");
         String ul = sc.next();
        System.out.println("the  urls crawled using the given url is as follows : ");
        crawl(url,ul);
    }
}