class Name {

    private String fname;
    private String lname;
    private String mname;

    public void setFName(String fname) {
        // "this" refers to the class attributes
        this.fname = fname;
    }

    public void setMName(String mname) {
        // "this" refers to the class attributes
        this.mname = mname;
    }

    public void setLName(String lname) {
        // "this" refers to the class attributes
        this.lname = lname;
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if (obj instanceof Name) {
    //         Name other = (Name)obj;
    //         return fname.equals(other.fname) &&
    //               mname.equals(other.mname) &&
    //               lname.equals(other.lname);
    //     }
    //     return false;
    // }

}