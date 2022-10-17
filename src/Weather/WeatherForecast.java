package Weather;

public class WeatherForecast {
    public static void main(String[] args){
        int weatherToday = 17;
        int weatherTomorrow = 18;
        String text1 = " Температура сегодня +";
        String text2 = " Температура завтра +";
        String text3 = " Прогноз погоды в Чернигове:";

        System.out.println(text3);
        System.out.println( text1 + weatherToday + " °C ");
        System.out.println(text2 + weatherTomorrow + " °C ");


    };
}
