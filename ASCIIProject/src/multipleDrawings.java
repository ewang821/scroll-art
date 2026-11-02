import java.util.Random;


public class multipleDrawings {
    static final int WIDTH = 100;
    static final int ART_HEIGHT = 25;
    static final int ART_WIDTH = 40;

    static final Random rand = new Random();

    public static void main(String[] args) throws InterruptedException {

        char[][] nextRows = new char[ART_HEIGHT][WIDTH];

        for (int i = 0; i < nextRows.length; i++) {
            nextRows[i] = emptyRow();
        }

        while (true) {

            for (int x = 0; x < WIDTH - ART_WIDTH; x++) {

                if (rand.nextDouble() < 0.01 && isAreaEmpty(nextRows, x)) {
                    loadNextRowsWithImage(nextRows, x);
                }
            }

            System.out.println(new String(nextRows[0]));

            shiftRowsUp(nextRows);

            Thread.sleep(40);
        }
    }

    static void loadNextRowsWithImage(char[][] nextRows, int x) {

    AsciiArt[] images = {
        new AsciiArt(peppaPrincess()),
        new AsciiArt(pumpkin()),
        new AsciiArt(stringToArray(getWoodstock())),
        new AsciiArt(stringToArray(getMiffy())),
        new AsciiArt(stringToArray(getTotoro()))
    };

    AsciiArt art = images[rand.nextInt(images.length)];

    for (int iy = 0; iy < art.height; iy++) {
        for (int ix = 0; ix < art.width; ix++) {
            nextRows[iy][x + ix] = art.img[iy][ix];
        }
    }
}

    static void shiftRowsUp(char[][] nextRows) {

        for (int i = 1; i < nextRows.length; i++) {
            nextRows[i - 1] = nextRows[i];
        }

        nextRows[nextRows.length - 1] = emptyRow();
    }

    static char[] emptyRow() {

        char[] row = new char[WIDTH];

        for (int i = 0; i < WIDTH; i++) {
            row[i] = ' ';
        }

        return row;
    }

    static boolean isAreaEmpty(char[][] nextRows, int x) {

        for (int y = 0; y < ART_HEIGHT; y++) {
            for (int i = x; i < x + ART_WIDTH; i++) {

                if (nextRows[y][i] != ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    public static char[][] peppaPrincess() {
    int rows = 25, col = 30;
        char[][] arr = new char[rows][col];
        for(int y = 0; y < rows; y++) {
            for(int x = 0; x < col; x++) {
                arr[y][x] = ' ';
            }
        }
        arr[14][0] = '_';
        arr[15][1] = '/';
        arr[14][2] = '/';
        arr[15][2] = '\\';
        arr[6][3] = '|';
        arr[13][3] = '/';
        arr[5][4] = '/';
        arr[7][4] = '\\';
        arr[12][4] = '/';
        arr[13][4] = '|';
        arr[14][4] = '|';
        arr[15][4] = '|';
        arr[16][4] = '|';
        arr[17][4] = '|';
        arr[5][5] = 'o';
        arr[7][5] = '\\';
        arr[11][5] = '/';
        arr[17][5] = '_';
        arr[8][6] = '|';
        arr[17][6] = '_';
        arr[4][7] = '-';
        arr[5][7] = 'o';
        arr[7][7] = '/';
        arr[9][7] = '\\';
        arr[10][7] = '/';
        arr[17][7] = '_';
        arr[20][7] = '=';
        arr[0][8] = '`';
        arr[1][8] = '\\';
        arr[4][8] = '-';
        arr[6][8] = '/';
        arr[10][8] = '\\';
        arr[17][8] = '_';
        arr[20][8] = '=';
        arr[2][9] = '\\';
        arr[4][9] = '-';
        arr[9][9] = '\\';
        arr[17][9] = '_';
        arr[18][9] = '|';
        arr[19][9] = '|';
        arr[20][9] = '|';
        arr[1][10] = '`';
        arr[2][10] = 'o';
        arr[3][10] = '\\';
        arr[4][10] = '-';
        arr[9][10] = '_';
        arr[10][10] = '_';
        arr[17][10] = '_';
        arr[2][11] = '`';
        arr[4][11] = '-';
        arr[5][11] = '0';
        arr[9][11] = '_';
        arr[10][11] = '_';
        arr[17][11] = '_';
        arr[2][12] = '/';
        arr[4][12] = '-';
        arr[9][12] = '_';
        arr[10][12] = '_';
        arr[17][12] = '_';
        arr[1][13] = '/';
        arr[2][13] = 'o';
        arr[4][13] = '-';
        arr[7][13] = '(';
        arr[9][13] = '/';
        arr[10][13] = '_';
        arr[17][13] = '_';
        arr[0][14] = '`';
        arr[1][14] = '`';
        arr[4][14] = '-';
        arr[5][14] = '0';
        arr[6][14] = '_';
        arr[7][14] = '_';
        arr[10][14] = '_';
        arr[17][14] = '_';
        arr[20][14] = '=';
        arr[2][15] = '`';
        arr[4][15] = '-';
        arr[6][15] = '_';
        arr[7][15] = '_';
        arr[10][15] = '_';
        arr[17][15] = '_';
        arr[20][15] = '=';
        arr[2][16] = 'o';
        arr[3][16] = '/';
        arr[4][16] = '-';
        arr[7][16] = ')';
        arr[17][16] = '_';
        arr[18][16] = '|';
        arr[19][16] = '|';
        arr[20][16] = '|';
        arr[1][17] = '/';
        arr[2][17] = '/';
        arr[5][17] = '`';
        arr[10][17] = '/';
        arr[17][17] = '_';
        arr[0][18] = '`';
        arr[1][18] = '/';
        arr[6][18] = '\\';
        arr[9][18] = '/';
        arr[10][18] = '\\';
        arr[17][18] = '_';
        arr[7][19] = '\\';
        arr[8][19] = '|';
        arr[17][19] = '_';
        arr[11][20] = '\\';
        arr[17][20] = '_';
        arr[12][21] = '\\';
        arr[13][21] = '|';
        arr[14][21] = '|';
        arr[15][21] = '|';
        arr[16][21] = '|';
        arr[17][21] = '|';
        arr[13][22] = '\\';
        arr[16][22] = '%';
        arr[14][23] = '\\';
        arr[15][23] = '/';
        arr[16][23] = '%';
        arr[15][24] = '\\';
        arr[14][25] = '_';
        arr[23][28] = 'E';
        arr[23][29] = 'W';

        return arr;
}
    public static char[][] pumpkin() {
    int rows2 = 13, col2 = 30;
        char[][] arr = new char[rows2][col2];
        for(int y = 0; y < rows2; y++) {
            for(int x = 0; x < col2; x++) {
                arr[y][x] = ' ';
            }
        }
        arr[0][12] = '%';
        arr[1][11] = '/';
        arr[1][12] = '%';
        arr[1][13] = '%';
        arr[2][11] = '/';
        arr[3][11] = '/';
        arr[4][7] = '/';
        arr[4][8] = '\\';
        arr[4][10] = '/';
        arr[4][11] = '/';
        arr[4][12] = '\\';
        arr[4][13] = '\\';
        arr[4][15] = '/';
        arr[4][16] = '\\';
        arr[5][3] = '\\';
        arr[5][4] = '\\';
        arr[5][6] = '/';
        arr[5][9] = '/';
        arr[5][14] = '\\';
        arr[5][17] = '\\';
        arr[5][19] = '/';
        arr[5][20] = '/';
        arr[6][2] = '\\';
        arr[6][5] = '/';
        arr[6][9] = '/';
        arr[6][14] = '\\';
        arr[6][18] = '\\';
        arr[6][21] = '/';
        arr[6][28] = '6';
        arr[7][1] = '\\';
        arr[7][5] = '/';
        arr[7][9] = '/';
        arr[7][14] = '\\';
        arr[7][18] = '\\';
        arr[7][21] = '/';
        arr[7][28] = '|';
        arr[8][1] = '\\';
        arr[8][5] = '/';
        arr[8][9] = '/';
        arr[8][14] = '\\';
        arr[8][18] = '\\';
        arr[8][21] = '/';
        arr[8][24] = '6';
        arr[8][27] = '|';
        arr[8][29] = '|';
        arr[9][1] = '\\';
        arr[9][5] = '/';
        arr[9][9] = '/';
        arr[9][14] = '\\';
        arr[9][18] = '\\';
        arr[9][21] = '/';
        arr[9][24] = '|';
        arr[9][27] = '|';
        arr[9][29] = '|';
        arr[10][1] = '\\';
        arr[10][5] = '/';
        arr[10][9] = '/';
        arr[10][14] = '\\';
        arr[10][18] = '\\';
        arr[10][21] = '/';
        arr[10][23] = '|';
        arr[10][25] = '|';
        arr[10][27] = '|';
        arr[10][29] = '|';
        arr[11][2] = '\\';
        arr[11][5] = '/';
        arr[11][9] = '/';
        arr[11][14] = '\\';
        arr[11][18] = '\\';
        arr[11][20] = '/';
        arr[11][23] = '|';
        arr[11][25] = '|';
        arr[11][27] = '|';
        arr[11][29] = '|';
        arr[12][3] = '\\';
        arr[12][4] = '_';
        arr[12][5] = '/';
        arr[12][6] = '_';
        arr[12][7] = '_';
        arr[12][8] = '_';
        arr[12][9] = '/';
        arr[12][10] = '_';
        arr[12][11] = '_';
        arr[12][12] = '_';
        arr[12][13] = '_';
        arr[12][14] = '\\';
        arr[12][15] = '_';
        arr[12][16] = '_';
        arr[12][17] = '_';
        arr[12][18] = '\\';
        arr[12][19] = '/';
        arr[12][23] = '|';
        arr[12][24] = '_';
        arr[12][25] = '|';
        arr[12][27] = '|';
        arr[12][28] = '_';
        arr[12][29] = '|';
    
        return arr;

}

    public static String getWoodstock() {
        return """
                  _ (\\(_    
                <     '_)   
                  )  (     
                < /  )     
                   √√      
                      SC   """;
        
                
    }

    public static char[][] stringToArray(String drawing) {
    String[] lines = drawing.split("\n");

    int height = lines.length;
    int width = 0;

    for (String line : lines) {
        if (line.length() > width) {
            width = line.length();
        }
    }

    char[][] arr = new char[height][width];

    for (int y = 0; y < height; y++) {
        for (int x = 0; x < width; x++) {
            if (x < lines[y].length()) {
                arr[y][x] = lines[y].charAt(x);
            } else {
                arr[y][x] = ' ';
            }
        }
    }

    return arr;
}

    public static String getMiffy() {
    return """

             _        _      
            / \\      / \\     
           (   )    (   )    
           |   |    |   |    
           |   |____|   |    
          /              \\   
         /                \\  
        /    @        @    \\ 
        |        \\/        | 
         \\       /\\       /  
          \\______________/   
           /            \\    
          /              \\   
         /                \\  
        /                  \\ 
        \\ |              | / 
         \\|              |/  
          |______________|   
              /___|___\\      

             EY                 
            """;
}

static String getTotoro() {
    return """
                 /\\        /\\
                /||\\      /||\\
                ..----------..
              .'             '.
             /  (*)    v   (*)  \\      .--.
            |     '_______'     |    /    |
             \\                 /--.'
        .-' ''-.. .---...---..-'    /
       /      .'^  ^  ^  ^  ^'.   /
      /       /  ^  ^  ^  ^  ^  \\/
     |   | | |                  | |
     '-.| | |                  | |
           \\ \\                / /
            \\  \\ '.        .' /
             \\   \\ ''-----'' /
              \\  '----\\-/----' /
               . '___________' .    CK
            """;
}
}
