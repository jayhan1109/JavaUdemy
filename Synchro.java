import java.util.Random;
/**
Lab Threading Part2

Purpose: 1. to examine locks via synchronized in more detail specifically WHY
		we may wish to use different locks on different methods
		2. to examine deadlocks and alternative methods to fix them
		
Description: 1. You are to fix the code to run the test twice, once with a single
			lock for both stocks and bonds, and once with different locks.
			NOTE: current code does NOT contain any locks
			NOTE: PUT YOUR LOCKS IN THE SAFEST LOCATION TO PROTECT STORES
			2. Using DeadlockingPhilosophers.java modify the code to fix the deadlocks.
			The solution you are to use involves using reentrant locks to test if both chopsticks
			are available and if not, drop any chopstick they had taken,
			sleep a random period of time and try again until successful. 
			
Marking Guide:

Mark will be added to your Threading Part1 from last week

Function							Mark
Adding Locks CORRECTLY				1
Same lock							1
Different lock						1
Philosopher solution				2
**************************************************************************/

public class Synchro {
	private static Random generate = new Random();
	private static final int NSTOCKS=20;
	private static final int NBONDS = 20;
	private static final int PURCHASE = 10;
	private static int stockIndex = 0;
	private static int bondIndex = 0;
	private static int[] stocks = new int[NSTOCKS];
	private static int[] bonds = new int[NBONDS];
	private static Object stockLock;//LOCK FOR STOCKS
	private static Object bondLock;//LOCK FOR BONDS
	private static boolean done = false;
	
	static boolean stockAvailable(){
			return stockIndex < NSTOCKS;
	}
	static boolean bondAvailable(){
			return bondIndex < NBONDS;
	}
	static boolean addStock(int s){
		if (stockAvailable()){
		
		stocks[stockIndex] = s;
		try{
			Thread.sleep(10);
		}catch(Exception e){}
		stockIndex++;
		
		return true;
		}
		return false;	
	}
	static boolean addBond(int b){	
		if (bondAvailable()){
		
		bonds[bondIndex] = b;
		try{
			Thread.sleep(5);
		}catch(Exception e){}
		bondIndex++;
		
		return true;
		}
		return false;	
	}
	private static Runnable createRun(){
		return new Runnable(){
			int i=0;
			boolean g;
			boolean g2;
			public void run(){
				while(!done){
					if (generate.nextInt(2) == 1){
						g=stockLock.tryLock();
						try{
							addStock(i++);
						}catch(Exception e){}
						finally{
							if(g){
								// release lock if we got it
								//System.out.println("unlock");
								stockLock.unlock();
							}
						}
					}
					else
					g2=bondLock.tryLock();
					try{
						addBond(i++);
					}catch(Exception e){}
					finally{
						if(g2){
							// release lock if we got it
								//System.out.println("unlock");
								bondLock.unlock();
						}
					}
				}
			}
		};
	}
	public static void printStock(){
		System.out.println("\nstocks");
		for(int s=0; s<stocks.length; s++)
			System.out.print(stocks[s]+" ");
	}
	public static void printBond(){
		System.out.println("\nbonds");
		for(int b=0; b< bonds.length; b++)
			System.out.print(bonds[b]+" ");
	}
	public static int countBonds(){
		int result = 0;
		for(int b=0; b< bonds.length; b++)
			if (bonds[b] != 0)
				result++;
		return result;
	}
	public static int countStocks(){
		int result = 0;
		for(int s=0; s< stocks.length; s++)
			if (stocks[s] != 0)
				result++;
		return result;
	}
	public static void test(Object lock1, Object lock2){
		try{
		//create 4 threads and run them
		Thread.sleep(100);//allow purchase for 100ms
		done = true;//stop threads gracefully
		printStock();
		printBond();
		System.out.println("\ntotal stocks purchased = "+countStocks());
		System.out.println("total bonds purchased = "+countBonds());
		done = false;//reset flag
		}catch(Exception e){}
	}
	public static void main(String[] args){
		System.out.println("using same lock for stocks and bonds");
		test(stockLock,stockLock);
		System.out.println("using different locks for stocks and bonds");
		test(stockLock,bondLock);
		
	}
}