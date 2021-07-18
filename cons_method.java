class area 
    {
        int width;
        int length;
        int volume;
        int height;
        area() 
        {
           width=5;
           length=6;
        }
        void volume() 
        {
             volume = width*length*height;
        } 
    }    
    class cons_method 
    {
        public static void main(String args[])
        {
            area obj = new area();
            obj.volume();
            System.out.println(obj.volume);        
        } 
    }