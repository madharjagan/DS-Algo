package me.learning.corejava.basics;

import java.util.Comparator;
import java.util.Date;

//https://medium.com/omarelgabrys-blog/comparing-objects-307400115f88

public class File implements Comparable<File>{
	
	public static final Comparator<File> BY_DATE = new ByDate();
    public static final Comparator<File> BY_SIZE = new BySize();
	
	private static class BySize implements Comparator<File> {

		@Override
		public int compare(File o1, File o2) {
			if(o1.size > o2.size) {
				return 1;
			} else if(o1.size < o2.size) {
				return -1;				
			} else {
				return 0;
			}
			
		}
		
	}
	
	private static class ByDate implements Comparator<File> {

		@Override
		public int compare(File o1, File o2) {
			return o1.date.compareTo(o2.date);
		}
		
	}
	
    public String path;
    public Date date;
    public String type;
    public int size;
    
    public File(String path, int size) {
    	this.path = path;
    	this.size = size;
    }
    
	@Override
	public int compareTo(File that) {
		return this.path.compareTo(that.path);
	}

}
