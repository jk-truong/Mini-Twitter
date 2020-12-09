public class User extends Subject implements SysEntry {

   private String name;
   private String text;
   Long creationTime;

   public User(String name) {
      this.name = name;
      this.creationTime = System.currentTimeMillis();
      System.out.println("User added: " + this.name + " at: " + this.creationTime);
   }

   public void setText(String text) {
      this.text = text;
      notifyObservers();
   }

   public String getText() {
      return name + ": " + text;
   }

   public void showGroupDetails() {
      System.out.println("User Name: " + name);
   }

   public String toString() {
      return name;
      //return "\nUser{" + "name='" + name + "' userID='" + userID + '\'' + '}';
   }
}
