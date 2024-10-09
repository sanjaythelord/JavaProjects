package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		//creating array
		String[] array={"Java","Python","PHP","C++"};  
		//System.out.println("Printing Array: "+Arrays.toString(array));
		for(String s : array){
			System.out.println(s);
		}
		
		//Converting Array to List  
		List<String> list=new ArrayList<String>();  
		for(String language:array){  
		list.add(language);  
		}  
		System.out.println("Printing List: "+list);  
		
	}

}
