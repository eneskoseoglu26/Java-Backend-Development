public class Teacher {
    private String name;
    private String branch;
    private String code;
    private String mobile;

    public Teacher(String name, String branch, String mobile) {
        this.name = name;
        this.branch = branch;
        setBranchCode(this.branch);
        this.mobile = mobile;
    }

    public void setBranchCode(String branch) {
        switch (branch) {
            case "Mathematics":
                this.code = "MAT";
                break;
            case "History":
                this.code = "HST";
                break;
            case "Biology":
                this.code = "BIO";
                break;
            case "Physics":
                this.code = "PHY";
                break;
            default :
                System.out.println("Branch code adding failed!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
