package finalexam.task1;

import java.util.Date;
import java.util.List;

public class Project {
    // Fields
    private String name;
    private Date startDate;
    private Date endDate;
    private String description;
    private double budget;
    private List<String> teamMembers;
    private String status; // Example statuses: "Not Started", "In Progress", "Completed"

    // Constructor
    public Project(String name, Date startDate, Date endDate, String description, double budget, List<String> teamMembers, String status) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.budget = budget;
        this.teamMembers = teamMembers;
        this.status = status;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<String> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<String> teamMembers) {
        this.teamMembers = teamMembers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Methods
    public void addTeamMember(String teamMember) {
        this.teamMembers.add(teamMember);
    }

    public void removeTeamMember(String teamMember) {
        this.teamMembers.remove(teamMember);
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    @Override
    public String toString() {
        return "Project [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", description=" + description
                + ", budget=" + budget + ", teamMembers=" + teamMembers + ", status=" + status + "]";
    }
}

