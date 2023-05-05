package com.sanskar.leetcode.java.datediff;

public class DateDiff {
    int dateDiff(String startDate, String endDate) {
        MyDate stDate;
        MyDate edDate;
        if (startDate.compareTo(endDate) > 0) {
            stDate = new MyDate(endDate);
            edDate = new MyDate(startDate);
        } else {
            stDate = new MyDate(startDate);
            edDate = new MyDate(endDate);

        }

        System.out.println("startDate = " + stDate);
        System.out.println("endDate = " + edDate);
        int totalNumberOfDays = 0;
        int m = stDate.getMonth();
        int y = stDate.getYear();
        // go until end month - 1, so that we can just add the remaining days to the total number of days
        while (m < edDate.getMonth() || y != edDate.getYear()) {
            int d = findNumberOfDaysInAMonth(m, y);
            totalNumberOfDays += d;
            if (m == 12) {
                y++;
                m = 1;
            } else {
                m++;
            }
        }

        totalNumberOfDays = (totalNumberOfDays - stDate.getDay()) + (edDate.getDay() - 1);
        return totalNumberOfDays;
    }


    private int findNumberOfDaysInAMonth(int month, int year) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 2 -> {
                if (year % 4 == 0) {
                    return 29;
                }
                return 28;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
        }
        return 0;
    }

    static class MyDate {
        private final int year;
        private final int month;
        private final int day;

        MyDate(String date) {
            String[] d = date.split("-");
            year = Integer.parseInt(d[0]);
            month = Integer.parseInt(d[1]);
            day = Integer.parseInt(d[2]);

        }

        public int getYear() {
            return year;
        }

        public int getMonth() {
            return month;
        }

        public int getDay() {
            return day;
        }

        @Override
        public String toString() {
            return "MyDate{" +
                    "year=" + year +
                    ", month=" + month +
                    ", day=" + day +
                    '}';
        }
    }

    public static void main(String[] args) {
        DateDiff d = new DateDiff();
        System.out.println(d.dateDiff("1983-06-02", "1983-06-22"));
        System.out.println(d.dateDiff("1984-07-04", "1984-12-25"));
        System.out.println(d.dateDiff("1989-01-03", "1983-08-03"));
    }
}
