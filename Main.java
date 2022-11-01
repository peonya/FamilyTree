package FamilyTree;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 56);
        Person vasya = new Person("Вася", 30);
        Person masha = new Person("Маша", 25);
        Person jane = new Person("Женя", 2);
        Person ivan = new Person("Ваня", 5);
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);

        System.out.println(new Research(gt).spend(irina,
                Relationship.parent));

        System.out.println("Поиск людей по возрасту: " + new Research(gt).SearchAge());

    }

}