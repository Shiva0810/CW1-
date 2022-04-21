package controllers;

import helpers.InputHelper;
import javax.management.relation.Role;
import model.ListType ;
import model.ADTDate;
import model.TeamMember;
import daos.ADTSingleLinkedList<Task>;
import model.Task;

public class controller {
    private ADTSingleLinkedList<Task> theTaskLL;
    private ListType theList;
    private ADTDate TheDueDate ;
    private TeamMember AllocatedTeamMember ;
      private Role tmRole;
    InputHelper inputHelper;

    public controller() {
        this.theTaskLL = new ADTSingleLinkedList<Task>();
       this.theList = new ListType();
       this.TheDueDate = new ADTDate();
       this.AllocatedTeamMember = new TeamMember();
        inputHelper = new InputHelper();
    }

    public void run(){
        this.setup();
        boolean finished = false;

        int iChoice = 0;

        do {
            this.theMenu();
            iChoice = inputHelper.readInt("Enter choice", 8,1);
            switch (iChoice) {
                // Add more cases
                case 1:
                    System.out.println();
                    break;

                default: // invalid option
                    System.out.println("Oops! Something has went wrong!");
                    break;
            }
        }while(!finished);
    }

    private void setup(){
        System.out.println("Setting up  ...");
        this.theTaskLL.loadFromFile();
    }

    private void theMenu() {
        System.out.println(TextColours.TEXT_GREEN + "Welcome to the toDoList");
        System.out.println("---------------------------" + TextColours.TEXT_RESET);
        System.out.println("1: DoingLIst");
        System.out.println("2: DoneList");
        System.out.println("3: toDOList");
        System.out.println("4: Quit");
        System.out.println();
    }

 private void DoingList()
 {
     System.out.println("Requirements analysis with Client");
     System.out.println("Client name : Estrella,Perez");
     tmRole =  Role.ANALYST;
     TheDueDate = "18/04/2022";
     theTaskLL = "Get user to sign off initial requirements";
     this.theTaskLL.gettmRole().setTeamMemeber();
           
   }
 private void DoneList()
 {
     
 }
 private void toDoList(){
       System.out.println("Design User interface");
     System.out.println("Client name : Bobby,Law");
     tmRole =  Role.DESIGNER;
     TheDueDate = "22/04/2022";
     theTaskLL = "Get user to verify initial";
     System.out.println("Create backend Database");
     System.out.println("Client name : Fred,Jones");
     tmRole =  Role.DEVELOPER;
     TheDueDate = "29/05/2022";
     theTaskLL = "Check with client data to be stored";
      System.out.println("Complete first version of UI");
     System.out.println("Client name : Riley,Poole");
     tmRole =  Role.DEVELOPER;
     TheDueDate = "12/06/2022";
     theTaskLL = "Get user to verify initial";
     System.out.println("Analyse data storage needs");
     System.out.println("Client name : Melvine,Doo");
     tmRole =  Role.DEVELOPER;
     TheDueDate = "27/05/2022";
     theTaskLL = "Get Client sign off on Data Spec";
     System.out.println("Create first draft of HTML and CSS front end");
     System.out.println("Client name : Hercule,Poirot");
     tmRole =  Role.DEVELOPER;
     TheDueDate = "22/06/2022";
     theTaskLL = "Show Analyst and Designer prior to client";
     System.out.println("Create CSS and colour palette");
     System.out.println("Client name : Herbert,Lom,");
     tmRole =  Role.DESIGNER;
     TheDueDate = "18/04/2022";
     theTaskLL = "Get user to verify initial CSS and colour palette";
     System.out.println("Create JavaScript");
     System.out.println("Client name : Velma,Dinkley,");
     tmRole =  Role.DEVELOPER;
     TheDueDate = "22/05/2022";
     theTaskLL = "Get code verification from Developers";
     this.theTaskLL.settmRole().getTeamMember();
     }
 
 
}
