package Singleton;

public class Singleton3 {
    private volatile static Singleton3 uniqueInstance3;
    private Singleton3(){}

    public static Singleton3 getInstance() {
        if(uniqueInstance3 == null) { // 인스턴스가 있는지 확인하고, 없으면 동기화된 블록으로 들어간다.
            synchronized (Singleton3.class) { // 처음에만 동기화 된다.
                if(uniqueInstance3 == null) {
                    uniqueInstance3 = new Singleton3(); // 블록에서도 다시한번 변수가 null인지 확인한 다음 인스턴스를 생성한다.
                }
            }
        }
        return uniqueInstance3;
    }
}
//volatile키워드를 사용하면 멀티스레딩을 쓰더라도 uniqueInstance변수가 Singleton인스턴스로 초기화되는 과정이 올바르게 진행된다.
//싱글턴을 구현하면 getInstance()메소드를 사용할때 발생하는 속도를 극적으로 줄일 수 있다.
