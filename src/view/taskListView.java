package view;

import datastructures.ADTSingleLinkedList;
import helpers.OutputHelper;
import datastructures.listNode;
import model.Task;

public class taskListView {
    public void displayATask(Task aTask){
        System.out.println("You have to pick a task " + TextColours.TEXT_PURPLE + + aTask.getTheTask() + " " + aTask.getTheTags() + TextColours.TEXT_RESET);
    }


    public void displayATask(listNode<Task> aTask){
       System.out.println(" Task ");
        System.out.println("---------------------");
        System.out.println(OutputHelper.repeat("-",62));
        System.out.format("| %-5s | %-50s |\n", "aTask");
        System.out.println(OutputHelper.repeat("-",62));

        listNode<Task> tmp = aTask.front();
        while (tmp != null) {
            System.out.format("| %5d | %-50s |\n", tmp.getNodeData().getTheTask(), tmp.getNodeData().getTheTask());
            tmp = tmp.getNextNode();
        }
        System.out.println(OutputHelper.repeat("-",62));
    }
    

public void displayListTasks(ADTSingleLinkedList<Task> listTasks){
      
     
      System.out.println("List Tasks");
        System.out.println("---------------------");
        System.out.println(OutputHelper.repeat("-",62));
        System.out.format("| %-5s | %-50s |\n", "listTask");
        System.out.println(OutputHelper.repeat("-",62));

        listNode<Task> tmp = listTasks.front();
        while (tmp != null) {
            System.out.format("| %5d | %-50s |\n", tmp.getNodeData().getlistTask(), tmp.getNodeData().getTheTask());
            tmp = tmp.getNextNode();
        }
        System.out.println(OutputHelper.repeat("-",62));
    }
    }

