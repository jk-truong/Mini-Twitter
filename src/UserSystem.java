import java.util.UUID;

public interface UserSystem {

   public UUID displayID();

   public String displayName();

   public void setID(UUID userID);

   public void setName(String name);

}
