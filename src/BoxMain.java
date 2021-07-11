public class BoxMain {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();

        mybox1.height = 4;
        mybox1.widht = 3;
        mybox1.depth = 7;

        mybox2.height = 6;
        mybox2.widht = 8;
        mybox2.depth = 9;

        mybox1.volume();
        mybox2.volume();

        System.out.println("Vol2 is " + mybox1.volume2());
        System.out.println("Vol2 is " + mybox2.volume2());

       System.out.println("new_branch 333");


    }
}
