
/**
 * Created by Rohan on 14/07/16.
 */
class BinaryNumbers {

    int convertTodDecimal(int binnum) {
        int base = 10;
        int decimalNumber = 0, i = 0, remainder;
        while (binnum > 0) {
            remainder = binnum % base;
            binnum = binnum / base;
            decimalNumber += remainder * Math.pow(2, i);
            i++;
        }
        return decimalNumber;
    }

    String convetToBinary(int decimal) {
        int base = 2;
        String binArray = "";
        while (decimal > 0) {
            int remainder = decimal % base;
            decimal = decimal / base;
            binArray = remainder + binArray;
        }

        return binArray;
    }

    void findConsecutive(int n) {

        String binString = convetToBinary(n);

        String[] binArray = binString.split("0");
        int max = 0;
        for (String s : binArray) {
            int temp = s.length();
            if (max < temp) {
                max = temp;
            }
        }
        //char[] chars=binString.toCharArray();
//        char[] chars = Integer.toBinaryString(n).toCharArray();
//        int counter = 0;
//        int max = 0;
//        for (char c : chars) {
//
//            if (c == '1') {
//                counter++;
//            } else {
//                counter = 0;
//            }
//
//            if (max < counter) {
//                max = counter;
//            }
//        }
        System.out.println(max + "");
    }
}
