public class Person {

    private Job job;
    private Education education;

    public Person() {
        this.job = new Job();
        this.education=new Education();
        job.setSalary(100);
        education.setLevel("high school");
        job.setRole("student");
    }

    @Override
    public String toString(){
        return job.getRole() + education.getLevel();
    }

    public int getSalary(){
        return job.getSalary();
    }
}
