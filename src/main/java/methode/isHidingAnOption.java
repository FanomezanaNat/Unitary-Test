package methode;

public class isHidingAnOption {
    int cuttedEmptyCount = 0;
    int cuttedEmpty = 0;
    int remainingEmptyCount = 0;
    int remaingEmpty = 0;
    String cutted_input;
    String remaining_input;

    public boolean isHidingAnOption(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'C' || input.charAt(i) == 'c') {
                cutted_input = input.substring(0, i);
                remaining_input = input.substring(i);
            }
        }
        for (int j = 1; j < cutted_input.length(); j++) {
            if (cutted_input.charAt(0) == 'X' || cutted_input.charAt(0) == 'x') {
                cuttedEmptyCount++;
            }
            cuttedEmpty++;
        }
        for (int k = 1; k < remaining_input.length() - 1; k++) {
            if (remaining_input.charAt(remaining_input.length() - 1) == 'A' || remaining_input.charAt(remaining_input.length() - 1) == 'a') {
                remainingEmptyCount++;
            }
            remaingEmpty++;
        }

        return cuttedEmptyCount < remainingEmptyCount ? true : cuttedEmptyCount > remainingEmptyCount ? false : cuttedEmpty <= remaingEmpty ? false : true;

    }
}






