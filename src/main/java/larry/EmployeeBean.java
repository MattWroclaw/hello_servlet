package larry;

public class EmployeeBean {
    private NameBean name;
    private CompanyBean company;
    public String wizytowka = "pewex";

    public EmployeeBean(NameBean name, CompanyBean company){
        setCompany(company);
        setName(name);
    }

    public NameBean getName() {
        return name;
    }

    public void setName(NameBean name) {
        this.name = name;
    }

    public CompanyBean getCompany() {
        return company;
    }

    public void setCompany(CompanyBean company) {
        this.company = company;
    }
}
