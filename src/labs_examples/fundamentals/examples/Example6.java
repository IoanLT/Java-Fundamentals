package labs_examples.fundamentals.examples;

/*
  Demonstrate the for loop.

  Call this file ForDemo.java.
*/
class ForDemo {
    public static void main(String[] args) {
        String[] zergArray = {"drone", "ling", "roach", "hydra", "ultra"};
        for (int i = 0; i < zergArray.length; i++) {
            Zerg zerg = new Zerg();
            zerg.name = zergArray[i];
            System.out.println(zergArray[i]);
        }

        String[] protossArray = {"probe", "zealot", "templar"};
        for (int i = 0; i < protossArray.length; i++) {
            Protoss protoss = new Protoss();
            protoss.name = protossArray[i];
            System.out.println(protossArray[i]);
        }

        String[] terranArray = {"scv", "marine", "thor", "banshee"};
        for (int i = 0; i < terranArray.length; i++) {
            Terran terran = new Terran();
            terran.name = terranArray[i];
            System.out.println(terranArray[i]);
        }

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}