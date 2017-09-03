package enumx;

public enum Call_statusEnum {
    //0失败；2未计算；3正在计算；4已计算；5手工重新计算 6:自动重新计算
    fail("0","失败"),
    not_calculate("2","未计算"),
    being_calculated("3","正在计算"),
    already_calculate("4","已计算"),
    manual_re_calculation("5","手工重新计算"),
    automatic_re_calculation("6","自动重新计算");

    private Call_statusEnum(String key, String name) {
        this.key = key;
        this.name = name;
    }

    private String key;

    private String name;

    @Override
    public String toString(){
        return key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}