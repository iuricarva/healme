/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcessaWS;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author icarv
 */
@XmlRootElement
public class PlatformModel {
    private String name;
    private int numberOfCountries;
    private int semanticClosenessAvg;
    private int numberOfNodeTypes;
    private int timeWorkTogether;
    private int numberOfNewMembers;
    private int developerCommits;
    private int numberOfHoursWorked;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCountries() {
        return numberOfCountries;
    }

    public void setNumberOfCountries(int numberOfCountries) {
        this.numberOfCountries = numberOfCountries;
    }

    public int getSemanticClosenessAvg() {
        return semanticClosenessAvg;
    }

    public void setSemanticClosenessAvg(int semanticClosenessAvg) {
        this.semanticClosenessAvg = semanticClosenessAvg;
    }

    public int getNumberOfNodeTypes() {
        return numberOfNodeTypes;
    }

    public void setNumberOfNodeTypes(int numberOfNodeTypes) {
        this.numberOfNodeTypes = numberOfNodeTypes;
    }

    public int getTimeWorkTogether() {
        return timeWorkTogether;
    }

    public void setTimeWorkTogether(int timeWorkTogether) {
        this.timeWorkTogether = timeWorkTogether;
    }

    public int getNumberOfNewMembers() {
        return numberOfNewMembers;
    }

    public void setNumberOfNewMembers(int numberOfNewMembers) {
        this.numberOfNewMembers = numberOfNewMembers;
    }

    public int getDeveloperCommits() {
        return developerCommits;
    }

    public void setDeveloperCommits(int developerCommits) {
        this.developerCommits = developerCommits;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
    
    
    
    
}
