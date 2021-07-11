public class Box1 {
    double widht;
    double height;
    double depth;

    void volume() {
        System.out.print("Volume is ");
        System.out.println(widht * height * depth); //неоптимальный метод, котор непосредственно считает и
        //выводит на печать (возвращает рез-тат такими операциями
    }

    double volume2() {
        return widht * height * depth; // более грамотный метод, возвращающий результат в виде расчитанной величины
    }

}
