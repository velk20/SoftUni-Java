package OOP.L01WorkingWithAbstraction.Lab.T04HotelReservation;

public class PriceCalculator {


    public String getTotalPrice(double pricePerDay, int numberOfDays, Season season, Discount discount) {
        double priceForOneNightForTheSeason = pricePerDay * season.getIndexOfSeason(season);
        return String.format("%.2f",priceForOneNightForTheSeason * numberOfDays * (100 - discount.getDiscount()) / 100.0);

    }
}
