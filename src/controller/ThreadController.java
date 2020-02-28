package controller;

import javax.swing.JOptionPane;

public class ThreadController extends Thread{
	int a,b,c;
	public ThreadController(int a, int b, int c,int[] vt1,int[] vt2) {
		this.a=a;
		this.b=b;
		this.c=c;
		
	}

	@Override
	public void run() {
		escolhaTemp(a);
		Temperatura(vt1);
		
	}

	private void escolhaTemp(int op) {
		op=(int)(Math.random()*3+1);
		
		switch(op) {
		case 1:
			convertK();
			break;
		case 2:
			convertF();
			break;
		default:
			break;
		}
	}

	private void convertC() {
		// TODO Auto-generated method stub
		
	}

	private void convertF() {
		// TODO Auto-generated method stub
		
	}

	private void convertK() {
		// TODO Auto-generated method stub
		
	}
}
