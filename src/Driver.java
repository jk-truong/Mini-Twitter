import java.util.UUID;

public class Driver {
   public static void main(String[] args) {
      AdminGUI adminGUI = new AdminGUI();
      adminGUI.setVisible(true);
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
