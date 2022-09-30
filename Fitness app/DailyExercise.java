package P3;

public class DailyExercise  {

	private Fitness[] exerciseList;
	private int duration;
	private double calorieTarget;
	private Profile profile;
	/**
	 * 
	 * @param exerciseList the list of exercises
	 * @param duration the duration of the workout
	 * @param calorieTarget the calorie target for the workout
	 * @param profile the profile of the person
	 */ 
	public DailyExercise(Fitness [] exerciseList, int duration, double calorieTarget, Profile profile)
	{
		
		this.exerciseList=exerciseList;
		this.duration=duration;
		this.calorieTarget=calorieTarget;
		this.profile=profile;
		
	}
	public DailyExercise(Fitness[] exerciseList, Profile profile) 
	{
		this.exerciseList=exerciseList;
		this.profile=profile;
		this.duration=60;
		this.calorieTarget=500;
		
	}
	/**
	 * 
	 * @return gets the size of the exercsie list
	 */
	public int getSize()
	{
		return this.exerciseList.length;
	}
	/**
	 * 
	 * @param ex adds the new exercise to the list
	 */
	public void addExercise(Fitness ex)
	{
		Fitness[] nlist =new Fitness[exerciseList.length+1];
		
		
		for(int i = 0;i<exerciseList.length;i++)
		{
			nlist[i]=exerciseList[i];
			
		}
		nlist[nlist.length-1]=ex;
		this.exerciseList=nlist;
		

		
		
	}
	/**
	 * 
	 * @param ex removes the intended exercsie from the list
	 */
	public void removeExercise(Fitness ex)
	{
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
	 * @param list sets the given list 
	 */
	public void setExerciseList(Fitness[] list)
	{
		this.exerciseList=list;
		
	}
	/**
	 * 
	 * @param duration sets the duration
	 */
	public void setDuration(int duration)
	{
		this.duration=duration;
		
	}
	/**
	 * 
	 * @param target sets the target calorie
	 */
	public void setCalorieTarget(double target) 
	{
		this.calorieTarget=target;
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
	 * @return returns the list of exercises
	 */
	public Fitness[ ] getExerciseList( )
	{
		return exerciseList;
		
	}
	/**
	 * 
	 * @return gets the duration
	 */
	public int getDuration()
	{
		return this.duration;
		
	}
	/**
	 * 
	 * @return gets the calorie target
	 */
	public double getCalorieTarget()
	{
		return this.calorieTarget;
	}
	public Profile getProfile()
	{
		return this.profile;
	}
	public Fitness[] getExercises(Muscle[] targetMuscle)
	{
	/*	
	 * use double for loop to check if the excersie hits that muscle group
	 * then add to new fitness array and return that
	 * create an object of ex taichi then call msucleTargeted and check if its the same as the given then add taichi to the newList
	 * 
	 */
		Fitness[]nl = new Fitness[exerciseList.length];
		TaiChi t= new TaiChi();
		Cycling c = new Cycling();
		Squat s = new Squat();
		Swimming swim = new Swimming();
		Plyometrics p = new Plyometrics();
		PullUp pull = new PullUp();
		Yoga y = new Yoga();
		WeightLifting w = new WeightLifting();
		
		
		if(exerciseList.length==0)
		{
			return null;
		}
		
		else {
			
			for (int i=0;i<exerciseList.length;i++)
			{
				for(int x=0;x<targetMuscle.length;x++)
				{
					
					if(t.muscleTargeted()[x].equals(targetMuscle[x]))
					{
						
						nl[i]=exerciseList[i] ;
						break;
					}
					
						
					else if(c.muscleTargeted()[x].equals(targetMuscle[x]))
					{
							
						nl[i]=exerciseList[i] ;
						break;
					}
						
					else if(s.muscleTargeted()[x].equals(targetMuscle[x]))
					{
						
						nl[i]=exerciseList[i] ;
						break;
					}
					else if(swim.muscleTargeted()[x].equals(targetMuscle[x]))
					{
						
						nl[i]=exerciseList[i] ;
						break;
					}
					else if(p.muscleTargeted()[x].equals(targetMuscle[x]))
					{
						
						nl[i]=exerciseList[i] ;
						break;
					}
					else if(pull.muscleTargeted()[x].equals(targetMuscle[x]))
					{
						
						nl[i]=exerciseList[i] ;
						break;
					}
					else if(y.muscleTargeted()[x].equals(targetMuscle[x]))
					{
						
						nl[i]=exerciseList[i] ;
						break;
					}
					else 
					{
						
						nl[i]=exerciseList[i] ;
						break;
					}
					
				}
			}
		}
		
			
			
		
		
		return nl;
	}
	
	

}
