package Serialization;
 class Bike extends Thread{
	public void run() {
		System.out.println("Bike Analyzing "+Thread.currentThread().getName());
		//System.out.println("Bike Buying"+Thread.currentThread().getId());
		//System.out.println("Bike Selling"+Thread.currentThread().getId());
	
	}
}
public class MultiThreadConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bikeCount=2;
		for(int i=0;i<bikeCount;i++) {
//			THREAD ONE...
			Bike b=new Bike();
//			THREADTWO...
			Bike bOne=new Bike();
//			THREADTHREE...
			Bike bTwo=new Bike();
//			SETNAME...
			b.setName("Bike");
			bOne.setName("BikeOne");
//			EXECUTE THE RESOURCE ...
			b.start();
			bOne.start();
//			GIVE PRIORITY FOR THIRD THREAD...
			bTwo.setPriority(Thread.MAX_PRIORITY);
			System.out.println(bTwo.getPriority());
			try {
				if(i==1) {
//					USING SLEEP..
					b.sleep(2000);
				}
			}
			catch(InterruptedException e) {
				
			}
			try {
//				USING JOIN....
				b.join();
				bOne.join();
			}catch(Exception e){
				
			}
//			AFTER THE JOIN PROCESS IT CAN EXECUTE .....
			System.out.println("Bike shop");
		}
	}

}
