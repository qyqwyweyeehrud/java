package e_class;

import java.util.Scanner;

public class BankApplication {

   private static Account[] accountArray = new Account[100];
   private static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {

      boolean run = true;
      while (run) {
         System.out.println("---------------------------------");
         System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
         System.out.println("---------------------------------");
         System.out.print("����> ");

         int selectNo = scanner.nextInt();

         if (selectNo == 1) {
            createAccount();
         } else if (selectNo == 2) {
            accountList();
         } else if (selectNo == 3) {
            deposit();
         } else if (selectNo == 4) {
            withdraw();
         } else if (selectNo == 5) {
            run = false;
         }
      }
      System.out.println("���α׷� ����");
   }

   //���� �����ϱ�
   private static void createAccount() {
      String ano = "";
      String owner = "";
      int balance = 0;
      Account newAccount = null;

      scanner.nextLine();

      System.out.println("---------------");
      System.out.println("���»���");
      System.out.println("---------------");
      
      System.out.print("���¹�ȣ: ");
      ano = scanner.nextLine();
      
      System.out.print("������: ");
      owner = scanner.nextLine();
      
      System.out.print("�ʱ��Աݾ�: ");
      balance = scanner.nextInt();
      
      newAccount = new Account(ano, owner, balance);
      
      for (int i = 0; i < accountArray.length; i++) {
         if (accountArray[i] == null) {
            accountArray[i] = newAccount;
            System.out.println("���: ���°� �����Ǿ����ϴ�.");
            break;
         }
      } // end of for i
   }

   //���� ��� ����
   private static void accountList() {
      System.out.println("-------------");
      System.out.println("���¸��");
      System.out.println("-------------");

      for (int i = 0; i < accountArray.length; i++) {
         Account account = accountArray[i];
         
         if (account != null) {
            System.out.print(account.getAno());
            System.out.print(" ");
            System.out.print(account.getOwner());
            System.out.print(" ");
            System.out.print(account.getBalance());
            System.out.println();
         }
         else {
            break;
         }
      } // end of for i
   }

   //���� �ϱ�
   private static void deposit() {
      Account account = null;
      int result = 0;
      
      scanner.nextLine();
      
      System.out.println("-------------");
      System.out.println("����");
      System.out.println("-------------");
      
      System.out.print("���¹�ȣ: ");
      String ano = scanner.nextLine();

      System.out.print("���ݾ�: ");
      int balance = scanner.nextInt();

      account = findAccount(ano);
      result = account.getBalance() + balance;
      account.setBalance(result);
      
      System.out.println("���: ������ �����Ǿ����ϴ�.");
   }

   //����ϱ�
   private static void withdraw() {
      Account account = null;
      int result = 0;
      
      scanner.nextLine();
      
      System.out.println("-------------");
      System.out.println("���");
      System.out.println("-------------");
      
      System.out.print("���¹�ȣ: ");
      String ano = scanner.nextLine();

      System.out.print("��ݾ�: ");
      int balance = scanner.nextInt();

      account = findAccount(ano);
      result = account.getBalance() - balance;
      account.setBalance(result);
      
      System.out.println("���: ����� �����Ǿ����ϴ�.");
   }

   // Account �迭���� ano�� ������ Account ��ü ã��
   private static Account findAccount(String ano) {
      Account account = null;

      for (int i = 0; i < accountArray.length; i++) {
         
         if (accountArray[i] != null) {
            String str = accountArray[i].getAno();
            
            if (str.equals(ano)) {
               account = accountArray[i];
               break;
            }
         }
      } // end of for i
      return account;
   }
}
