package examples.pltw.org.collegeapp;

import java.util.Date;

/**
 * Created by wdumas on 4/11/16.
 */
public class Profile {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String objectID;
    private String email;

    public Profile() {
        firstName = "Alan";
        lastName = "Turing";
        dateOfBirth = new Date(84, 6, 22, 0, 0);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getObjectID() {
        return objectID;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
