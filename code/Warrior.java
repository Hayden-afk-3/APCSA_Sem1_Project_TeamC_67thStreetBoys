package code;
class Warrior extends Person{
    private String[] activityListClass = {"Hunt for Food"};
    private  String[] activityListExplainClass = {"Regain Satiation. Lose Energy."};
    public Warrior(String theName) {
        super(theName);
    }
    @Override
    public String[] getActivityListClass() {
        return activityListClass;
    }
    @Override
    public String[] getActivityListExplainClass() {
        return activityListExplainClass;
    }
}