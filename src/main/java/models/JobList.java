package models;

public class JobList {
    int jobID;
    String companyName;
    String applicationStatus;

    public JobList(){}

    public JobList(int jobID, String companyName, String applicationStatus){
        this.jobID = jobID;
        this.companyName = companyName;
        this.applicationStatus = applicationStatus;
    }

    //----------------------------------------------- Getters --------------------------------------------------------//

    public int getJobID() {
        return jobID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    //---------------------------------------------- Setters ---------------------------------------------------------//

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }
}