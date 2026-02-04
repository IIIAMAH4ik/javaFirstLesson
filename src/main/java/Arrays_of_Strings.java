public class Arrays_of_Strings {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0]  = 10;
        String[] strings = new String[3];
        strings[0] = "gog";
        strings[1] = "ergf";

        for(int i = 0; i<strings.length; i++){
            System.out.println(strings[i]);

        for(String string:strings) { // тип данных имя переменной:имя массива
            System.out.println(string);
        }
        int[] number = {1,2,3};
        int sum = 0;
        for(int x:number){
            sum += x;
        }
        System.out.println(sum);
        }
    }
}
