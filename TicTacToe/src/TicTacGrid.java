import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TicTacGrid {
    final private List<String> grid;
    Map<Integer, List<List<Integer>>> winSequenceMap = Map.of(
            1, List.of(List.of(1, 2, 3), List.of(1, 4, 7), List.of(1, 5, 9)),
            2, List.of(List.of(1, 2, 3), List.of(2, 5, 8)),
            3, List.of(List.of(1, 2, 3), List.of(3, 6, 9), List.of(3, 5, 7)),
            4, List.of(List.of(1, 4, 7), List.of(4, 5, 6)),
            5, List.of(List.of(1, 5, 9), List.of(3, 5, 7), List.of(2, 5, 8), List.of(4, 5, 6)),
            6, List.of(List.of(3, 6, 9), List.of(4, 5, 6)),
            7, List.of(List.of(1, 4, 7), List.of(3, 5, 7), List.of(7, 8, 9)),
            8, List.of(List.of(7, 8, 9), List.of(2, 5, 8)),
            9, List.of(List.of(1, 5, 9), List.of(3, 6, 9), List.of(7, 8, 9))
    );

    public TicTacGrid(int gridSize) {
        this.grid = new ArrayList<>();

        for (int index = 0; index < gridSize; index++) {
            this.grid.add(" ");
        }
    }

    public void insertSymbol(int position, String symbol) {
        int indexPosition = position - 1;
        if (!(" ".equals(grid.get(indexPosition)))) {
            throw new IllegalArgumentException();
        }

        grid.set(indexPosition, symbol);
    }

    public boolean isSequenceCompleted(int position, String symbol) {
        List<List<Integer>> lists = winSequenceMap.get(position);

        for (List<Integer> item : lists) {
            boolean foundMatchingSequence = item.stream().allMatch(integer -> {
                int indexPosition = integer - 1;
                return symbol.equals(grid.get(indexPosition));
            });

            if (foundMatchingSequence) {
                return true;
            }
        }
        return false;
    }

    public void printGrid() {

        int lineBreakAt = 3;
        int indexValue = 1;
        for (String item : grid) {
            System.out.print(item + " | ");

            if (indexValue % lineBreakAt == 0) {
                System.out.println();
            }
            indexValue++;
        }
        System.out.println();
    }
}
