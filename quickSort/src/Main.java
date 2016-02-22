/**
 * User:    ovidiu
 * Package: day1
 * Date:    2/22/16
 * Time:    12:08 PM
 */
public class Main {
    static void quickSort(String[] strings, int low, int high){
        int pivot, i, j;
        String temp = new String();

        if (low < high)
        {
            pivot = low;
            i = low;
            j = high;
            while (i < j)
            {
                while (strings[i].compareTo(strings[pivot]) <= 0 && (i < high))
                {
                    i++;
                }
                while (strings[j].compareTo(strings[pivot]) > 0)
                {
                    j--;
                }
                if (i < j)
                {
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
            temp = strings[pivot];
            strings[pivot] = strings[j];
            strings[j] = temp;
            quickSort(strings, low, j - 1);
            quickSort(strings, j + 1, high);
        }
    }

    static String[] getArgs(String[] args){
        // Returns the array of arguments as a new array of strings.

        String[] newStrings = new String[args.length];
        for (int index = 0; index < args.length; index++)
            newStrings[index] = args[index];
        return (newStrings);
    }

    static void printStrings(String[] strings){
        for (int index = 0; index < strings.length; index++)
            System.out.println(strings[index]);
    }

    public static void main(String[] args){
        String[] strings = getArgs(args);
        quickSort(strings, 0, strings.length - 1);
        printStrings(strings);
    }
}
