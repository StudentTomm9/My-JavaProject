package training6chapter;

public class AnimalTest {
    static void main(String[] args) {
        Animals dog = new Dog(2,"黑色");
        Animals cat = new Cat(3,"灰色");
        Person keepper1 = new Person("老王",30);
        Person keepper2 = new Person("老李",25);

        keepper1.keepPet((Dog)dog,"骨头");
        keepper2.keepPet((Cat) cat,"鱼");

    }
}
