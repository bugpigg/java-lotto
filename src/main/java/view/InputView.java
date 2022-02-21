package view;

import java.util.Scanner;

public class InputView {

    private static final String ASK_PRICE = "구입금액을 입력해 주세요.";
    private static final String ASK_WINNING_NUMBER_MESSAGE = "당첨 번호를 입력해 주세요.";

    private Scanner scanner = new Scanner(System.in);

    public int getPrice() {
        System.out.println(ASK_PRICE);
        return scanner.nextInt();
    }

    public String getWinningNumber() {
        System.out.println(ASK_WINNING_NUMBER_MESSAGE);
        return scanner.nextLine();
    }

}
