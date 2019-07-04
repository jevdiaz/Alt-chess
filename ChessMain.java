public class ChessMain {
   private static int board_length = 8;
   // private static int board_size = board_length ^ 2;
   
   public static void main(String[] args) {
      ChessManager manager = new ChessManager(board_length);
      manager.set();
   }
}