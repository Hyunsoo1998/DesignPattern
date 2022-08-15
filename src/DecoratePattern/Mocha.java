package DecoratePattern;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {//Mocha인스턴스에는 Beverage의 레퍼런스가 들어있다.
        //감싸고자 하는 음료를 저장하는 인스턴스 변수
        //인스턴스 변수를 감싸고자 하는 객체로 설정하는 생성자(데코레이터의 생성자에 감싸고자 하는 음료객체를 전달하는 방식을 사용)

        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", 모카";

    }
    public double cost() {
        return beverage.cost() + 20;
    }
}
