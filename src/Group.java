import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Group implements SysEntry {

   /* The list contains users and groups within this group. */
   private List<SysEntry> userList = new ArrayList<SysEntry>();
   private UUID groupID;
   private String name;

   public Group(String name) {
      UUID uuid = UUID.randomUUID();

      this.name = name;
      this.groupID = uuid;

      System.out.println("Group added: " + this.name);
   }

   public List<SysEntry> getUserList() {
      return userList;
   }

   public void setUserList(List<SysEntry> userList) {
      this.userList = userList;
   }

   public void addUser(SysEntry user) {
      userList.add(user);
   }

   public void removeUser(SysEntry user) {
      userList.remove(user);
   }

   @Override
   public void showUserDetails() {
      System.out.println("Group Name: " + name);
   }

   @Override
   public String toString() {
      return "\nUserGroup{" + "name='" + name + "' groupID='" + groupID + '\'' + '}';
   }
}
