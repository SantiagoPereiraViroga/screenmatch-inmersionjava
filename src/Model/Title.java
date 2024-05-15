package Model;

public class Title {

    private String name;

    private int releaseDate;

    private double rating;

    private boolean includedInBasicPlan;

    private String synopsis;

    private int runtime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isIncludedInBasicPlan() {
        return includedInBasicPlan;
    }

    public void setIncludedInBasicPlan(boolean includedInBasicPlan) {
        this.includedInBasicPlan = includedInBasicPlan;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void showDataSheet() {

        System.out.println("*** MOVIE DETAILS ***\n");
        System.out.println("Name of the title: " + name);
        System.out.println("Release date: " + releaseDate);
        System.out.println("Runtime: " + getRuntime() + " minutes\n");

    }
}
