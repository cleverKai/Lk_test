package No1;
import java.io.BufferedReader;
import java.io.FileReader;
/**
*
* @author xueliang
*/

public class ReadFile{
	public static int add(){
		int lines = 0;
		int words = 0;
		try {
			FileReader reader = new FileReader("data/world.txt");
			BufferedReader br = new BufferedReader(reader);
			String temp;
			while ((temp = br.readLine())!=null){
				lines++;
				String[] split = temp.split(" ");
				words += split.length;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return words;
	}
	public static int ad(){
		int lines = 0;
		try {
			FileReader reader = new FileReader("data/world.txt");
			BufferedReader br = new BufferedReader(reader);
			String temp;
			while ((temp = br.readLine())!=null){
				lines++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lines;
	}
	public static void main(String[] args){
		System.out.println("单词数"+add());
		System.out.println("行数"+ad());
		
	}
}
/*public class ReadFile {
public static int add() {
int lines = 0 ;
int words = 0;
try {
FileReader reader = new FileReader("data/world.txt");
BufferedReader br = new BufferedReader(reader);
String temp;
while ((temp = br.readLine())!=null) {
lines++;
String[] split = temp.split(" ");
words += split.length;
}
} catch (Exception e) {
e.printStackTrace();
}
return words;
}
System.out.println("单词数"+words);

}*/