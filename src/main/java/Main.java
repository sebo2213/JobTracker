import models.Connector;

public class Main {

    /**
     * Heart of the application
     * Here calls the connection and calls other packages to do business logic
     * need to find a better way to manage than having a main class
     * @param args
     */
    public static void main(String[] args){

        Connector connector = new models.Connector();
        connector.connect();
    }

}
