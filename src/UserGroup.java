import java.util.List;
import java.util.UUID;

public class UserGroup implements UserSystem {

   /* The list contains users and groups within this group. */
   private List<UserSystem> userGroups;
   private UUID groupID;
   private String name;

   public static void addGroup(String name) {
      UserGroup group = new UserGroup();
      UUID uuid = UUID.randomUUID();
      group.setID(uuid);
      group.setName(name);

      System.out.println("Group added: " + group.displayName());
   }

   public List<UserSystem> getUserGroups() {
      return userGroups;
   }

   public void setUserGroups(List<UserSystem> userGroups) {
      this.userGroups = userGroups;
   }

   public void addUserGroups(UserSystem userGroup) {
      userGroups.add(userGroup);
   }

   public UUID displayID() {
      return groupID;
   }

   public String displayName() {
      return name;
   }

   public void setID(UUID groupID) {
      this.groupID = groupID;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "UserGroup{" +
              "userGroups=" + userGroups +
              ", groupID=" + groupID +
              ", name='" + name + '\'' +
              '}';
   }
}
