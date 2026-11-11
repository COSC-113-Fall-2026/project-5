package project5;

public abstract class MaintenanceRequest {
    public abstract void reportProblem(String description, String priority);
    public abstract void updateStatus(String status);
}
