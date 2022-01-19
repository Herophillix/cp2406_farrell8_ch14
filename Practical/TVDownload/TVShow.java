package TVDownload;

public class TVShow {
    private String name;
    private String synopsis;

    public TVShow(String name, String synopsis) {
        SetName(name);
        SetSynopsis(synopsis);
    }

    public String GetName() {
        return name;
    }
    public String GetSynopsis() {
        return synopsis;
    }

    public void SetName(String name) {
        this.name = name;
    }
    public void SetSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}