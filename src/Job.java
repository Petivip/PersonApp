public class Job {

    private String role;
    private long id;
    private int salary;

    public Job() {
    }

    public Job(String role, long id, int salary) {
        this.role = role;
        this.id = id;
        this.salary = salary;
    }
    public String toString(){
        return role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



}
