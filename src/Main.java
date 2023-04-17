public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person= new Person("Adam","inspire");
        System.out.println(person);
        person.learn();
        person.eat();
        person.walk();
       Programmer programmer=new Programmer("Aijamal","developer","IBM");
        System.out.println(programmer);
        programmer.learn();
        programmer.eat();
        programmer.walk();
        programmer.coding();
       Danser danser=new Danser("Atai","performer","Tumar");
        System.out.println(danser);
        danser.learn();
        danser.eat();
        danser.walk();
        danser.dancing();
       Singer singer=new Singer("Kanykei","etno","Kyrgyz kaimaktary");
        System.out.println(singer);
        singer.learn();
        singer.eat();
        singer.walk();
        singer.singing();
        singer.playGitar();










    }
}