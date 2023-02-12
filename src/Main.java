public class Main {
    public static void main(String[] args)
    {
        int month = 20;
        final int MONTH_MIN = 1;
        final int MONTH_MAX = 12;

        if(month <= MONTH_MAX && month >= MONTH_MIN){
            System.out.println(" your birth month is"+ " "+month);
    }
        else{
            System.out.println(" you entered an incorrect month value:"+ " "+ month);

    }
    }
}