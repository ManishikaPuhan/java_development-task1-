public class Reservation {
    private String trainNumber;
    private String trainName;
    private String classType;
    private String dateOfJourney;
    private String from;
    private String to;
    private String pnrNumber;

    public Reservation(String trainNumber, String trainName, String classType, String dateOfJourney, String from,
            String to) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.classType = classType;
        this.dateOfJourney = dateOfJourney;
        this.from = from;
        this.to = to;
        this.pnrNumber = generatePNR();
    }

    private String generatePNR() {
        return "PNR" + (int) (Math.random() * 10000);
    }

    public String getPNRNumber() {
        return pnrNumber;
    }

    @Override
    public String toString() {
        return "Train: " + trainName + ", Train Number: " + trainNumber + ", Class: " + classType +
                ", Date: " + dateOfJourney + ", From: " + from + ", To: " + to + ", PNR: " + pnrNumber;
    }
}
