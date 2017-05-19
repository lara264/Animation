/** 
 * This class creates a Timer for benchmarking code execution.
 *
 * Usage:
 *
 * 	Timer time = new Timer();
 *  time.start();
 *  [code to time]             
 *  time.stop();
 *  [untimed code]   
 *  time.start();
 *  [code to time]             
 *  time.stop();
 *  System.out.println(time);
 * 
 * Note: The stop() method does not reset the clock to 0. 
 *       It can be restarted and cumulative time is tracked.
 *       The reset() method can be used if cumulative time
 *		 is not needed.
 *
 * @author Jon Cooper
 * @version Oct 6 2007
 */

public class Timer 
{
	// instance variables
	private long nanoSeconds;
	private long startTime;
	private long stopTime;
	
	
	// constructor methods
	public void Timer()
	{
		nanoSeconds = 0;
	}


	// access methods
	public void start()
	{
		startTime = System.nanoTime();
	}

	
	public void stop()
	{
		stopTime = System.nanoTime();
		nanoSeconds += stopTime - startTime;
	}
	
	
	public void reset()
	{
		nanoSeconds = 0;
	}
	
	
	public long getNanoSeconds()
	{
		return nanoSeconds;
	}


	public long getSeconds()
	{
		return nanoSeconds/1000000000;
	}


	public String toString()
	{
		String hh, mm, ss, dec;
		long hours, minutes, seconds;
		
		seconds = getSeconds();
		
		hours = seconds / 3600;
		seconds %= 3600;
		minutes = seconds / 60;
		seconds %= 60;
		
		hh = "" + hours;
		
		if (minutes<10) mm = "0" + minutes;
		else mm = "" + minutes;
		
		if (seconds<10) ss = "0" + seconds;
		else ss = "" + seconds;
		
		dec = "." + (getNanoSeconds() % 1000000000 / 10000000);
			
		return hh + ":" + mm + ":" + ss + dec;
	}
	
}