package P3;



public class Yoga extends Flexibility {

	/**
	 * @return returns a list of the muscles targeted 
	 */
	@Override
	public Muscle[] muscleTargeted() {

		Muscle[] a = {Muscle.Triceps,Muscle.Biceps};
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
			intense=4.0;
		}
		else if(intensity== Intensity.MEDIUM)
		{
			intense=3.0;
		}
		else {
			intense=2.0;
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
		return "Yoga";
	}

}
