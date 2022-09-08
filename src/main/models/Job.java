package models;

public class Job {
    int salary;
    String jobTitle;
    String remoteStatus;
    String companyName;
    String siteApplied;
    String dateOfLastUpdate;
    int jobID;
    String nextAction;

    public Job(){}

    public Job(String jobTitle, String companyName, int salary, String remoteStatus, String siteApplied, String dateOfLastUpdate, String nextAction, int jobID){
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.remoteStatus = remoteStatus;
        this.siteApplied = siteApplied;
        this.dateOfLastUpdate = dateOfLastUpdate;
        this.nextAction = nextAction;
        this.jobID = jobID;
    }

    public int getSalary(){
        return salary;
    }

    public int getJobID(){
        return jobID;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public String getRemoteStatus(){
        return remoteStatus;
    }

    public String getCompanyName(){
        return companyName;
    }

    public String getSiteApplied(){
        return siteApplied;
    }

    public String getDateOfLastUpdate(){
        return dateOfLastUpdate;
    }

    public String getNextAction(){
        return nextAction;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDateOfLastUpdate(String dateOfLastUpdate) {
        this.dateOfLastUpdate = dateOfLastUpdate;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setNextAction(String nextAction) {
        this.nextAction = nextAction;
    }

    public void setRemoteStatus(String remoteStatus) {
        this.remoteStatus = remoteStatus;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSiteApplied(String siteApplied) {
        this.siteApplied = siteApplied;
    }
}
