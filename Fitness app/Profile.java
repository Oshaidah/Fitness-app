package P3;

public class Profile {
	
	private int age;
	private double height;
	private double weight;
	private Gender gender;
	
	/**
	 * 
	 * @param age the age of the client
	 * @param height the height of the client
	 * @param weight the weight of the client
	 * @param gender the gender of the client
	 */
	public Profile(int age, double height, double weight, Gender gender)
	{
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.gender=gender;
		
	}
	/**
	 * Setter method of the height
	 * @param height of the client
	 * 
	 */
	public void setHeight(double height)
	{
		this.height=height;
		
	}
	/**
	 * setter method of the weight
	 * @param weight of the client
	 */
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
	/**
	 * setter method of the age
	 * @param age of the client
	 */
	public void setAge(int age)
	{
		this.age=age;
		
	}
	/**
	 * setter method of the client
	 * @param gender of the client 
	 */
	public void setGender(Gender gender)
	{
		this.gender=gender;
		
	}
	/**
	 * getter method of the height
	 * @return the height
	 */
	public double getHeight()
	{
		return height;
	}
	/**
	 * 
	 * @return the weight 
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * 
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 
	 * @return returns the gender
	 */
	public Gender getGender()
	{
		return gender;
		
	}
	/**
	 * @return returns a string of the all the information of the profile
	 */
	@Override 
	public String toString()
	{
		return "Age "+ age+", Weight "+weight+"kg, Height "+String.format("%.1f",height)+"m, Gender "+gender;
	}
	/**
	 * 
	 * @return returns the BMI of a person
	 */
	public double calcBMI()
	{
		double BMI=0.0;
		BMI=weight/(Math.pow(height,2));
		return BMI;
	}
	/**
	 * 
	 * @return returns the daily caloric intake 
	 */
	public double dailyCalorieIntake()
	{
		
		
		double Bmrm;
		double Bmrw;
		if (this.gender==Gender.MALE)
		{
			Bmrm= 66.47 + (13.75 * this.weight) + (5.003 * (this.height*100) ) - (6.755 * this.age);
			return Bmrm;
		}
		else {
			Bmrw= 655.1 + ( 9.563 * weight ) + ( 1.85 * (height*100)) - ( 4.676 * age );
			return Bmrw;
		}
		
	}

}
