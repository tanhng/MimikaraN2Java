import java.io.*; 
//import java.lang.*; 
import java.util.*; 
//import java.util.ArrayList;
//import java.util.List;
public class readfile {
	private Scanner x;
	
    public static word[] addX(int n, word arr[], String x) 
    { 
        word newarr[] = new word[n + 1]; 
        word temp=new word();
        temp.setYomikata(x);
        System.arraycopy(arr, 0, newarr, 0, arr.length);
        newarr[n] = temp;         
        return newarr; 
    } 
	
   
    
    
	public void openFile() {
		try {
			x=new Scanner(new File("F:\\oolt\\MimiJava\\src\\bai1yomi.txt"));
		}
		catch(Exception e) {
			System.out.println("Can not read file");
		}
	}
	
	public word[] readFile(word[] list) {
		while(x.hasNext()) {
			list=addX(list.length,list,x.next());
		}
		int i;
		for (i=0;i<list.length;i++) {
			System.out.println("hey "+list[i].getYomikata());
		}
		return list;
	}
	
	public void closeFile() {
		x.close();
	}
}
