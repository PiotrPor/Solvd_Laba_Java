package com.solvd.library;

public enum LiteratureGenre {
    HISTORY,
    BIOGRAPHY,
    CRIME,
    ROMANCE,
    ACTION,
    SCIFI,
    HORROR,
    FAIRYTALE,
    ADVENTURE,
    OTHER;
    
    @Override
    public String toString() {
        switch (this) {
            case HISTORY:
                return "History";
            case BIOGRAPHY:
                return "Biography";
            case CRIME:
                return "Crime";
            case ROMANCE:
                return "Romance";
            case ACTION:
                return "Action";
            case SCIFI:
                return "Science Fiction";
            case HORROR:
                return "Horror";
            case FAIRYTALE:
                return "Fairytale";
            case ADVENTURE:
                return "Adventure";
            case OTHER:
                return "Other genre";
            default:
                return "Other genre";
        }
    }
}
