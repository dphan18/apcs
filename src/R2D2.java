  import java.lang.Math;
   public class R2D2 extends Droid
    {
   private int x,y,z;

       public R2D2()
       {
           x=0;
           y=0;
           z=0;
       }

       public void move()
       {
           x+=(int)Math.round(100*Math.random());
           y+=(int)Math.round(100*Math.random());
           z+=(int)Math.round(100*Math.random());
        }

        public void speak()
        {
            System.out.println("beep Beep Beep beep");
        }


		void fight() {
			x+=2;
			y+=2;
			z+=2;
			System.out.println("Bam");
			
		}
    }