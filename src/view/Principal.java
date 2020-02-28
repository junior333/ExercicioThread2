package view;

import controller.ThreadController;

public class Principal {

	public static void main(String[] args) {
		int a,b,c;
		int td;
		int []vt1=new int[10];
		int []vt2=new int[10];
		
		for(td=0;td<10;td++) {
			Thread th=new ThreadController(a,b,c,vt1,vt2);
				
			th.start();
			}
		}
	}

}
