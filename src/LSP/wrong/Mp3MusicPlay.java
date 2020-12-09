package LSP.wrong;

import java.io.File;

public class Mp3MusicPlay extends MusicPlay {
    public void play(File file) {
        if (file.getPath() != 'mp3') {
            throw new Exception; // wrong: quebra o princípio (não pode lançar exceção)

            // toca a música
        }
    }
}
