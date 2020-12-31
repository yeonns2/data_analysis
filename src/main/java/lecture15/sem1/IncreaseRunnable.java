package lecture15.sem1;

public class IncreaseRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i< 10000 ; i++)
			try {
				App.sem.acquire();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			// 임계영역의 시작 
			App.count++;
			// 임계영역의 종료 
			App.sem.release();  
	}

}
