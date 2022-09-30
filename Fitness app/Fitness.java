package P3;

public interface Fitness {
	
	/**
	 * 
	 * @return an interface to be implemented in the workout classes
	 */
	
	public  Muscle [ ] muscleTargeted();
	public double calorieLoss(Intensity intensity, double weight, int duration);
	public String description();

}
