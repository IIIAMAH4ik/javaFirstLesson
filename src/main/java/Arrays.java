public class Arrays {
    public static void main(String[] args){
        var m = 10;
        int[] number = new int[5];
        System.out.println(number[number.length - 1]);
        number[0] = 10;
        for (int i = 0; i < number.length; i++) {
            number[i] = i * 10;
        }
        System.out.println(number[3]);
        int[] numbers = {1,4,2,345};
    }
}
