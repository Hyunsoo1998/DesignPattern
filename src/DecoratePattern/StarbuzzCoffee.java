package DecoratePattern;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " ₩"+beverage.cost());

        Beverage beverage2  = new DarkRoast() ; //DarkRoast객체를 만든다.
        beverage2 = new Mocha(beverage2); //Mocha로 감싼다.
        beverage2 = new Mocha(beverage2); // 모카샷 하나 더 추가.
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "₩" + beverage2.cost());


        Beverage beverage3 = new HouseBlend(); //두유와 모카를 추가하고 휘핑크림을 얹은 하우스블렌드 커피를 주문한다.
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() + "₩"+beverage3.cost());

    }


}
