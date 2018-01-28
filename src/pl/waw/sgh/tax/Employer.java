package pl.waw.sgh.tax;

public class Employer {
        private Integer Employer_ID;
        private String Employer_name;

        public Employer(Integer Employer_ID, String Employer_name) {
            this.Employer_ID = Employer_ID;
            this.Employer_name = Employer_name;

        }
        public Integer getEmployer_ID() {
            return Employer_ID;
        }
        public void setEmployer_ID(Integer Employer_ID) {
            this.Employer_ID = Employer_ID;
        }
        public String getEmployer_name() {
            return Employer_name;
        }
        public void setEmployer_name(String Employer_name){
            this.Employer_name=Employer_name;
        }




        @Override
        public String toString(){
            return Employer_ID+","+Employer_name+"\n";
        }

    }



