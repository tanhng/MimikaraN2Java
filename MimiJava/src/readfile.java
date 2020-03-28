import java.io.*; 
//import java.lang.*; 
import java.util.*; 
//import java.util.ArrayList;
//import java.util.List;
public class readfile {
	private Scanner x;
	private Scanner y;
    public static word[] addX(int n, word arr[], String x) 
    { 
        word newarr[] = new word[n + 1]; 
        word temp=new word();
        temp.setYomikata(x);
        System.arraycopy(arr, 0, newarr, 0, arr.length);
        newarr[n] = temp;         
        return newarr; 
    } 
	
   
    public static void addY(int n, word arr[], String x) 
    { 
//        int i;
//        for(i=0;i<n;i++) {
//        	arr[i].setImi(x);
//        }
//        return arr;
    	arr[n].setImi(x);
    } 
    
	public void openFile(int dainanka) {
		try {
			System.out.println("bai "+dainanka);
			String a=String.format("F:\\oolt\\MimiJava\\src\\bai%dyomi.txt", dainanka);
			System.out.println(a);
			String b=String.format("F:\\oolt\\MimiJava\\src\\bai%dimi.txt", dainanka);
			x=new Scanner(new File(a) );
			y=new Scanner(new File(b));
		}
		catch(Exception e) {
			System.out.println("Can not read file");
		}
	}
	
	public word[] readFile(word[] list) {
		while(x.hasNext()) {
			list=addX(list.length,list,x.next());
		}
		int count=0;
		while(y.hasNext()) {
			addY(count,list,y.nextLine());
			count++;
		}
//		int i;
//		for (i=0;i<list.length;i++) {
//			System.out.println("hey "+list[i].getYomikata()+" "+list[i].getImi());
//			
//		}
		return list;
	}
	
	public void closeFile() {
		x.close();
	}
}
