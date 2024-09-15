class coba_1 {
  private String name;
  private String idNum;
  private int age;

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public String getIdNum() {
    return idNum;
  }

  public void setAge(int newAge) {
    age = newAge;
  }

  public void setName(String newName) {
    name = newName;
  }

  public void setIdNum(String newId) {
    idNum = newId;
  }
}

class RunEncap {
  public void main(String[] args) {
    coba_1 encap = new coba_1();
    encap.setName("James");
    encap.setAge(20);
    encap.setIdNum("12343ms");
    System.out.println("Name: " + encap.getName() +
        " Age: " + encap.getAge());
  }
}

class coba_2 {
  private int ssn;
  private String empName;
  private int empAge;

  // Getter and Setter methods
  public int getEmpSSN() {
    return ssn;
  }

  public String getEmpName() {
    return empName;
  }

  public int getEmpAge() {
    return empAge;
  }

  public void setEmpAge(int newValue) {
    empAge = newValue;
  }

  public void setEmpName(String newValue) {
    empName = newValue;
  }

  public void setEmpSSN(int newValue) {
    ssn = newValue;
  }
}

class runMe {
  public void main(String args[]) {
    coba_2 obj = new coba_2();
    obj.setEmpName("Mario");
    obj.setEmpAge(32);
    obj.setEmpSSN(112233);
    System.out.println("Employee Name: " + obj.getEmpName());
    System.out.println("Employee SSN: " + obj.getEmpSSN());
    System.out.println("Employee Age: " + obj.getEmpAge());
  }
}

class coba_3 {
  // private data member
  private String name;

  // getter method for name
  public String getName() {
    return name;
  }

  // setter method for name
  public void setName(String name) {
    this.name = name;
  }
}

class TestRun {
  public void main(String[] args) {
    // creating instance of the encapsulated class
    coba_3 s = new coba_3();
    // setting value in the name member
    s.setName("vijay");
    // getting value of the name member
    System.out.println(s.getName());
  }
}

class coba_4 {
  // private data members
  private long acc_no;
  private String name, email;
  private float amount;

  // public getter and setter methods
  public long getAcc_no() {
    return acc_no;
  }

  public void setAcc_no(long acc_no) {
    this.acc_no = acc_no;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public float getAmount() {
    return amount;
  }

  public void setAmount(float amount) {
    this.amount = amount;
  }
}

class runAccount {
  public void main(String[] args) {
    // creating instance of Account class
    coba_4 acc = new coba_4();
    // setting values through setter methods
    acc.setAcc_no(7560504000L);
    acc.setName("Sonoo Jaiswal");
    acc.setEmail("sonoojaiswal@javatpoint.com");
    acc.setAmount(500000f);
    // getting values through getter methods
    System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
  }
}

class coba_5 {
  // deklarasi variables atau fields
  private String nama;
  private String jenisKelamin;
  private int beratBadan;
  private int tinggiBadan;

  // methods
  public void berjalan() {
    System.out.println("Berjalan");
  }

  public void berlari() {
    System.out.println("Berlari");
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }

  public void setJenisKelamin(String jenisKelamin) {
    this.jenisKelamin = jenisKelamin;
  }

  public String getJenisKelamin() {
    return jenisKelamin;
  }

  public void setBeratBadan(int beratBadan) {
    this.beratBadan = beratBadan;
  }

  public int getBeratBadan() {
    return beratBadan;
  }

  public void setTinggiBadan(int tinggiBadan) {
    this.tinggiBadan = tinggiBadan;
  }

  public int getTinggiBadan() {
    return tinggiBadan;
  }
}

class ManusiaRun {
  public void main(String[] args) {
    coba_5 manusia = new coba_5();
    manusia.setNama("Anton");
    manusia.setJenisKelamin("Pria");
    manusia.setBeratBadan(60);
    manusia.setTinggiBadan(70);
    System.out.println("Nama: " + manusia.getNama());
    System.out.println("Jenis Kelamin: " + manusia.getJenisKelamin());
    System.out.println("Berat Badan: " + manusia.getBeratBadan() + " Kg");
    System.out.println("Tinggi Badan: " + manusia.getTinggiBadan() + " cm");
  }
}
public class percobaan{
  public static void main(String[] args) {
    RunEncap runEncap = new RunEncap();
    ManusiaRun manusiaRun = new ManusiaRun();
    runMe runMe = new runMe();
    TestRun testRun = new TestRun();
    runAccount rAccount = new runAccount();
    System.out.println("coba 1");
    runEncap.main(args);
    System.out.println();
    System.out.println("coba 2");
    runMe.main(args);
    System.out.println();
    System.out.println("coba 3");
    testRun.main(args);
    System.out.println();
    System.out.println("coba 4");
    rAccount.main(args);
    System.out.println();
    System.out.println("coba 5");
    manusiaRun.main(args);
  }
}