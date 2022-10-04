package sortingsearching;

public class SortComparatorLab06 {

	public static void main(String args[]) {
		
		Integer[] a = new Integer[128];
		for(int k = 0;k < 128;k++) {
			a[k] = (int) (Math.random() * 100000);
		}
		
		Integer[] b = new Integer[128];
		for(int k = 0;k < 128;k++) {
			b[k] = a[k];
		}
		
		GenericSortingMethods.mergeSort(a);
		GenericSortingMethods.quickSort(b);
		
		System.out.println("\n");
		
		Integer[] d = new Integer[512];
		for(int i = 0;i < 512;i++) {
			d[i] = (int) (Math.random() * 100000);
		}
		
		Integer[] e = new Integer[512];
		for(int i = 0;i < 512;i++) {
			e[i] = d[i];
		}
		
		GenericSortingMethods.mergeSort(d);
		GenericSortingMethods.quickSort(e);
		
		System.out.println("\n");
		
		Integer[] g = new Integer[2048];
		for(int i = 0;i < 2048;i++) {
			g[i] = (int) (Math.random() * 100000);
		}
		
		Integer[] h = new Integer[2048];
		for(int i = 0;i < 2048;i++) {
			h[i] = g[i];
		}
		
		GenericSortingMethods.mergeSort(g);
		GenericSortingMethods.quickSort(h);
		
		System.out.println("\n");
		
		Integer[] j = new Integer[8192];
		for(int i = 0;i < 8192;i++) {
			j[i] = (int) (Math.random() * 100000);
		}
		
		Integer[] k = new Integer[8192];
		for(int i = 0;i < 8192;i++) {
			k[i] = j[i];
		}
		
		
		GenericSortingMethods.mergeSort(j);
		GenericSortingMethods.quickSort(k);
		
		
	}
	
}
