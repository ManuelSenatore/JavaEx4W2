public class Customer {
    static long id = 0L;
    private String name;
    private Integer tier;

    Customer(String name, Integer tier){
        setName(name);
        setTier(tier);
    }

    private void setTier(Integer tier) {
        this.tier = tier;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Integer getTier() {
        return tier;
    }
    @Override
    public String toString(){
        return getName() +  ", " + getTier();
    }
}
