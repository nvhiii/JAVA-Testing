public class PlayListEntry {

    private String title = "";
    private String artist = "";
    private int playCount = 0;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getPlayCount() {
        return playCount;
    }

}
