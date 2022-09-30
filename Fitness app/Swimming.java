package P3;



public class Swimming extends Aerobic {
	
	private SwimmingType S;
	

	/**
	 * 
	 * @param type a Constructer
	 */
	public Swimming (SwimmingType type) {
		
		this.S=type;
		
		
		
	}
	/**
	 * a default constructer 
	 */
	public Swimming() {
		this.S=SwimmingType.Freestyle;
	}
	/**
	 * 
	 * @param type a type of swimming to be assinged 
	 */
	public void setSwimmingType(SwimmingType type) {
		this.S= type;
	}
/**
 * 
 * @return the swimming Type
 * a getter method
 */
	public SwimmingType getSwimmingType() {
		
		return this.S;
	}
	/**
	 * @return returns a list of the muscles targeted 
	 */
	@Override
	public Muscle[] muscleTargeted() {
		
		
		if (S==SwimmingType.Breaststroke){
			
			Muscle[] a= {Muscle.Glutes,Muscle.Cardio};
			return a;
		}
		else if(S==SwimmingType.Butterflystroke)
		{
			Muscle[] a = {Muscle.Abs,Muscle.Back,Muscle.Shoulders,Muscle.Biceps,Muscle.Triceps};
			return a;
		}
		else {
			Muscle[] a = {Muscle.Arms,Muscle.Legs,Muscle.Cardio};
			return a;
		}
		
	}
	/**
	 * @return returns the number needed for calorieLoss
	 */
	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		double intense;
		double cal;
		
		
		if (intensity == Intensity.HIGH) 
		{
			intense = 10.0;
		}
		else if (intensity==Intensity.MEDIUM) {
			intense= 8.3;
		}
		else {
			intense=6.0;
		}
		
		 cal = (intense*weight*(duration))/60.0;
		 
		return cal;
	}
	@Override
	/**
	 * @return the description of the class
	 */
	public String description() {
		
		return ("Swimming");
		}
	
	
	
	
	
	

}
