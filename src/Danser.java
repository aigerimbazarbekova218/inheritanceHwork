public class Danser extends Person {
    private String groupName;

    public Danser(String name, String designation, String groupName) {
        super(name, designation);

        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void learn() {
        System.out.println(getName()+ " is learning");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " is walking");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating ");
    }
    public void dancing(){
        System.out.println(getName() + " is dancing");
    }

    @Override
    public String toString() {
        return "Danser{" +
                ",name =" + getName()+'\''+
                ", designation='" + getDesignation()+ '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
