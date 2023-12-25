public class Human {
    

    public Human(String name) {
        super(name);
    }

    @Override
    String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean status) {
    }

    @Override
    public void setTakeOrder(boolean status) {
    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }
}
