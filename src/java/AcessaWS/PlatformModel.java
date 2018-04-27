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
    private int activeMembers;
    private int numberOfCommunits;
    private int numberOfReleases;
    private int totalEffor;
    private int numberOfModifiedFiles;
    private int numberModifiedFileTypes;
    private int numberOfEventParticipants;
    private int numberOfEventProjectParticipants;
    private int numberOfJobAdvertisements;
    private int numberOfDownloads;
    private int numberOfMailingListMembers;
    private int numberOfPassiveUsers;
    private int numberOfReaders;
    private int numberOfScientificPublication;
    private int numberOfSocialMediaHits;
    private int numberOfWebPageRequests;
    private int numberOfDevelopers;
    private int numberOfUsersGroups;
    private int numberOfProgrammingLanguagesSupported;
    private int numberOfDifferentHardwareDevices;
    private String existPlanForCollapse;
    private int numberOfProjectsAdded;
    private int numberOfEvents;
    private int addedKLOC;
    private int numberOfArtifacts;
    private int numberOfTransmittedMessages;
    private int bugFixTime;
    private int numberOfPartnersAdded;
    private int numberOfUsers;
    private int averageTimeUse;
    private int numberOfNodesConnections;
    private int ConnectivityCapacity;
    private int ratioConnectionsCapacity;
    private int nodesCentrality;
    private int numberOfExternalPartners;
    private String GlossaryOfTerms;

    public int getActiveMembers() {
        return activeMembers;
    }

    public void setActiveMembers(int activeMembers) {
        this.activeMembers = activeMembers;
    }

    public int getNumberOfCommunits() {
        return numberOfCommunits;
    }

    public void setNumberOfCommunits(int numberOfCommunits) {
        this.numberOfCommunits = numberOfCommunits;
    }

    
    
    public int getNumberOfReleases() {
        return numberOfReleases;
    }

    public void setNumberOfReleases(int numberOfReleases) {
        this.numberOfReleases = numberOfReleases;
    }

    public int getTotalEffor() {
        return totalEffor;
    }

    public void setTotalEffor(int totalEffor) {
        this.totalEffor = totalEffor;
    }

    public int getNumberOfModifiedFiles() {
        return numberOfModifiedFiles;
    }

    public void setNumberOfModifiedFiles(int numberOfModifiedFiles) {
        this.numberOfModifiedFiles = numberOfModifiedFiles;
    }

    public int getNumberModifiedFileTypes() {
        return numberModifiedFileTypes;
    }

    public void setNumberModifiedFileTypes(int numberModifiedFileTypes) {
        this.numberModifiedFileTypes = numberModifiedFileTypes;
    }

    public int getNumberOfEventParticipants() {
        return numberOfEventParticipants;
    }

    public void setNumberOfEventParticipants(int numberOfEventParticipants) {
        this.numberOfEventParticipants = numberOfEventParticipants;
    }

    public int getNumberOfEventProjectParticipants() {
        return numberOfEventProjectParticipants;
    }

    public void setNumberOfEventProjectParticipants(int numberOfEventProjectParticipants) {
        this.numberOfEventProjectParticipants = numberOfEventProjectParticipants;
    }

    public int getNumberOfJobAdvertisements() {
        return numberOfJobAdvertisements;
    }

    public void setNumberOfJobAdvertisements(int numberOfJobAdvertisements) {
        this.numberOfJobAdvertisements = numberOfJobAdvertisements;
    }

    public int getNumberOfDownloads() {
        return numberOfDownloads;
    }

    public void setNumberOfDownloads(int numberOfDownloads) {
        this.numberOfDownloads = numberOfDownloads;
    }

    public int getNumberOfMailingListMembers() {
        return numberOfMailingListMembers;
    }

    public void setNumberOfMailingListMembers(int numberOfMailingListMembers) {
        this.numberOfMailingListMembers = numberOfMailingListMembers;
    }

    public int getNumberOfPassiveUsers() {
        return numberOfPassiveUsers;
    }

    public void setNumberOfPassiveUsers(int numberOfPassiveUsers) {
        this.numberOfPassiveUsers = numberOfPassiveUsers;
    }

    public int getNumberOfReaders() {
        return numberOfReaders;
    }

    public void setNumberOfReaders(int numberOfReaders) {
        this.numberOfReaders = numberOfReaders;
    }

    public int getNumberOfScientificPublication() {
        return numberOfScientificPublication;
    }

    public void setNumberOfScientificPublication(int numberOfScientificPublication) {
        this.numberOfScientificPublication = numberOfScientificPublication;
    }

    public int getNumberOfSocialMediaHits() {
        return numberOfSocialMediaHits;
    }

    public void setNumberOfSocialMediaHits(int numberOfSocialMediaHits) {
        this.numberOfSocialMediaHits = numberOfSocialMediaHits;
    }

    public int getNumberOfWebPageRequests() {
        return numberOfWebPageRequests;
    }

    public void setNumberOfWebPageRequests(int numberOfWebPageRequests) {
        this.numberOfWebPageRequests = numberOfWebPageRequests;
    }

    public int getNumberOfDevelopers() {
        return numberOfDevelopers;
    }

    public void setNumberOfDevelopers(int numberOfDevelopers) {
        this.numberOfDevelopers = numberOfDevelopers;
    }

    public int getNumberOfUsersGroups() {
        return numberOfUsersGroups;
    }

    public void setNumberOfUsersGroups(int numberOfUsersGroups) {
        this.numberOfUsersGroups = numberOfUsersGroups;
    }

    public int getNumberOfProgrammingLanguagesSupported() {
        return numberOfProgrammingLanguagesSupported;
    }

    public void setNumberOfProgrammingLanguagesSupported(int numberOfProgrammingLanguagesSupported) {
        this.numberOfProgrammingLanguagesSupported = numberOfProgrammingLanguagesSupported;
    }

    public int getNumberOfDifferentHardwareDevices() {
        return numberOfDifferentHardwareDevices;
    }

    public void setNumberOfDifferentHardwareDevices(int numberOfDifferentHardwareDevices) {
        this.numberOfDifferentHardwareDevices = numberOfDifferentHardwareDevices;
    }

    public String getExistPlanForCollapse() {
        return existPlanForCollapse;
    }

    public void setExistPlanForCollapse(String existPlanForCollapse) {
        this.existPlanForCollapse = existPlanForCollapse;
    }

    public int getNumberOfProjectsAdded() {
        return numberOfProjectsAdded;
    }

    public void setNumberOfProjectsAdded(int numberOfProjectsAdded) {
        this.numberOfProjectsAdded = numberOfProjectsAdded;
    }

    public int getNumberOfEvents() {
        return numberOfEvents;
    }

    public void setNumberOfEvents(int numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }

    public int getAddedKLOC() {
        return addedKLOC;
    }

    public void setAddedKLOC(int addedKLOC) {
        this.addedKLOC = addedKLOC;
    }

    public int getNumberOfArtifacts() {
        return numberOfArtifacts;
    }

    public void setNumberOfArtifacts(int numberOfArtifacts) {
        this.numberOfArtifacts = numberOfArtifacts;
    }

    public int getNumberOfTransmittedMessages() {
        return numberOfTransmittedMessages;
    }

    public void setNumberOfTransmittedMessages(int numberOfTransmittedMessages) {
        this.numberOfTransmittedMessages = numberOfTransmittedMessages;
    }

    public int getBugFixTime() {
        return bugFixTime;
    }

    public void setBugFixTime(int bugFixTime) {
        this.bugFixTime = bugFixTime;
    }

    public int getNumberOfPartnersAdded() {
        return numberOfPartnersAdded;
    }

    public void setNumberOfPartnersAdded(int numberOfPartnersAdded) {
        this.numberOfPartnersAdded = numberOfPartnersAdded;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public int getAverageTimeUse() {
        return averageTimeUse;
    }

    public void setAverageTimeUse(int averageTimeUse) {
        this.averageTimeUse = averageTimeUse;
    }

    public int getNumberOfNodesConnections() {
        return numberOfNodesConnections;
    }

    public void setNumberOfNodesConnections(int numberOfNodesConnections) {
        this.numberOfNodesConnections = numberOfNodesConnections;
    }

    public int getConnectivityCapacity() {
        return ConnectivityCapacity;
    }

    public void setConnectivityCapacity(int ConnectivityCapacity) {
        this.ConnectivityCapacity = ConnectivityCapacity;
    }

    public int getRatioConnectionsCapacity() {
        return ratioConnectionsCapacity;
    }

    public void setRatioConnectionsCapacity(int ratioConnectionsCapacity) {
        this.ratioConnectionsCapacity = ratioConnectionsCapacity;
    }

    public int getNodesCentrality() {
        return nodesCentrality;
    }

    public void setNodesCentrality(int nodesCentrality) {
        this.nodesCentrality = nodesCentrality;
    }

    public int getNumberOfExternalPartners() {
        return numberOfExternalPartners;
    }

    public void setNumberOfExternalPartners(int numberOfExternalPartners) {
        this.numberOfExternalPartners = numberOfExternalPartners;
    }

    public String getGlossaryOfTerms() {
        return GlossaryOfTerms;
    }

    public void setGlossaryOfTerms(String GlossaryOfTerms) {
        this.GlossaryOfTerms = GlossaryOfTerms;
    }

    public int getNumberOfProductTypes() {
        return numberOfProductTypes;
    }

    public void setNumberOfProductTypes(int numberOfProductTypes) {
        this.numberOfProductTypes = numberOfProductTypes;
    }

    public int getGreaterCollaboration() {
        return GreaterCollaboration;
    }

    public void setGreaterCollaboration(int GreaterCollaboration) {
        this.GreaterCollaboration = GreaterCollaboration;
    }

    public int getNumberOfActiveProjects() {
        return numberOfActiveProjects;
    }

    public void setNumberOfActiveProjects(int numberOfActiveProjects) {
        this.numberOfActiveProjects = numberOfActiveProjects;
    }

    public int getTotalProducedFiles() {
        return TotalProducedFiles;
    }

    public void setTotalProducedFiles(int TotalProducedFiles) {
        this.TotalProducedFiles = TotalProducedFiles;
    }

    public int getNumberOfPartners() {
        return numberOfPartners;
    }

    public void setNumberOfPartners(int numberOfPartners) {
        this.numberOfPartners = numberOfPartners;
    }

    public int getNumberOfCommercialSponsors() {
        return numberOfCommercialSponsors;
    }

    public void setNumberOfCommercialSponsors(int numberOfCommercialSponsors) {
        this.numberOfCommercialSponsors = numberOfCommercialSponsors;
    }

    public int getTotalContributionValue() {
        return TotalContributionValue;
    }

    public void setTotalContributionValue(int TotalContributionValue) {
        this.TotalContributionValue = TotalContributionValue;
    }

    public int getNumberOfActiveContributors() {
        return numberOfActiveContributors;
    }

    public void setNumberOfActiveContributors(int numberOfActiveContributors) {
        this.numberOfActiveContributors = numberOfActiveContributors;
    }

    public int getNumberOfFrequentUsers() {
        return numberOfFrequentUsers;
    }

    public void setNumberOfFrequentUsers(int numberOfFrequentUsers) {
        this.numberOfFrequentUsers = numberOfFrequentUsers;
    }

    public String getHaveDocumentation() {
        return haveDocumentation;
    }

    public void setHaveDocumentation(String haveDocumentation) {
        this.haveDocumentation = haveDocumentation;
    }

    public int getNumberOfContributorsTypes() {
        return numberOfContributorsTypes;
    }

    public void setNumberOfContributorsTypes(int numberOfContributorsTypes) {
        this.numberOfContributorsTypes = numberOfContributorsTypes;
    }

    public int getNumberOfTypesAppProjects() {
        return numberOfTypesAppProjects;
    }

    public void setNumberOfTypesAppProjects(int numberOfTypesAppProjects) {
        this.numberOfTypesAppProjects = numberOfTypesAppProjects;
    }

    public String getSupportNaturalLanguages() {
        return supportNaturalLanguages;
    }

    public void setSupportNaturalLanguages(String supportNaturalLanguages) {
        this.supportNaturalLanguages = supportNaturalLanguages;
    }

    public int getNumberOfTypesTechSupported() {
        return numberOfTypesTechSupported;
    }

    public void setNumberOfTypesTechSupported(int numberOfTypesTechSupported) {
        this.numberOfTypesTechSupported = numberOfTypesTechSupported;
    }

    public int getNumberOfTypesDevTechSupported() {
        return numberOfTypesDevTechSupported;
    }

    public void setNumberOfTypesDevTechSupported(int numberOfTypesDevTechSupported) {
        this.numberOfTypesDevTechSupported = numberOfTypesDevTechSupported;
    }
    private int numberOfProductTypes;
    private int GreaterCollaboration;
    private int numberOfActiveProjects;
    private int TotalProducedFiles;
    private int numberOfPartners;
    private int numberOfCommercialSponsors;
    private int TotalContributionValue;
    private int numberOfActiveContributors;
    private int numberOfFrequentUsers;
    private String haveDocumentation;
    private int numberOfContributorsTypes;
    private int numberOfTypesAppProjects;
    private String supportNaturalLanguages;
    private int numberOfTypesTechSupported;
    private int numberOfTypesDevTechSupported;

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
