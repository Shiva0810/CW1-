package daos;

import app.ToDoApp;
import datastructures.ADTSingleLinkedList;
import model.*;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shiva
 */
public class listDAOImpl extends DAO{
    private ADTSingleLinkedList<Task> theTaskLL;

    public static final char DELIMITER = ',';
    public static final char EOLN='\n';
    public static final String QUOTE="\"";
    public static final String USERDIRECTORY = System.getProperty("user.dir");

    private String stripQuotes(String str) {
        return str.substring(1, str.length()-1);
    }

    public listDAOImpl(){
       this.theTaskLL = new ADTSingleLinkedList<Task>() ;
    }

    public listDAOImpl(ADTSingleLinkedList<Task> theTaskLL) {
        this.theTaskLL = theTaskLL ;
    }

    public ADTSingleLinkedList<Task> getTheTaskLL() {
        return theTaskLL ;
    }

    public void setTheTaskLL(ADTSingleLinkedList<Task> theTaskLL) {
       this.theTaskLL = theTaskLL;
    }

    @Override
    public void loadFromFile(String filename) {
        String transactionFile = USERDIRECTORY +"\\" + filename;

        try (BufferedReader br = new BufferedReader(new FileReader(transactionFile))) {
            // Add your variables here

            String[] temp;
            String line = br.readLine();
            while(line!=null){
                // split each line and store the values in your variables

                // Create required instances of your modelled data

                // Insert into the list
                line = br.readLine();

            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(ToDoApp.class.getName()).log(Level.INFO, null, ex);
        }
    }

    @Override
    public void writeToFile(ADTSingleLinkedList<Task> listItems, String filename) {
        try {
            File myFile = new File(USERDIRECTORY +"\\write.txt");

            if(myFile.exists()){
                myFile.delete();
                System.out.println("File deleted: " + myFile.getName());
            }
            else if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            File myFile = new File(USERDIRECTORY +"\\write.txt");
            FileWriter myWriter = new FileWriter(myFile.getName());
            for(int row = 0; row < 8; row++){
                for(int col = 0; col < 8; col++){
                    if(row == 7 && col ==7){
                        myWriter.write(this.theTaskLL.getValueFromDataSet(row,col).CSVFormat());
                    }
                    else {
                        myWriter.write(this.theTaskLL.getValueFromDataSet(row,col).CSVFormat() + "\n");
                    }
                }
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @Override
    public void add(Task aTask) {
       this.add(aTask);
    }

    @Override
    public Task getTask() {
      return Task;
    }

    @Override
    public Task removeTask(int pos) {
       
    }

    @Override
    public TeamMember getTeamMember() {
        // Add your code here
        return null;  // Add your return value here
    }

    @Override
    public ADTDate parseDateInput(String aDate) {
        // Add your code here
        return null;  // Add your return value here
    }
}
