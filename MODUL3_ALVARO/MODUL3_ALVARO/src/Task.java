import java.time.LocalDate;

public class Task {
    // TO DO: Lengkapi atribut-atribut private kelas Task
    private final String title;
    private final String priority;
    private final LocalDate dueDate;
    private String status;


    // TO DO: Buat constructor untuk kelas Task
    public Task(String title, String priority, LocalDate dueDate, String status) {
        this.title = title;
        this.priority = priority;
        this.status = status;
        this.dueDate = dueDate;
    }
    public String getTitle() {
        return title;
    }
    public String getPriority() {
        return priority;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }




    // TO DO: Buat getter untuk title


    // TO DO: Buat getter untuk priority


    // TO DO: Buat getter untuk dueDate


    // TO DO: Buat getter untuk status

    
    // TO DO: Buat setter untuk status
    
}