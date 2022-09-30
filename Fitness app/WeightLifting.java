package P3;



public class WeightLifting  extends Anaerobic {
	/**
	 * @return returns a list of the muscles targeted 
	 */
	@Override
	public Muscle[] muscleTargeted() {
		
		Muscle[] a = {Muscle.Shoulders,Muscle.Legs,Muscle.Arms,Muscle.Triceps};
		return a;
	}
/**
 * @return returns the amount of calories loss
 */
	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		double intense;
		if (intensity==Intensity.HIGH)
		{
			intense=6.0;
		}
		else if(intensity== Intensity.MEDIUM)
		{
			intense=5.0;
		}
		else {
			intense=3.5;
		}
		double cal = ((intense*weight)*duration)/60.0;
		
		return cal;
	}
	/**
	 * @returns the description of the class
	 */
	@Override 
	public String description() {
		return "WeightLifting";
	}

}
