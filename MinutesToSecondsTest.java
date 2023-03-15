public class MinutesToSecondsTest {
    public static void main(String[] args) {
        System.out.println(Integer.toString(convert(5)));
        System.out.println(Integer.toString(convert(3)));
        System.out.println(Integer.toString(convert(2)));
    }

    public static int convert(int time) {
        time=time*60;
        return time;
    }

}
