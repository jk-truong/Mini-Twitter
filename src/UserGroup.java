import java.util.UUID;

public class UserGroup implements UserSystem {

   private UUID groupID;
   private String name;

   public static void addGroup(String name) {
      UserGroup group = new UserGroup();
      UUID uuid = UUID.randomUUID();
      group.setID(uuid);
      group.setName(name);

      System.out.println("Group added: " + group.displayName());
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
}
