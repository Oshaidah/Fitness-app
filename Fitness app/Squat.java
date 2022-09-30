package P3;



public class Squat extends Endurance {
	/**
	 * @return returns a list of the muscles targeted 
	 */
	@Override
	public Muscle[] muscleTargeted() {
		Muscle[] a = {Muscle.Glutes,Muscle.Abs,Muscle.Back};
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
			intense=7.0;
		}
		else if(intensity== Intensity.MEDIUM)
		{
			intense=5.0;
		}
		else {
			intense=2.5;
		}
		double cal = ((intense*weight)*duration)/60.0;
		return cal;
	}
	/**
	 * @return returns the description of the class
	 */
	@Override 
	public String description()
	{
		return "Squat";
	}

}
