package game_mgmt;

import java.util.ArrayList;

public class Log {
  private ArrayList<String> messages;

  public Log() {
    this.messages = new ArrayList<String>();
  }

  public void add(String string) {
    messages.add(string);
  }

  public void print() {
    for (String message : messages) {
      System.out.println(message);
    }
  }

  public void print(String message) {
    System.out.println(message);
  }
}