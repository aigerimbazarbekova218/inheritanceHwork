public class Singer extends Person{
    private String bandName;


    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public void learn() {
        System.out.println(getName()+ " is learning");
    }

    @Override
    public void walk() {
        System.out.println(getName()+ " is walking");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }
    public void singing(){
        System.out.println(getName() + " is singing");
    }
    public void playGitar(){
        System.out.println(getName()  + " is playGitar");
    }

    @Override
    public String toString() {
        return "Singer{" +
                ",name =" + getName()+'\''+
                ", designation='" + getDesignation()+ '\'' +
                ", bandName='" + bandName + '\'' +
                '}';
    }
}
