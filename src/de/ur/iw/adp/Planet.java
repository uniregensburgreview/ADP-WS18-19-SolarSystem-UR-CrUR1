package de.ur.iw.adp;

public class Planet {
    private static int totalPlanets;
    private static int totalMoons;

    private String name;
    private int moons;
    private boolean isDwarfPlanet;
    private boolean hasRings;

    static {
        totalPlanets = getTotalPlanets();
        totalMoons = getTotalMoons();
    }

    public Planet() {
        this("", 0, false, false);
    }

    public Planet(String name, int moons, boolean isDwarfPlanet, boolean hasRings) {
        this.name = name;
        this.moons = moons;
        this.isDwarfPlanet = isDwarfPlanet;
        this.hasRings = hasRings;
        totalPlanets++;
        totalMoons += moons;
    }

    public static int getTotalPlanets() {
        return totalPlanets;
    }

    public static int getTotalMoons() {
        return totalMoons;
    }

    public String toText() {
        return ("Name: " + name + "\tMoons: " + moons + "\tDwarf: " + isDwarfPlanet + "\tRings: " + hasRings);
    }
}
