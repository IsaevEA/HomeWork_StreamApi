package org.example;





public class Telephone {
    private Long phoneNumber;
    private PhoneType phoneType;

    public Telephone() {
    }

    public Telephone(Long phoneNumber, PhoneType phoneType) {
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "phoneNumber=" + phoneNumber +
                ", phoneType=" + phoneType +
                '}';
    }
}
