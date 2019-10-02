package larry;

public class NameBean {
    private String firstName = "Nie podanao imienia";
    private String lastName = "Nie podano nazwiska";

    public NameBean(){}
    public NameBean(String firstName, String lastName){
    setFirstName(firstName);
    setLastName(lastName);
    }
    public String getFirstName(){
        return (firstName);
    }

    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    public String getLastName(){
        return (lastName);
    }

    public void setLastName(String newLastName){
        lastName = newLastName;
    }

}
