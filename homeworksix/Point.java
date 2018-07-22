package homeworksix;
/*
Создать класс Point, описывающий точку в двумерных координатах. Полями этого класса должны быть координаты x и y. Класс должен иметь один конструктор, принимающий координаты x и y. Сделайте информацию о координатах скрытой, а получить её можно только с помощью методов доступа (get/set).
Создать метод distance, принимающий объект Point и определяющий расстояние до неё.

Используя класс точки, создать класс Rectangle, описывающий прямоугольник.
В нём хранятся два поля типа Point - координаты левого верхнего и правого нижнего углов.
Создать следующие методы в классе Rectangle:
- Высчитывающий площадь прямоугольника
- Высчитывающий длину диагонали

Написать тестовый класс с методом main программу, демонстрирующим создание объекта класса Rectangle и применение вышеперечисленных методов.
*/

public class Point {
   private int x;
   private int y;

   public Point(int x, int y){
       this.x = x;
       this.y = y;
   }

    public void setX(int x){
       this.x = x;
    }

    public void setY(int y){
       this.y = y;
    }

    public int getX(int x){
       return this.x;
    }

    public int getY(int y){
        return this.y;
    }

  public static double distance (Point point, Point point2) {
      return Math.sqrt(((point2.x - point.x)*(point2.x - point.x)) + ((point2.y - point.y)*(point2.y - point.y)));
       }
    }


