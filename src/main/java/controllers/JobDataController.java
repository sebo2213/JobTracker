package controllers;

import models.Job;
import java.sql.*;

/**
 * Preforms CRUD operations on single job entries
 */
public class JobDataController {

    Job job = new Job();

    public void create() throws SQLException{
        String insert = "INSERT INTO Job (Job Title, Company Name, Pay, Remote Status, Site Applied, Date of Last Update, Next Action, Job ID) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/job", "root", "Firewarrior.2213"); PreparedStatement statement = connection.prepareStatement(insert)) {
            statement.setString(1,job.getJobTitle());
            statement.setString(2,job.getCompanyName());
            statement.setInt(3,job.getSalary());
            statement.setString(4,job.getRemoteStatus());
            statement.setString(5,job.getSiteApplied());
            statement.setString(6,job.getDateOfLastUpdate());
            statement.setString(7,job.getNextAction());
            statement.setInt(8,job.getJobID());

            System.out.println(statement);

            statement.execute(insert);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void select() throws SQLException {
        String query = "select Job Title, Company Name, Pay, Remote Status, Site Applied, Date of Last Update, Next Action, Job ID";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/job", "root", "Firewarrior.2213"); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, query);
            ResultSet set = statement.executeQuery();

            while(set.next()){
                job.setJobID(set.getInt("Job ID"));
                job.setJobTitle(set.getString("Job Title"));
                job.setCompanyName(set.getString("Company Name"));
                job.setSalary(set.getInt("Pay"));
                job.setRemoteStatus(set.getString("Remote Status"));
                job.setSiteApplied(set.getString("Site Applied"));
                job.setDateOfLastUpdate(set.getString("Date of Last Update"));
                job.setNextAction(set.getString("Next Action"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void remove() throws SQLException{

    }

    public void update(){

    }

    public void delete(){

    }
}
