package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
        issues.add(new Issue("Exam conflict", 2));
        issues.add(new Issue("Scholarship problem", 1));
        issues.add(new Issue("Course registration error", 3));
        issues.add(new Issue("Graduation clearance", 2));
        issues.add(new Issue("Academic warning appeal", 1));
    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
        if (issues.isEmpty()) {
            System.out.println("No emergency issues.");
            return;
        }

        System.out.println("Most urgent issue: " + issues.peek());
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        if (issues.isEmpty()) {
            System.out.println("No issues to resolve.");
            return;
        }

        for (int i = 0; i < 2; i++) {
            if (!issues.isEmpty()) {
                System.out.println("Resolved: " + issues.poll());
            }
        }
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        if (issues.isEmpty()) {
            System.out.println("No remaining issues.");
            return;
        }

        Iterator<Issue> iterator = issues.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
        issues.add(new Issue(description, urgency));
        System.out.println("New issue added.");
    }
}
