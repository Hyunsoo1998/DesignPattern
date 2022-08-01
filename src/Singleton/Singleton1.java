package Singleton;

public class Singleton1 {
    private static Singleton1 uniqueInstance;

    //기타 인스턴스 변수
    private Singleton1() {}


    //getInstance()에 synchronized 키워드를 추가하면 한 스레드가 메소드 사용을 끝내기 전까지 다른 스레드는 기다려야한다.
    // 즉 2개의 스레드가 이 메소드를 동시에 실행하는 일은 일어나지 않는다.

    //하지만 동기화할때 속도문제가 발생하여 성능이 저하된다.
    //메소드를 동기화하면 성능이 100배 정도 저하된다.

    public static synchronized Singleton1 getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;

    }
    //기타 메소드
}
