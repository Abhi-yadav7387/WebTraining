 class Box1
 {
            int h,w,d;
            Box1(int wid,int hei,int dep)
            {
            	this.w=wid;
            	this.h=hei;
            	this.d=dep;
            	
            }
           int vol()
            {
            	return w*h*d;
            	
            }
}
    class Box1Main
    {
    	
	public static void main(String[] args)
	{
		Box1 b1=new Box1(10,20,30);
		System.out.println(b1.vol());
		
	}
}
	