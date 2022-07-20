
class one_methhod_two {
    static int addNumbers(int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }

    static double myMoney(float income, float tax) {
        return income * tax;
    }

    static int[] numbersArray(int x, int y, int z) {

        int[] arr = {x, y, z};
        return arr;
    }
    
    static void printNumbers(int x, int y, int z) {

        System.out.println(x + y * z);
    }
    public static void main(String[] args) {

        printNumbers(3, 4, 5);

        my totalIncome = myMoney(300.30, .08)
        Systemo.out.println(totalIncome);

        int sum = addNumbers(2, 3, 4); // 9
        System.out.println(sum);
    }
}