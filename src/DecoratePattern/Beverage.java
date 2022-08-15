package DecoratePattern;

public abstract class Beverage { //Beverage는 추상클래스이며 2개의 메소드를 가진다.
    String description = "제목 없음";

    public String getDescription() { //getDescription은 이미 구현되어 있지만 cost()는 서브클래스에서 구현해야한다.
        return description;
    }
    public abstract double cost();

}
