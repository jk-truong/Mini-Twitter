import javax.swing.tree.DefaultMutableTreeNode;
import java.util.UUID;

public class User implements SysEntry {

   private UUID userID;
   private String name;

   public User(String name) {
      UUID uuid = UUID.randomUUID();
      this.name = name;
      this.userID = uuid;

      System.out.println("User added: " + this.name);
   }


   @Override
   public void showUserDetails() {
      System.out.println("User Name: " + name);
   }

   @Override
   public String toString() {
      return "\nUser{" + "name='" + name + "' userID='" + userID + '\'' + '}';
   }
}
