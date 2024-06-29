package oop3.oop57;

public class NasaPictureInfo {
    public String title;
    public String date;
    public String explanation;
    public String fileUrl;
    public String mediaType;


    public NasaPictureInfo(String title,
                           String date,
                           String explanation,
                           String fileUrl,
                           String mediaType) {
        this.title = title;
        this.date = date;
        this.explanation = explanation;
        this.fileUrl = fileUrl;
        this.mediaType = mediaType;
    }

    @Override
    public String toString() {
        return this.mediaType + " : " + this.title + "(" + this.date + ")";
    }

    public String getPrettyExplanation() {
        return this.explanation.replaceAll(",", ",\n");
    }
}
