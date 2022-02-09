import java.util.Scanner;

class CountingMinutes {

    static final int MINUTES_IN_HOUR = 60;
    static final int MINUTES_IN_DAY = 24 * 60;

    static int countingMinutes(String str){
        String[] times = str.split("-");

        int start = getMinuteofDay(times[0]);
        int end = getMinuteofDay(times[1]);

        return getDiff(start,end);
    }

    static int getMinuteofDay(String time){
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1].substring(0, parts[1].length() - 2));
        int minofDay = time.toLowerCase().contains("pm") ? (hour * MINUTES_IN_HOUR) + min + (MINUTES_IN_DAY / 2) : (hour * MINUTES_IN_HOUR) + min;
        return minofDay > MINUTES_IN_DAY ? minofDay - MINUTES_IN_DAY : minofDay;
    }

    static int getDiff(int start, int end){
        if (start <= end) return end - start;
        return (MINUTES_IN_DAY - start) + end;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(countingMinutes(s.nextLine()));
    }

}