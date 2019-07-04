public class ChessManager {
   private String[][] gameboard;
   private static int board_size;
   private boolean white_checked = false;
   private boolean black_checked = false;
   
   public ChessManager(int size) {
      board_size = size;
      gameboard = new String[size][size];
   }
   
   public void set() {
      String[] pawns = new String[board_size];
      for (int i = 0; i < board_size; i++) {
         pawns[i] = "p";
      }
      String[] backrow = {"R", "Kn", "B", "Q", "K", "B", "Kn", "R"};
      
      gameboard[1] = pawns;
      gameboard[6] = pawns;
      gameboard[0] = backrow;
      gameboard[7] = backrow;
   }
}