class Box {

    double widht;
    double height;
    double depth;

    double volume = widht*height*depth;
}

class BoxDemo {
    public static void main(String[] args) {


        Box mybox = new Box();
        Box mybox2 = new Box();

        double vol;

        mybox.widht = 10;
        mybox.height = 20;
        mybox.depth = 15;

        mybox2.widht = 6;
        mybox2.height = 8;
        mybox2.depth = 10;


        vol = mybox.widht * mybox.height * mybox.depth;

        System.out.println("Объем 1 равен " + vol);

        vol = mybox2.widht * mybox2.height * mybox2.depth;

        System.out.println("Объем 2 равен " + vol);

        System.out.println("Volume 2 is "+mybox2.volume);
    }
}