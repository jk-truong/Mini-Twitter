import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.ArrayList;
import java.util.List;

public class Group extends DefaultMutableTreeNode implements SysEntry {

   /* The list contains users and groups within this group. */
   private List<SysEntry> userList = new ArrayList<SysEntry>();
   private String name;
   Long creationTime;

   public Group(String name) {
      this.name = name;
      this.creationTime = System.currentTimeMillis();
      System.out.println("Group added: " + this.name + " at: " + creationTime);
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

   public void showGroupDetails() {
      System.out.println("Group Name: " + name);
   }

   public String toString() {
      return name;
      //return "\nUserGroup{" + "name='" + name + "' groupID='" + groupID + '\'' + '}';
   }
}
