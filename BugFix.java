    public class BugFix {
        private int Bid;
        private String Bname;
        
        // Default constructor
        public BugFix() {
            this.Bid = 0; // Default value for Bid
            this.Bname = ""; // Default value for Bname
        }
        
        // Constructor with parameters
        public BugFix(int bid, String bname) {
            this.Bid = bid;
            this.Bname = bname;
        }
        
        // Getters and Setters
        public int getBid() {
            return Bid;
        }
        
        public void setBid(int bid) {
            Bid = bid;
        }
        
        public String getBname() {
            return Bname;
        }
        
        public void setBname(String bname) {
            Bname = bname;
        }
        
        // Main method for testing
        public static void main(String[] args) {
            BugFix b = new BugFix(); // Create instance using default constructor
        
        b.setBid(1); // Set the bid
        b.setBname(""); // Set the bname (empty string)
        
        System.out.println(b.getBid()); // Print the bid
        System.out.println(b.getBname()); // Print the bname
    }
}
