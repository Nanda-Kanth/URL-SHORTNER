package UrlShorteningProject.model;

public class UrlDto
{
    private String url;
    private String expirationDate;  //optional

    public UrlDto(String url, String expirationDate) {
        this.url = url;
        this.expirationDate = expirationDate;
    }

    public UrlDto() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "UrlDto{" +
                "url='" + url + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
