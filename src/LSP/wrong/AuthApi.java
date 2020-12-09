package LSP.wrong;

public class AuthApi extends Auth {
    @Override
    public String[] checkCredentials(String login, String password) {
        //checa

        String[] ret = {"true", "200"}; // wrong: quebra o princípio (não pode retornar valores de tipos diferentes da classe base)
        return ret;
    }
}
