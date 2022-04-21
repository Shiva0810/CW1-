package model;

import java.util.Arrays;
import controller.ListType ;
import controller.ADTDate;
import controller.TeamMember;


public class Task {

    private ListType theList;
    public ADTDate TheDueDate ;
    private String TheTask ; 
    private TeamMember AllocatedTeamMember ;
    private String TaskComments ; 
    private String TheTags;
    

    public Task() {
       this.TheTask = "";
       this.TheTags = "";
       this.TaskComments= "";
       this.TheDueDate = new ADTDate() ;
       this.AllocatedTeamMember = new TeamMember();
       this.theList = new ListType();
       
    }

    public ListType getTheListType() {
        return theList;
    }

    public void setTheListType(ListType theListType) {
        this.theList = theListType;
    }

    public ADTDate getTheDueDate() {
        return TheDueDate ;
    }

    public void setTheDueDate(ADTDate aDueDate) {
        this.TheDueDate = aDueDate;
    }

    public String getTheTask() {
        return TheTask;
    }

    public void setTheTask(String aTask) {
        this.TheTask = aTask;
    }

    public TeamMember getAllocatedTeamMember() {
        return AllocatedTeamMember;
    }

    public void setAllocatedTeamMember(TeamMember allocatedToTM) {
        this.AllocatedTeamMember = allocatedToTM ;
    }

    public String getTaskComments() {
        return TaskComments ;
    }

    public void setTaskComments(String theTaskComments) {
        this.TaskComments = theTaskComments ;
    }

    public String getTheTags() {
        return TheTags ;
    }

    public void setTheTags(String taskTags) {
        this.TheTags = taskTags ;
    }


    public String CSVFormat(){
      String outputStr = this.theList + "," + this.TheDueDate + "," + this.TheTask + "," + this.TaskComments + "," + this.TheTags.CSVFormat();
        return outputStr;
    }

    @Override
    public String toString() {
       
        return "Task{" +
                "TheTask" + TheTask +
                "AllocatedTeamMember" + AllocatedTeamMember +
                ",theList='" + theList + '\'' +
                ",TheDueDate " + TheDueDate.toString +
                ", TheTags" + TheTags +
                "TaskComments" + TaskComments +
                '}';
                
    }
}
