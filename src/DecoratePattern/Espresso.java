package DecoratePattern;

public class Espresso extends Beverage{ //Beverage클래스를 확장한다.
    public Espresso() {
        description = "에스프레소"; // 클래스 생성자 부분에서 description변수값을 설정한다. description이라는 인스턴스 변수는
        //Beverage로부터 상속받는다.

    }
    public double cost() {
        return 1.99;

    }
}
