package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
      
        return "Yuchao Zheng.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
       
        return "yuchaozheng05";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        
        Team team = new Team("f25-07");
        team.addMember("YUCHAO");
        team.addMember("ARMAN EHSAN");
        team.addMember("SICHENG");
        team.addMember("IAN KENTO IZUKA");
        team.addMember("JAKINDA");
        team.addMember("MATT ARTHUR");
        return team;
    }
}
