public class SlowGrowersMain {

    public static void main(String[] args){
        double specific_alpha = Math.log(11.5)/500.;
        //THIS IS NOT BETA SWAPPED  
        BioSystem.exponentialGradient_spatialAndGRateDistributions();

    }
}