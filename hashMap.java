//Given a name,phoneNo
//ad them in hashmap and print the 
//if key exist in fast time
import java.util.*;
import java.io.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution1{
	public static void main(String []argh)
	{
		HashMap<String, Integer> hash = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            hash.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            try
            {
                int out=hash.get(s);
                System.out.println(s+"="+out);
            }
            catch(Exception e)
            {
                System.out.println("Not found");
            }
        }
	}
}

//Approach 2


class Solution {

    public static void main(String[] args) {
      		try {
			int no_of_entries = 0;
			int i = 0;
			String name = null;
			int number = 0;
			String query = null;
			HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
			BufferedReader b = new BufferedReader(new InputStreamReader(
					System.in));
			no_of_entries = Integer.parseInt(b.readLine());			
			while (i < no_of_entries) {
				name = b.readLine();
				number = Integer.parseInt(b.readLine());
				phoneBook.put(name, number);
				i++;
			}
			while (!(query = b.readLine().trim()).isEmpty()) {
				if (phoneBook.containsKey(query))
					System.out.println(query + "=" + phoneBook.get(query));
				else
					System.out.println("Not found");
			}
		} catch (Exception e) {
			
		}
    }
}



