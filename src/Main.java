import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int index = 0;
        int zero=0,one=0, two=0, three=0, four=0, five=0, six=0, seven=0, eight=0, nine=0;
        System.out.println("Enter a string");
        String sentence = keyboard.nextLine();
        int[] count = new int[10];
        for(int i = 0; i<count.length; i++)
        {
            count[i] = i;

            for(int k = 0; k<sentence.length(); k++)
            {
                 index = Integer.parseInt(String.valueOf(sentence.charAt(k)));
                 if(index == count[i]&&(i== 0))
                 {
                     zero++;

                 }
                if(index == count[i]&&(i== 1))
                {
                    one++;

                }
                if(index == count[i]&&(i== 2))
                {
                    two++;

                }
                if(index == count[i]&&(i== 3))
                {
                    three++;

                }
                if(index == count[i]&&(i== 4))
                {
                    four++;

                }
                if(index == count[i]&&(i== 5))
                {
                    five++;

                }
                if(index == count[i]&&(i== 6))
                {
                    six++;

                }
                if(index == count[i]&&(i== 7))
                {
                    seven++;

                }
                if(index == count[i]&&(i== 8))
                {
                    eight++;

                }
                if(index == count[i]&&(i== 9))
                {
                    nine++;

                }


            }

        }
       System.out.println("zero: " + zero);
        System.out.println("one: "+ one);
        System.out.println("two: "+ two);
        System.out.println("three: "+ three);
        System.out.println("four: "+ four);
        System.out.println("five: "+ five);
        System.out.println("six: "+ six);
        System.out.println("seven: "+ seven);
        System.out.println("eight: "+ eight);
        System.out.println("nine: "+ nine);


    }
}
