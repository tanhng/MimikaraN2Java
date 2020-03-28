//import java.io.*; 
//import java.lang.*; 
//import java.util.*; 
//import java.util.ArrayList;
//import java.util.List;
public class MimiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readfile x=new readfile();
		word[] list=new word[0];
		x.openFile();
		list=x.readFile(list);
		x.closeFile();
//		int j;
//		for(j=0;j<list.length;j++) {
//			System.out.println("test backend"+list[j].getYomikata());
//		}
	}
}
