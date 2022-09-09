package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverH {

    private final String mentorName;

    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(QueueOfTasks queueOfTasks) {
        System.out.println(mentorName + ": New task from student: " + queueOfTasks.getStudent() +
                " (total: " + queueOfTasks.getTasks().size() + "tasks)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
