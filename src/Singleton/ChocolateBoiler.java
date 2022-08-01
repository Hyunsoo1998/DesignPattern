package Singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false; //이 코드는 보일러가 비어 있을때만 돌아간다.

    }
    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled =false;
            //보일러에 우유와 초콜릿을 혼합한 재료를 넣음.

        }

    }
    public void drain() {
        if(!isEmpty()&& !isBoiled()) {
            //끓인 재료를 다음 단계로 넘김.

            empty = true;
        }
    }
    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            //재료를 끓임.
            /*보일러가 가득 차 있고 아직 끓지 않은 상태에서만 초콜릿과 우유가 혼합된 재료를 끓인다.
            재료를 다 끓이면 boiled플래그를 true로 설정한다.
            * */
            boiled = true;

        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
