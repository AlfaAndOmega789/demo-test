package org.example.homework.homework_31.task_2;

public class BugTracker {
    public boolean activeSprint;

    public boolean isActiveSprint(){
        return activeSprint;
    }
    public void startSprint(){
        System.out.println("Sprint is active.");
        activeSprint = true;
    }
    public void finishSprint(){
        System.out.println("Spring is not active.");
        activeSprint = false;
    }
}
