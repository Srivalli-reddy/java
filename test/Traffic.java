package test;

 class Traffic {
	 String color;
	 int duration;
	 public Traffic(String color,int duration)
	 {
		 this.color=color;
		 this.duration=duration;
	 }
	 public static void main(String[]args)
	 {
		 Traffic light=new Traffic("red",10);
		 System.out.println("is it red : "+light.color.equals("red"));
		 System.out.println("is it yellow : "+light.color.equals("yellow"));
		 System.out.println("Duration : "+light.duration+"seconds");
		 light.duration=60;
		 System.out.println("New time : "+light.duration+"seconds");
	 }

}
