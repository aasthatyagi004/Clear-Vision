import java.util.Scanner;

public class ClearVision {

	public static void main(String[] args) {
		/* this part of the program will take in the 
		 * input from the hardware about the intensity of the light
		 * which will correlate to the amount of glare 
		 */
		
		
		/*
		 * THRESHOLD is equal to the average intensity of low beam (700
		 * lumens) and high beam (upto 1200 lumens).
		 */
		final int THRESHOLD = 950;
	
		/*
		 * takeAction will be altered according to the result from the h2ardware 
		 * (circuit board) 
		 */
		boolean takeAction;
		
		/*
		 * ~glareDetected is the intensity that will be read through the hardware
		 * that detects the intensity of the glare coming from an on coming 
		 * car
		 * ~initialize glareDetected to any value to test this 
		 */
		System.out.println("Enter the intensity you will like to try:");
		Scanner userInputGlare = new Scanner (System.in);
		int glareDetected = userInputGlare.nextInt();
		if (glareDetected < 0)
		{
			System.out.println("This is an invalid number");
			return;
		}
		
		if (glareDetected > THRESHOLD)
		{
			System.out.println("The intensity is passing the threshold.");
			/*
			 * if the glareDetected > THRESHOLD then:
			 * ~the windshield will tint 
			 * ~HUD will be used to highlight obstacles
			 */
			takeAction = true;
			tintWindshield (takeAction);
			highlightObstacle (takeAction);
			 
		}
		else 
		{
			System.out.println("This is a safe range. No action will be needed.");

		}
	}





public static void tintWindshield (boolean glareResult)
{
	if (glareResult == true)
	{
		System.out.println("The windshield will be tinted.");
		System.out.println("Please look at the circuit build for example");
		System.out.println();
	}
	else 
	{
		System.out.println("There will be no action taken at this point");
		System.out.println();
	}
}

public static void highlightObstacle (boolean glareResult)
{
	if (glareResult == true)
	{
		System.out.println("The obstalces will be highlighted.");
		System.out.println("Please look at the real-life simulator for example.");
		System.out.println();
	}
	else 
	{
		System.out.println("There will be no action taken at this point");
		System.out.println();
	}
}

}