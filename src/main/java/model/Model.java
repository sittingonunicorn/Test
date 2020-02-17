package model;

public class Model {
    private String lastname;
    private String firstname;
    private String patronymic;
    private String shortName;
    private String login;
    private String comment;
    private String group;
    private String homeNumber;
    private String mobileNumber;
    private String mobileNumber2;
    private String eMail;
    private String skype;
    private String address;
    private String dateInput;
    private String dateChanged;

    public Model() {
    }

    public Model(String lastname, String nickname) {
        this.lastname = lastname;
        this.login = nickname;
    }

    public Model(String lastname, String firstname, String patronymic, String shortName, String login, String comment,
                 String group, String homeNumber, String mobileNumber, String mobileNumber2,
                 String eMail, String skype, String address, String dateInput, String dateChanged) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.shortName = shortName;
        this.login = login;
        this.comment = comment;
        this.group = group;
        this.homeNumber = homeNumber;
        this.mobileNumber = mobileNumber;
        this.mobileNumber2 = mobileNumber2;
        this.eMail = eMail;
        this.skype = skype;
        this.address = address;
        this.dateInput = dateInput;
        this.dateChanged = dateChanged;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber2() {
        return mobileNumber2;
    }

    public void setMobileNumber2(String mobileNumber2) {
        this.mobileNumber2 = mobileNumber2;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateInput() {
        return dateInput;
    }

    public void setDateInput(String dateInput) {
        this.dateInput = dateInput;
    }

    public String getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(String dateChanged) {
        this.dateChanged = dateChanged;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNickname() {
        return login;
    }

    public void setNickname(String nickname) {
        this.login = nickname;
    }
}
