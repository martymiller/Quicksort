import java.util.*;
import com.sortcompare.SelectionSort.*;
import com.sortcompare.QuickSort.*;

public class SortCompare {
	
	public static void main( String [] args) {
		ArrayList<Integer> unsort = new ArrayList<>();
		unsort.add(3);
		unsort.add(2);
		unsort.add(1);
		SelectionSort.sort(unsort);

		System.out.println(unsort);
	}
}