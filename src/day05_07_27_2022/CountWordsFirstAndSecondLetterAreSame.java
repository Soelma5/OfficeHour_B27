package day05_07_27_2022;

public class CountWordsFirstAndSecondLetterAreSame {
    public static void main(String[] args) {
        int count = 0;
        String[] array = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet", "Asya"};
        for(String eachName : array){
            String first = eachName.charAt(0) + "";
            String last = eachName.charAt(eachName.length() - 1) + "";
            if(first.equalsIgnoreCase(last))
                count++;

        }
        System.out.println(count);
    }
}
