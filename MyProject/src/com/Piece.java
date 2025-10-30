
public class Piece {
    private String type;
    private String color;
    
    public Piece(String pieceType, String pieceColor) {
        type = pieceType;
        color = pieceColor;
    }
    
    public String getDescription() {
        return color + " " + type;
    }
}