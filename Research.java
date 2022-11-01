package FamilyTree;

import java.util.ArrayList;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<Person> prsn;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> SearchAge() {

        for (Node a : tree) {
            if (a.p1.age < 30) {
                result.add(a.p1.fullName);
            }
        }
        return result;

    }
}
