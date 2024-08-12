package arraylist;

public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList() {
   		
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */                                     				  		  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }
	  
	  public boolean addItem(T item) {
	        if (currentItem < arList.length) {
	            arList[currentItem++] = item;
	            return true;
	        }
	        return false;
	  		}
	  
	  @Override
	  public String toString() {
	      	StringBuilder sb = new StringBuilder();
	         sb.append("[");
	         for (int i = 0; i < currentItem; i++) {
	                if (i > 0) {
	                    sb.append(", ");
	                }
	                sb.append(arList[i].toString());
	            }
	            sb.append("]");
	            return sb.toString();
	        
    }//end preferred constructor
	
}//end class
