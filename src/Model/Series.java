package Model;

public class Series extends Title {

    private int seasons;

    private int episodesPerSeason;

    private int runtimePerEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getRuntimePerEpisode() {
        return runtimePerEpisode;
    }

    public void setRuntimePerEpisode(int runtimePerEpisode) {
        this.runtimePerEpisode = runtimePerEpisode;
    }

    @Override
    public int getRuntime() {
        return runtimePerEpisode * episodesPerSeason * seasons;
    }

    @Override
    public void showDataSheet() {
        System.out.println("*** SERIES DETAILS ***\n");
        System.out.println("Name of the title: " + getName());
        System.out.println("Release date: " + getReleaseDate());
        System.out.println("Total runtime: " + getRuntime() + " minutes\n");
    }
}