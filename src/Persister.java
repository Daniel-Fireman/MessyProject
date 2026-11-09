import java.io.*;
import java.util.*;

public class Persister
{
  public static void save(ArrayList<User> user) throws IOException
  {
    File file = new File("users.txt"); // Creates file
    FileWriter fw = new FileWriter(file); // Create filewriter
    BufferedWriter bw = new BufferedWriter(fw); // Create BufferedWriter
    for (int x = 0; x < user.size() - 1; x++) // For loop writes
    {
      bw.write(user.get(x).c_name);
      bw.write(user.get(x).geti());
    }
  }
}
