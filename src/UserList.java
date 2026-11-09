import java.util.ArrayList;

public class UserList
{
  public ArrayList<User> user = new ArrayList<User>();

  public void add(User u)
  {
    this.user.add(u);
    if (u == null)
    {
      return;
    }
  }

  public ArrayList<User> getUser()
  {
    return user;
  }
}
