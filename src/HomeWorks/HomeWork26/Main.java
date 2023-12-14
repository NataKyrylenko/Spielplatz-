/*Геометрические фигуры
    Используя свойства наследования написать программу для подсчета площади трех видов фигур -
    круга, прямоугольника и квадрата.
    Создать классы Circle, Rectangle, Square , содержащие соответствующие методы.
    Затем в методе main создать маcсив из нескольких фигур и вывести на печать площади каждой фигуры и название ее
    примерно в таком виде :
    Circle has area of 100.0
    Rectangle has area of 400.0
    Square has area of 340.0 */
package HomeWorks.HomeWork26;

public class Main {
    public static void main(String[] args) {
        Figures[] figures = {new Circle(0, 0, 0), new Rectangle(0, 0, 0), new Square(0, 0, 0)};
    

    for(Figures fig : figures){
        System.out.println(fig + " has area of ");
    }

    }
}
