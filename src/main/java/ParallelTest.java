import java.io.IOException;

public class ParallelTest {

	public static void main(String[] args ) throws IOException{
		
		
		for( int i=0;i<10;i++){
			final int current=i;
			Thread t=new Thread(new Runnable() {
				
				public void run() {
					// TODO Auto-generated method stub
					try {
						System.out.println(String.format("Starting test %s ",current));
						runTest();
						System.out.println(String.format("Finishing test %s ",current));
							
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});

			t.start();
			
			
		}
		
		System.in.read();
		
		
		
		
	}
	
	public static void  runTest() throws Exception{
		
		TestSetup1 test=new TestSetup1();
		
		test.setUp();
		test.testUntitled();
		test.tearDown();
		
	}
}
