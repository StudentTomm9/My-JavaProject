package training4chapter;

public class abstractTest1 {
    static void main(String[] args) {
        frog wawa = new frog("青蛙",2);
        Dog dog = new Dog("边牧",3);
        sheep sheep = new sheep("山羊",5);
        wawa.eat();dog.eat();sheep.eat();
        wawa.drink();dog.drink();sheep.drink();
        wawa.swim();dog.swim();
    }

}
