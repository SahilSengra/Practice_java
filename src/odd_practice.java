public class odd_practice {
    public static int oddDigitSum (int num)
    {
        if (num < 0)
            return -1;
        int sum = 0;

        while (num != 0)
        {
            if ((num % 10) % 2 != 0)
                sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main (String[]args)
    {
        System.out.println (oddDigitSum (123456789));
        System.out.println (oddDigitSum (252));
        System.out.println (oddDigitSum (-7));
    }
    }

