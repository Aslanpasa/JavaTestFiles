public class TeacherSineWave {
    public static void main(String[] args) {
        int x=0, y=0, width = 122, height = 20;
        String message = "Hello";
        double fy;
        int frame = 0, totalFrames = 100;
        y=0;
        while (y <height) {
            x=0;
            while (x <width) {
                fy = (float)(Math.sin(x*0.01745329 * 10) * (height/2)+(height/2));
                if (y == fy) 
                    {System.out.print(message.charAt(x%message.length()));}
                else 
                    {System.out.print(" ");}
                x++;
            }
            System.out.println();
            y++;

        }
        frame++;


    }


}