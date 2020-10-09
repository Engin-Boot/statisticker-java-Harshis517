package statisticker;

import java.util.List;

public class Statistics 
{
    public static class Stats {
        public float min, max;
        public float average;
        public Stats(){
            min=Float.NaN;
            max =Float.NaN;
            average=Float.NaN;
        }
        public Stats(float average, float min, float max){
            this.average= average;
            this.max=max;
            this.min=min;
        }
    }


   
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        Statistics.Stats s=new Stats();
        if(!numbers.isEmpty())
        {
            s.min= Collections.min(numbers);
            s.max= Collections.max(numbers);
            Float sum=0.0f;
            for(Float number:numbers){
                sum+=number;
            }
            s.average=(Float)sum/numbers.size();

        }
        return s;
}
