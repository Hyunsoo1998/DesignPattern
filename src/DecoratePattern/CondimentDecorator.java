package DecoratePattern;

public abstract class CondimentDecorator extends Beverage{ //Beverage 객체가 들어갈 자리에 들어갈 수 있어야 하므로
    //Beverage클래스를 확장한다.


   Beverage beverage ;
    //각 데코레이터가 감쌀 음료를 나타내는 Beverage 객체를 여기에서 지정한다.
    //음료를 지정할 때는 데코레이터에서 어떤 음료든 감쌀 수 있도록 Beverage 슈퍼클래스 유형을 사용한다.



    public abstract String getDescription(); //모든 첨가물 데코레이터에 getDescription()메소드를 새로 구현하도록 만들 계획.
    //추상메서드로 선언했다.


    public double cost() {
        return 0.3;

    }
}

