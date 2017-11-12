package com.example.asadaboomtham.newsnweatherapplication;

/**
 * Created by asada boomtham on 27/9/2560.
 */
//Data Object
public class ListItem {

    private String head;
    private String desc;
    private String imageUrl;
    private String ref;
    private String link;


    //constructer
    public ListItem(String head, String desc, String ref, String imageUrl ,String link) {
        this.head = head;
        this.desc = desc;
        this.ref = ref;
        this.imageUrl = imageUrl;
        this.link = link;
    }

    //getter
    public String getHead() {

        return head;
    }

    public String getDesc() {

        return desc;
    }

    public String getRef() {

        return ref;
    }

    public String getImageUrl() {

        return imageUrl;
    }

    public String getLink() {

        return link;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
