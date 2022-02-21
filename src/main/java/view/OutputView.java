package view;

import java.util.List;

public class OutputView {

    private static final String PURCHASE_CONFIRMATION_MESSAGE = "개를 구매했습니다.";

    public void printPurchaseConfirmMessage(int numberOfLotto) {
        System.out.println(numberOfLotto + PURCHASE_CONFIRMATION_MESSAGE);
    }

    //TODO: 추후 수정
    public void printLotto(List<Integer> list) {
        System.out.println(list);
    }
}
