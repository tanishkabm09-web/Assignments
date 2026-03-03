package Association.Aggregation;

public class Patient{
        String patientName;
        int PatientAge;
        String disease,dateOfArrival;

        Information info;
        Payment pay;

        public Patient(String patientName, int patientAge, String disease, String dateOfArrival,Information info,Payment pay) {
            this.patientName = patientName;
            this.PatientAge = patientAge;
            this.disease = disease;
            this.dateOfArrival = dateOfArrival;
            this.info=info;
            this.pay=pay;
        }
        void patientDetails(){
            System.out.println("Name:"+this.patientName);
            System.out.println("Age:"+this.PatientAge);
            System.out.println("Disease:"+this.disease);
            System.out.println("Date of Arrival:"+this.dateOfArrival);
            System.out.println("Block Number:"+this.info.blockNo);
            System.out.println("Floor Number:"+this.info.floorNo);
            System.out.println("Room Number:"+this.info.roomNo);
            System.out.println("Bed Number:"+this.info.bedNo);
            System.out.println("Admission Number:"+this.pay.adFees);
            System.out.println("Registration Number:"+this.pay.regFees);
            System.out.println("Balance Amount:"+this.pay.balAmt);
        }
        public static void main(String[] args){
            Information info = new Information('C',3,302,4);
            Payment pay = new Payment(5000,10000,50000);
            Patient p1 = new Patient("ABC",21,"Covid","25/01/2026",info,pay);
            p1.patientDetails();
        }
    }

