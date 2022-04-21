package model;

import java.util.Arrays;
import javax.management.relation.Role;
import model.role.ANALYST ;

public class TeamMember {
    private String Firstname ;
    private Role tmRole;
    private String Lastname ;
    
    public TeamMember() {
        
        this.tmRole = Role.ANALYST;
    }

    public TeamMember(String theFirstname, String theLastname, Role theRole) {
        this.Firstname = theFirstname;
        this.tmRole = theRole;
        this.Lastname = theLastname;
    }

    public String getFirstname() {
        return Firstname ;
    }

    public void setFirstname(String firstname) {
        this.Firstname = firstname ;
    }

    public String getLastname() {
        return Lastname ;
    }

    public void setLastname(String lastname) {
        this.Lastname = lastname ;
    }

    public Role getTmRole() {
        return tmRole ;
    }

    public void setTmRole(Role tmRole) {
        this.tmRole = tmRole;
    }

    public Role getRoleAsString(){
        return tmRole;
    }

    public String getAllocatedTo(){
        return "";  // Add your return type here
    }

    public String CSVFormat(){
       String outputStr = this.Firstname + "," + this.Lastname + "," + this.tmRole.CSVFormat();
        return outputStr;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "theFirstname'" + Firstname + '\'' +
                ",theLastname" + Lastname +
                ", theRole" + tmRole +
                '}';
                
    }
}
