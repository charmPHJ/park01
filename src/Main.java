public class Main {
    public static void main(String[] args) {
//객체생성 - 인스턴스객체
        Cat c1 = new Cat();
        Cat c2 = new Cat();

        c1.name = "네로";
        c2.name = "나비";

        c1.meow();
        c2.meow();

        c1.claw();
        c2.claw();

    }
}
//클래스생성
class Cat {
//    필드생성
    String name;
    String breeds;
    int age;


// 인스턴스 메소드 호출 = 야옹 할퀴를 하게 하라,  클래스의 동작을 유도
    void meow(){
        System.out.printf("[%s]의 야옹", name);
    }
    void claw(){
        System.out.printf("[%s]의 할퀴", name);
    }

}

