public class NewClass {

    public int a = 20;

    public String print(){
        String value = String.format("---<%d>---%n", a);
        System.out.println(value);
        return value;
    }

}
