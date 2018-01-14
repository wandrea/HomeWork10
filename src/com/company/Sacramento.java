package com.company;

public class Sacramento {
    private String cDateTime;
    private String address;
    private Integer district;
    private String beat;
    private Integer grid;
    private String crimeDescr;
    private Integer ucrNcicCode;
    private Float latitude;
    private Float longitude;


    public Sacramento() {

    }

    public Sacramento(String cDateTime, String address, Integer district, String beat, Integer grid, String crimeDescr, Integer ocrNcicCode, Float latitude, Float longtitude) {
        this.cDateTime = cDateTime;
        this.address = address;
        this.district = district;
        this.beat = beat;
        this.grid = grid;
        this.crimeDescr = crimeDescr;
        this.ucrNcicCode = ocrNcicCode;
        this.latitude = latitude;
        this.longitude = longtitude;
    }

    public String getcDateTime() {
        return cDateTime;
    }

    public void setcDateTime(String cDateTime) {
        this.cDateTime = cDateTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public String getBeat() {
        return beat;
    }

    public void setBeat(String beat) {
        this.beat = beat;
    }

    public Integer getGrid() {
        return grid;
    }

    public void setGrid(Integer grid) {
        this.grid = grid;
    }

    public String getCrimeDescr() {
        return crimeDescr;
    }

    public void setCrimeDescr(String crimeDescr) {
        this.crimeDescr = crimeDescr;
    }

    public Integer getUcrNcicCode() {
        return ucrNcicCode;
    }

    public void setUcrNcicCode(Integer ucrNcicCode) {
        this.ucrNcicCode = ucrNcicCode;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Sacramento{" +
                "cDateTime='" + cDateTime + '\'' +
                ", address='" + address + '\'' +
                ", district=" + district +
                ", beat='" + beat + '\'' +
                ", grid=" + grid +
                ", crimeDescr='" + crimeDescr + '\'' +
                ", ucrNcicCode=" + ucrNcicCode +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    public String toCSV(){
        return  cDateTime + "," + address +"," + district +"," + beat + "," + grid +"," + crimeDescr +
                "," + ucrNcicCode +"," + latitude +"," + longitude;
    }


}