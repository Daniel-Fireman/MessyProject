import java.io.IOException;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    User user1 = new User("Bob", 10);
    User user2 = new User("Alice", 20);
    User user3 = new User("Carl", 30);

    UserList usersList = new UserList();
    usersList.add(user1);
    usersList.add(user2);
    usersList.add(user3);

    System.out.println(usersList.getu());

    Persister.save(usersList.getu());
  }
}
