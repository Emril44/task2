public class Worker extends Thread {

	private int id;
	private Data data;
	
	public Worker(int id, Data d){
		this.id = id;
		data = d;
		this.start();
	}
	
	@Override
	public void run(){
		super.run();
		for (int i=0;i<5;i++){
			if(id==1) {
                try {
                    data.Tic();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
			else if(id==2){
                try {
                    data.Tac();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
			else if(id==3){
				try {
					data.Toe();
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
}
