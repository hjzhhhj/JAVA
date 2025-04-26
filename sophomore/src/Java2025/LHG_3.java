package Java2025;

class Animal {
    public void move() {
        System.out.println("나는 나는 새이다.");
    }
}

// 자식 클래스 Bird
class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("나는 나는 새이다.");
    }
}

// 자식 클래스 Fish
class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("나는 수영을 하는 물고기이다.");
    }
}

// 자식 클래스 Dog
class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("나는 킁킁 그리며 돌아 다니는 개이다.");
    }

    public void bark() {
        System.out.println("나는 멍멍 하고 짓는다.");
    }
}

public class LHG_3 {
    public static void main(String[] args) {
        Animal[] aniArr = new Animal[3];

        aniArr[0] = new Bird();
        aniArr[1] = new Fish();
        aniArr[2] = new Dog();

        for (Animal ani : aniArr) {
            ani.move();
        }

        // 다운캐스팅을 사용하여 Dog 객체의 bark() 호출
        if (aniArr[2] instanceof Dog) {
            Dog d = (Dog) aniArr[2];
            d.bark();
        }
    }
}
