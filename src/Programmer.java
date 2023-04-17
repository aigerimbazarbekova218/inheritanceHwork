public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void learn() {
        System.out.println(getName() + " is learning");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " is walking");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    public void coding(){
        System.out.println(getName() + " is coding");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                ",name =" + getName()+'\''+
                ", designation='" + getDesignation()+ '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
