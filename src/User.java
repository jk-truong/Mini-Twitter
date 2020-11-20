public class User extends Subject implements SysEntry {

   private String name;
   private String text;

   public User(String name) {
      this.name = name;
      System.out.println("User added: " + this.name);
   }

   public void setText(String text) {
      this.text = text;
      notifyObservers();
   }

   public String getText() {
      return name + ": " + text;
   }

   public void showUserDetails() {
      System.out.println("User Name: " + name);
   }

   public String toString() {
      return name;
      //return "\nUser{" + "name='" + name + "' userID='" + userID + '\'' + '}';
   }
}
