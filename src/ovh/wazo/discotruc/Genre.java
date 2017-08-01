package ovh.wazo.discotruc;

/**
 * <br>
 * Author : <a href="https://git-01.dev.uhcwork.net/u/Rapace">Wazo</a><br>
 * Project discotruc
 * <br>
 */
public enum Genre {
    METAL("Metal"),
    POP("popculture"),
    ELECTRO("popculture"),
    BOUSIN("C'est juste de la merde.");


    private String style;

    Genre(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "style='" + style + '\'' +
                '}';
    }
}
