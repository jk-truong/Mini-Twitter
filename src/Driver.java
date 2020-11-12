import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Driver {
   public static void main(String[] args) {
      AdminGUI adminGUI = new AdminGUI();
      adminGUI.setVisible(true);

      User user1 = new User();
      user1.setName("james");
      UserGroup group1 = new UserGroup();
      group1.setName("CS");
      User user2 = new User();
      user2.setName("John");
      UserGroup group2 = new UserGroup();
      group2.setName("Group2");

      group1.setUserGroups(Arrays.asList(new UserSystem[] {user1, user2, group2}));

      System.out.println(group1.getUserGroups().toString());

   }

   /* Creates a new user object */
   public static void addUser(String name) {
      User.addUser(name);
   }

   /* Creates a new group object */
   public static void addGroup(String name) {
      UserGroup.addGroup(name);
   }
}
