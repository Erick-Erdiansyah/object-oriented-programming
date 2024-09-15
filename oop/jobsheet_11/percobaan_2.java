interface ITelphone {
  void powerOn();

  void dial(int phoneNumber);

  void answer();

  boolean callPhone(int phoneNumber);

  boolean isRinging();
}

class DeskPhone implements ITelphone {
  private int myNumber;
  private boolean isRinging;

  public DeskPhone(int myNumber) {
    this.myNumber = myNumber;
  }

  @Override
  public void powerOn() {
    System.out.println("No action taken, desk phone does not have a power button");
  }

  @Override
  public void dial(int phoneNumber) {
    System.out.println("Now ringing " + phoneNumber + " on deskphone");
  }

  @Override
  public void answer() {
    if (isRinging) {
      System.out.println("Answering the desk phone");
      isRinging = false;
    }
  }

  @Override
  public boolean callPhone(int phoneNumber) {
    if (phoneNumber == myNumber) {
      isRinging = true;
      System.out.println("Ring ring");
    } else {
      isRinging = false;
    }
    return isRinging;
  }

  @Override
  public boolean isRinging() {
    return isRinging;
  }
}

public class percobaan_2 {
  public static void main(String[] args) {
    ITelphone timsPhone = new DeskPhone(12323232);
    timsPhone.powerOn();
    timsPhone.callPhone(12323232);
    timsPhone.answer();
  }
}
