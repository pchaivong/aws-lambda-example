/**
 * Created by pchaivong on 4/28/2017 AD.
 */
public class Request {

    String firstName;
    String lastName;

    public void setFirstName(String fname){
        this.firstName = fname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Request(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Request() {
    }
}
