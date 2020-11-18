
public class Assign {
         int t(int x,int y) {
        	 if(y<=1)
        		 return 0;
        	 if(x==y) 
        		 return y;
        	 else 
        		 return x+t(x,y-1);
         }
}
