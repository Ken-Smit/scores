//Kenneth Smith 
//7-20-2024
//9.2

public class scores {
    public static void main(String[] args)   {
    //Create Array
        int[] scores = {200, 456, 686, 754, 130, 127, 155, 185, 136, 276, 227, 254, 226, 588, 376, 546, 980, 568, 398, 403};


        int highest = scores[0];
        int lowest = scores[0];
        int sum = 0;

        //Calculate lowest score, highest scor, and sum of all scores 
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
        }

        //Calculate score average
        sum += score;
    }

    double average = sum / 20.0;

    //Print the Results
    System.out.println("\n--- Scores ---");
    System.out.println("Highest value: " + highest);
    System.out.println("Lowest value: " + lowest);
    System.out.println("Sum of the numbers: " + sum);
    System.out.println("Average of the numbers: " + average);

  
    }


}
