public class Methods4 { // получется этот класс здесь не использую, остается для сохранения имени файла java
}

        // В этой программе применяется метод с параметрами

class Box5 {
    double widht;
    double height;
    double depth;
                    // рассчитать и возвратить объем
    double volumeBox5() {
        return widht * height * depth;
    }
                    // установить размеры параллелепипеда
    void setDim (double w, double h, double d){
        widht = w;
        height = h;
        depth = d;
//        this.widht = w;      // либо такой вариант, который видимо более грамотный (еще не пройден в книге)
//        this.height = h;
//        this.depth = d;
    }
}

class BoxDemo5{
    public static void main(String[] args) {
        Box5 mybox5_1 = new Box5();  // Создать два экземпляра класса Box5
        Box5 mybox5_2 = new Box5();
        double vol5; // создать переменную для объема

                        // Инициализировать каждый экземпляр класса Box5
        mybox5_1.setDim(5, 3, 4);
        mybox5_2.setDim(10, 7, 2);

                        // получить объем первого паралл-да
        vol5 = mybox5_1.volumeBox5();
        System.out.println(vol5);

                        // получить объем второго паралл-да
        vol5 = mybox5_2.volumeBox5();
        System.out.println(vol5);
    }
}
