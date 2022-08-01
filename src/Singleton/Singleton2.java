package Singleton;

//인스턴스가 필요할 때는 생성하지말고 처음부터 만든다.
public class Singleton2 {
    private static Singleton2 uniqueInstance = new Singleton2();
    // 정적초기화부분에서 Singleton2의 인스턴스를 생성한다.
    //이러면 스레드를 써도 별 문제가 없다.
    private Singleton2() {}

    public static Singleton2 getInstance() {
        return uniqueInstance; // 인스턴스는 이미 있으니까 리턴만 하면 된다.
    }
}
//이러한 방법을 사용하면 로딩될 때 JVM에서 Singleton2의 하나뿐인 인스턴스를 생성해준다.
//JVM에서하나뿐인 인스턴스를 생성하기 전 까지 어떤 스레드도 uniqueInstance 정적 변수에 접근할 수 없다.

