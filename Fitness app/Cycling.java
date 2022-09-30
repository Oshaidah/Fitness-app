package P3;

public class Cycling extends Aerobic {
	/**
	 * @return returns a description of the class
	 */
	@Override
	public String description() {
		return "Cycling";
	}
	/**
	 * @return returns a list of the muscles targeted 
	 */
	@Override
	public Muscle[] muscleTargeted() {
		
		Muscle[] a={Muscle.Glutes,Muscle.Cardio,Muscle.Legs};
		return a;
		
		
		
		
		
	}
	/**
	 * @return the calorieLoss for the workout
	 */
	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		double intense;
		if (intensity== Intensity.HIGH) 
		{
			intense = 14.0;
		}
		else if (intensity==Intensity.MEDIUM) {
			intense= 8.5;
		}
		else {
			intense=4.0;
		}
		double cal = ((intense*weight)*duration)/60.0;
		return cal;
	}

}
