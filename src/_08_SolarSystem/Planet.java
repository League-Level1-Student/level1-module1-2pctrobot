package _08_SolarSystem;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class Planet {
    /*
     * Member variables
     */
    int x, y, width, height;
    int diameter;
    int aDFS;
    int oP;
    Color color;
    
    public Planet(int diameterPixels, Color color, int aDFS, int oP) {
        this.diameter = diameterPixels;
        this.color = color;
        this.aDFS = aDFS;
        this.oP = oP;
    }

    public void draw(Graphics g, int numDays) {
        /*
         * Local variables
         * Reassign or remove these after creating the correct member variables
         */
        int avgDistFromSun = aDFS / (numDays/40);     // You can choose a different scaling than divided by 10
        int orbitalPeriod = oP;

        
        /*
         * Update position
         */
        double angle = 2 * Math.PI * numDays / orbitalPeriod;
        x = (int)(Math.cos(angle) * avgDistFromSun);
        y = (int)(Math.sin(angle) * avgDistFromSun);
        
        /*
         * Draw orbit
         */
        g.setColor(color);
        g.drawOval(SolarSystem.CENTER_X - avgDistFromSun,
                   SolarSystem.CENTER_Y - avgDistFromSun,
                   2*avgDistFromSun, 2*avgDistFromSun);
        
        /*
         * Draw planet
         */
        int centerX = SolarSystem.CENTER_X + x;
        int centerY = SolarSystem.CENTER_Y + y;
        g.setColor(color);
       double scalingDiameter = numDays/1500.0;
       	if(scalingDiameter < 1)
       		scalingDiameter = 1;
       	double scalingOval = (diameter/2) - ((diameter/2)/scalingDiameter);
        g.fillOval(centerX -(diameter/2)+(int)scalingOval, centerY - (diameter/2) + (int)scalingOval, (int)((double)diameter/scalingDiameter), (int)((double)diameter/scalingDiameter));
        
        /*
         * Draw moons, if any
         */
        for( int i = 0; i < moons.size(); i++ ) {
            Moon moon = moons.get(i);
            int moonDist = (int) (2 * moon.distPlanetToMoon / scalingDiameter);
            double moonOval = (moon.distPlanetToMoon) - ((moon.distPlanetToMoon)/scalingDiameter);
            if( i == 0 ) {
                g.drawOval(centerX - moon.distPlanetToMoon+(int)moonOval, centerY - moon.distPlanetToMoon+(int)moonOval,
                           moonDist, moonDist);
            }

            moon.draw(g, numDays, centerX, centerY, moonDist, moonOval);
        }
    }
    
    
    ArrayList<Moon> moons = new ArrayList<>();
    
    public void addMoon() {
        moons.add(new Moon());
    }
    
    class Moon {
        Color moonColor;
        int numMoons, moonDiameter, distPlanetToMoon, moonDaysToOrbit, daysOffset;
        
        public Moon() {
            Random rand = new Random();
            this.moonColor = Color.WHITE;
            this.moonDiameter = 10;
            this.distPlanetToMoon = (diameter/2) + 10;
            this.moonDaysToOrbit = 50;                 // arbitrarily chosen
            this.daysOffset = rand.nextInt(365);
        }
        
        public void draw(Graphics g, int days, int planetX, int planetY, double moonDist, double moonOval) {
            int numDays = daysOffset + days;
            double angle = 2 * Math.PI * numDays / moonDaysToOrbit;
            int moonX = (int)(Math.cos(angle) * moonDist/2);
            int moonY = (int)(Math.sin(angle) * moonDist/2);
            moonOval = moonOval/15.0;
            System.out.println(moonOval + " " + moonDist);
            if(moonOval < 1)
           		moonOval = 1;
            g.setColor(moonColor);
            g.fillOval(planetX - (moonDiameter/2) + moonX + (int)moonOval, planetY - (moonDiameter/2) + moonY + (int)moonOval, (int)((double)moonDiameter/moonOval), (int)((double)moonDiameter/moonOval));
        }
    }
}
