package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;

    private boolean isTaskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting " + whatToPaint + "color: " + color);
        isTaskExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        if (isTaskExecuted) {
            return true;
        } else {
            return false;
        }


    }
}
