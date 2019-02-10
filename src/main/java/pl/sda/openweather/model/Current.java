package pl.sda.openweather.model;

public class Current {

    private Condition condition;
    private long last_updated_epoch;
    private String last_updated;
    private double temp_c;
    private double temp_f;
    private int is_day;
    private double wind_mph;
    private double wind_kph;
    private int wind_degree;
    private String wind_dir;
    private int pressure_mb;
    private double pressure_in;
    private int precip_mm;
    private int precip_in;
    private int humidity;
    private int cloud;
    private double feelslike_c;
    private double feelslike_f;
    private int vis_km;
    private int vis_miles;
    private int uv;

    public Current() {
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public long getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public void setLast_updated_epoch(long last_updated_epoch) {
        this.last_updated_epoch = last_updated_epoch;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public double getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(double temp_c) {
        this.temp_c = temp_c;
    }

    public double getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(double temp_f) {
        this.temp_f = temp_f;
    }

    public int getIs_day() {
        return is_day;
    }

    public void setIs_day(int is_day) {
        this.is_day = is_day;
    }

    public double getWind_mph() {
        return wind_mph;
    }

    public void setWind_mph(double wind_mph) {
        this.wind_mph = wind_mph;
    }

    public double getWind_kph() {
        return wind_kph;
    }

    public void setWind_kph(double wind_kph) {
        this.wind_kph = wind_kph;
    }

    public int getWind_degree() {
        return wind_degree;
    }

    public void setWind_degree(int wind_degree) {
        this.wind_degree = wind_degree;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public int getPressure_mb() {
        return pressure_mb;
    }

    public void setPressure_mb(int pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public double getPressure_in() {
        return pressure_in;
    }

    public void setPressure_in(double pressure_in) {
        this.pressure_in = pressure_in;
    }

    public int getPrecip_mm() {
        return precip_mm;
    }

    public void setPrecip_mm(int precip_mm) {
        this.precip_mm = precip_mm;
    }

    public int getPrecip_in() {
        return precip_in;
    }

    public void setPrecip_in(int precip_in) {
        this.precip_in = precip_in;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public double getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(double feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public double getFeelslike_f() {
        return feelslike_f;
    }

    public void setFeelslike_f(double feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public int getVis_km() {
        return vis_km;
    }

    public void setVis_km(int vis_km) {
        this.vis_km = vis_km;
    }

    public int getVis_miles() {
        return vis_miles;
    }

    public void setVis_miles(int vis_miles) {
        this.vis_miles = vis_miles;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    @Override
    public String toString() {
        return "Current{" +
                "condition=" + condition +
                ", last_updated_epoch=" + last_updated_epoch +
                ", last_updated='" + last_updated + '\'' +
                ", temp_c=" + temp_c +
                ", temp_f=" + temp_f +
                ", is_day=" + is_day +
                ", wind_mph=" + wind_mph +
                ", wind_kph=" + wind_kph +
                ", wind_degree=" + wind_degree +
                ", wind_dir='" + wind_dir + '\'' +
                ", pressure_mb=" + pressure_mb +
                ", pressure_in=" + pressure_in +
                ", precip_mm=" + precip_mm +
                ", precip_in=" + precip_in +
                ", humidity=" + humidity +
                ", cloud=" + cloud +
                ", feelslike_c=" + feelslike_c +
                ", feelslike_f=" + feelslike_f +
                ", vis_km=" + vis_km +
                ", vis_miles=" + vis_miles +
                ", uv=" + uv +
                '}';
    }
}
