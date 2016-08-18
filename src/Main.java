import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TernarySearchTree TSTTree=new TernarySearchTree();
		String path="dictionary.txt";
		try {
			Scanner scanner=new Scanner(new File(path));
			while(scanner.hasNextLine()){
				//System.out.println(scanner.nextLine());
				TSTTree.insert(scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner cin=new Scanner(System.in);
		while(true){
			String word=cin.nextLine();
			if(TernarySearchTree.search(word)){
				System.out.println("Spelling is right");
			}
			else{
				System.out.println(word);
				List<String> suggestions=new Checker().edit1(word);
				System.out.println("Suggestions are : "+suggestions);
			}
		}
	}
}
