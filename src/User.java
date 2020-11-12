import java.util.UUID;

public class User implements UserSystem {

   private UUID userID;
   private String name;

   public static void addUser(String name) {
      User user = new User();
      UUID uuid = UUID.randomUUID();
      user.setID(uuid);
      user.setName(name);
      System.out.println("User added: " + user.displayName());
   }

   public UUID displayID() {
      return userID;
   }

   public String displayName() {
      return name;
   }

   public void setID(UUID userID) {
      this.userID = userID;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "User{" +
              "userID=" + userID +
              ", name='" + name + '\'' +
              '}';
   }
}
