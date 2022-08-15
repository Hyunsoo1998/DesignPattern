package DecoratePattern;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "하우스 블렌드 커피";

    }
    public double cost() {
        return .89;

    } //description변수값을 하우스 블렌드 커피로 설정하고 cost()메소드가 89센트를 리턴하게 만들면 된다.

}
