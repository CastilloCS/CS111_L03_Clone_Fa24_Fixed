// STUDENT NAME:
// DATE: 
public class Main
{
    public static void main(String[] args)
    {
        /***** DECLARATION SECTION *****/
        int dayToday, monthToday, yearToday,
                dayBirth, monthBirth, yearBirth,
                y, m, a, todayJDN, birthJDN, daysDiff;

        /***** INITIALIZATION SECTION *****/
        dayToday = 2;
        monthToday = 2;
        yearToday = 2020;

        dayBirth = 26;
        monthBirth = 8;
        yearBirth = 1918;

        y = m = a = 0;
        todayJDN = birthJDN = 0;
        daysDiff = 0;

        /***** INPUT SECTION *****/
        // N/A (no input for this lab)

        /***** CALCULATION & PROCESSING SECTION *****/
        a = (14 - monthToday) / 12;
        m = monthToday + 12 * a - 3;
        y = yearToday + 4800 - a;

        todayJDN = dayToday + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;

        a = (14 - monthBirth) / 12;
        m = monthBirth + 12 * a - 3;
        y = yearBirth + 4800 - a;
        birthJDN = dayBirth + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;

        daysDiff = todayJDN - birthJDN;

        /***** OUTPUT SECTION *****/
        System.out.println("Julian Day Number for today's date, " + monthToday + "/" + dayToday +"/" + yearToday + ", is " + todayJDN );
        System.out.println();
        System.out.println("Julian Day Number for birthday, " + monthBirth + "/" + dayBirth +"/" + yearBirth + ", is " + birthJDN);
        System.out.println();
        System.out.println("The difference in days is " + daysDiff +", which makes you approximately " + daysDiff / 365 + " years old!");
    }
}
