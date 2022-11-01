public class CallEventClass {
    private long fromMSISDN;
    private long toMSISDN;
    private double callDuration;
    private String fromNetwork;
    private String toNetwork;

    public long getFromMSISDN() {
        return fromMSISDN;
    }

    public void setFromMSISDN(long fromMSISDN) {
        this.fromMSISDN = fromMSISDN;
    }

    public long getToMSISDN() {
        return toMSISDN;
    }

    public void setToMSISDN(long toMSISDN) {
        this.toMSISDN = toMSISDN;
    }

    public double getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(double callDuration) {
        this.callDuration = callDuration;
    }

    public String getFromNetwork() {
        return fromNetwork;
    }

    public void setFromNetwork(String fromNetwork) {
        this.fromNetwork = fromNetwork;
    }

    public String getToNetwork() {
        return toNetwork;
    }

    public void setToNetwork(String toNetwork) {
        this.toNetwork = toNetwork;
    }
}
