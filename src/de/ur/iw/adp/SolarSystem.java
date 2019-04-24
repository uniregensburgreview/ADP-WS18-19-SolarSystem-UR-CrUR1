package de.ur.iw.adp;

public class SolarSystem {

    private static final int MAX_PLANETS = 9;
    private Planet[] planets;

    public SolarSystem() {
        planets = new Planet[MAX_PLANETS];
        createPlanets();
    }

    public Planet[] getPlanets() {
        return planets;
    }

    private void createPlanets() {
        definePlanet(0, new Planet("Mercury", 0, false, false));
        definePlanet(1, new Planet("Venus", 0, false, false));
        definePlanet(2, new Planet("Earth", 1, false, false));
        definePlanet(3, new Planet("Mars", 2, false, false));
        definePlanet(4, new Planet("Jupiter", 67, false, true));
        definePlanet(5, new Planet("Saturn", 62, false, true));
        definePlanet(6, new Planet("Uranus", 27, false, true));
        definePlanet(7, new Planet("Neptune", 14, false, true));
        definePlanet(8, new Planet("Pluto", 5, true, false));
    }

    private void definePlanet(int x, Planet planet) {
        planets[x] = planet;
    }
}