public class Less_6_Constructor {
}
            //Пример класса Вох можно переделать, чтобы значения размеров параллелепипеда присваивались
            // при конструировании объекта. Для этого придется заменить
            // метод setDim () конструктором.
class Box6 {
    double widht;
    double height;
    double depth;
    int pop; // удалить

    // рассчитать и возвратить объем
    double volumeBox6() {
        return widht * height * depth;
    }

    // установить размеры параллелепипеда
//    void setDim(double w, double h, double d) {
//        widht = w;
//        height = h;
//        depth = d;
       Box6() {         //простой конструктор со сразу введенными значениями
        widht = 10;
        height = 10;
        depth = 10;
    }            //    Как только в классе будет определен собственный конструктор,
                // конструктор по умолчанию больше не используется.
}

class BoxDemo6 {
    public static void main(String[] args) {
        Box6 mybox6_1 = new Box6();  // Создать два экземпляра класса Box5
        Box6 mybox6_2 = new Box6();
        double vol6; // создать переменную для объема

        vol6 = mybox6_1.volumeBox6();
        System.out.println(vol6);
    }
}