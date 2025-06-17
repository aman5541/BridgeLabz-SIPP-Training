package Day1_programmingElements;
public class VolumeofEarth {
    public static void main (String[] args){
        int radius = 6378 ;
        double pi = 3.14;
       double Volume_of_Earth =( 4/3) * pi * Math.pow (radius,3) ;
       System.out.println(Volume_of_Earth ); 
       double radius_in_miles= radius /1.6;
       double volume_in_miles =( 4/3) * pi * Math.pow (radius_in_miles,3) ;
       System.out.println("Volume_of_Earth in mile " +volume_in_miles);

    }
    
}
