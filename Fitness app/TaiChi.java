package P3;



public class TaiChi extends Flexibility{
	/**
	 * @return returns a list of the muscles targeted 
	 */
	@Override
	public Muscle[] muscleTargeted() {
		Muscle[] a = {Muscle.Arms,Muscle.Legs};
		return a;
	}
/**
 * @return returns the amount of calries loss 
 */
	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		double intense;
		if (intensity==Intensity.HIGH)
		{
			intense=5.0;
		}
		else if(intensity== Intensity.MEDIUM)
		{
			intense=3.0;
		}
		else {
			intense=1.5;
		}
		double cal = ((intense*weight)*duration)/60.0;
		return cal;
	}
	/**
	 * @returns the description of the class
	 */
	@Override 
	public String description()
	{
		return "TaiChi";
	}

}
