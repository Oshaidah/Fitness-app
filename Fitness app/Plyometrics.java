package P3;

public class Plyometrics extends Anaerobic {
	/**
	 * @return returns a list of the muscles targeted 
	 */
	@Override
	public Muscle[] muscleTargeted() {
		
		Muscle[] a = {Muscle.Abs,Muscle.Legs,Muscle.Glutes};
		return a;
	}
	/**
	 * @return the calorieLoss for the workout
	 */
	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		double intense;
		if (intensity==Intensity.HIGH)
		{
			intense=7.4;
		}
		else if(intensity== Intensity.MEDIUM)
		{
			intense=4.8;
		}
		else {
			intense=2.5;
		}
		double cal = ((intense*weight)*duration)/60.0;
		return cal;
	}

	/**
	 * @return returns a desctiption of the class
	 */
	@Override 
	public String description() {
		return "Plyometrics";
	}
}
