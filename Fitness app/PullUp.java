package P3;



public class PullUp extends Endurance {
	/**
	 * @return returns a list of the muscles targeted 
	 */
	@Override
	public Muscle[] muscleTargeted() {
		Muscle[] a = {Muscle.Biceps,Muscle.Arms};
		return a;
	}
/**
 * @return the amount of calories lost during the workout
 */
	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		double intense;
		if (intensity==Intensity.HIGH)
		{
			intense=7.5;
		}
		else if(intensity== Intensity.MEDIUM)
		{
			intense=6.0;
		}
		else {
			intense=4.8;
		}
		double cal = ((intense*weight)*duration)/60.0;
		return cal;
	}
	/**
	 * @return returns a description of the class
	 */
	@Override 
	public String description()
	{
		return "PullUp";
	}

}
