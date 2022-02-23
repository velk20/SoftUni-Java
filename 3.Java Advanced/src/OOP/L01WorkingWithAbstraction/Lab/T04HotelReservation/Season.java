package OOP.L01WorkingWithAbstraction.Lab.T04HotelReservation;

public enum Season {
    Autumn,
    Spring,
    Winter,
    Summer;


    public int getIndexOfSeason(Season season) {

        switch (season) {
            case Autumn:
                return 1;
            case Spring:
                return 2;
            case Winter:
                return 3;
            case Summer:
                return 4;
            default:
                return 0;
        }
    }
}
