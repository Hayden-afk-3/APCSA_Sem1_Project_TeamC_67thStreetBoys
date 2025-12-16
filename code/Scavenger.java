package code;
class Scavenger extends Person{
    // implements the activity's list and explanations to specific role
    private  String[] activityListClass = {"Scavenge Bass Pro Shops"};
    private  String[] activityListExplainClass = {"High chance to find good loot. High chance of finding zombies."};
    
    /**
     * Constructor for Scavenger class
     * @param theName applies name to the person
     */
    public Scavenger(String theName) {
        super(theName);
    }

    /**
     * Scavenge Bass Pro Shops
     */
    public void scavengeBassProShops() {
    }

    /**
     * Gets the activity list specific to Scavenger class
     * @return activity list
     */
    @Override
    public String[] getActivityListClass() {
        return activityListClass;
    }

    /**
     * Gets the list explaining the actvities specific to Scavenger class
     * @return activity explanation list
     */
    @Override
    public String[] getActivityListExplainClass() {
        return activityListExplainClass;
    }

    /**
     * Parses the activity choice specific to Scavenger class
     * @param choice activity choice
     */
    @Override
    public void parseActivity(int choice) {
        switch (choice) {
            case 1:
                this.scavengeWalmart();
                break;
            case 2:
                this.takeANap();
                break;
            case 3:
                this.scavengeBassProShops();
                break;
        }
    }
}