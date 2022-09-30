package P3;
/**
 * 
 * @author omaid Shaidah
 * 
 *
 */
public class WeeklyExercise {
	private Fitness[] exerciseList;
	private int days;
	double weeklyCalorieTarget;
	private Profile profile;
	private DailyExercise dd;
	
	/**
	 * 
	 * @param exerciseList a list of exercises
	 * @param days number of days planed to workout
	 * @param weeklyCalorieTarget the weekly calorie burned target
	 * @param profile the profile of the client in the app
	 */
	public WeeklyExercise(Fitness [ ]exerciseList, int days, double weeklyCalorieTarget, Profile profile)
	{
		
		this.exerciseList=exerciseList;
		this.days=days;
		this.weeklyCalorieTarget=weeklyCalorieTarget;
		this.profile=profile;
		
		
	}
	/**
	 * @
	 * @param exerciseList a list of exercises
	 * @param profile the profile of the client in the app
	 */
	public WeeklyExercise(Fitness[ ] exerciseList, Profile profile) 
	{
		this.exerciseList=exerciseList;
		this.profile=profile;
		this.days=7;
		this.weeklyCalorieTarget=3500;
		
	}
	/**
	 * 
	 * @param ex a new fitness workout to be added to the Fitness array
	 */
	public void addExercise(Fitness ex)
	{
		Fitness[] nlist=new Fitness[exerciseList.length+1];
		for(int i = 0;i<exerciseList.length;i++)
		{
			nlist[i]=exerciseList[i];
		}
		nlist[nlist.length-1]=ex;
		this.exerciseList=nlist;
	}
	/**
	 * 
	 * @param ex the workout to be removed from the list of arrays
	 */
	public void removeExercise(Fitness ex) {
		
		Fitness[] nc= new Fitness[exerciseList.length-1];
		
		
		for(int i=0;i<nc.length;i++)
		{
			if(ex!=exerciseList[i])
			{
				nc[i]=exerciseList[i];
			}
		}
	
	}
	/**
	 * 
	 * @param list sets a the inputed list to exerciseList
	 */
	public void setExerciseList(Fitness [ ] list)
	{
		this.exerciseList=list;
	}
	/**
	 * 
	 * @param days sets the number of days
	 */
	public void setDays(int days) 
	{
		this.days=days;
	}
	/**
	 * 
	 * @param target sets the weekly number of calories
	 */
	public void setWeeklyCalorieTarget(double target)
	{
		this.weeklyCalorieTarget=target;
	}
	/**
	 * 
	 * @param profile sets the profile
	 */
	public void setProfile(Profile profile)
	{
		this.profile=profile;
	}
	/**
	 * 
	 * @return returns a Fitness list
	 * a getter method
	 */
	public Fitness [] getExerciseList()
	{
		return this.exerciseList;
	}
	/**
	 * 
	 * @return the size of the exercise List
	 */
	public int getSize() 
	{
		return this.exerciseList.length;
	}
	/**
	 * 
	 * @return returns the numeber of days 
	 */
	public int getDays()
	{
		return this.days;
	}
	/**
	 * 
	 * @return the profile
	 */
	public Profile getProfile() 
	{
		return this.profile;
	}
	/**
	 * 
	 * @return returns the weekly Calorie Tareget
	 */
	public double getWeeklyCalorieTarget()
	{
		return this.weeklyCalorieTarget;
	}
	public DailyExercise [ ] getWeeklyExercises(Intensity intensity)
	{
		DailyExercise[] d=new DailyExercise[exerciseList.length];
		 for(int i= 0;i<exerciseList.length;i++)
		 {
			 Fitness[ ]fit = new Fitness[1];
			 fit[0]= exerciseList[i];
			 DailyExercise ddd = new DailyExercise(fit, i, weeklyCalorieTarget, profile);
			 int duration = ((int)((ddd.getCalorieTarget() / exerciseList[i].calorieLoss(intensity,this.profile.getWeight(),60)) * 60)); 
			 ddd.setDuration(duration);
			 d[i]=ddd;
		 }
		 
		return d;
		
	}
	public DailyExercise[] getWeeklyExercises() 
	
	{
		 DailyExercise[] d=new DailyExercise[exerciseList.length];
		 for(int i= 0;i<exerciseList.length;i++)
		 {
			 
			 Fitness[ ]fit = new Fitness[1];
			 fit[0]= exerciseList[i];
			 DailyExercise ddd = new DailyExercise(fit, i, weeklyCalorieTarget, profile);
			 int duration = (int)((ddd.getCalorieTarget() / exerciseList[i].calorieLoss(Intensity.LOW,this.profile.getWeight(),60)) * 60); 
			 ddd.setDuration(duration);
			 
			 d[i]=ddd;
		 }
		 
		return d;
	}
	/**
	 * 
	 * @param targetWeight the targeted weight to achieve
	 * @param withInDays the number of days to achive it in 
	 * @return returns a string of how much you need to lost to achieve the desired weight 
	 */
	public String targetedCalorieLoss(double targetWeight, int withInDays)
	{
		double cal;
		double totcal;
		double tarweight;
		String s;
		if (targetWeight>profile.getWeight())
		{
			return "Only works to lose weight";
		}
		else 
		{
			cal = ((profile.getWeight()-targetWeight)*7000)/withInDays;
			totcal=profile.dailyCalorieIntake()-cal;
			tarweight=profile.getWeight()-targetWeight;
			s= "You need to lose "+ String.format("%.2f",cal)+" calories per day or decrease your intake from "+String.format("%.2f", profile.dailyCalorieIntake())+" to "+ String.format("%.2f", totcal)+" in order to lose "+String.format("%.2f", tarweight)+" kg of weight";
			return s;
		}
	}
}
