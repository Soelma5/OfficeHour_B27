package day07_08_17_2022;

public class WrapperClassSeparateLetter {

        public static void main(String[] args) {
            String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
            //str.toCharArray();
            //str.split("");
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);


                if (Character.isAlphabetic(c)){
                    result+=c;
                }

            /*
            if (c==' '){
                result+=c;
            }

             */


            }
            System.out.println("result = " + result);


        }
    }

