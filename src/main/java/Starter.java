import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Starter {
    public static void main(String[] args) throws Exception{
        JDABuilder jdaBuilder = JDABuilder.createDefault("ODA1NDM5NTM0MjIwNzA1Nzky.YBa6BQ.gaBXZkOBFsGkwDqjMzW_oevW9nI");
        JDA jda = null;
        jdaBuilder.setActivity(Activity.watching("Как страдают люди"));
        try {
            jda = jdaBuilder.build();

        } catch (LoginException e) {
            e.printStackTrace();
        }
        try {
            jda.awaitReady();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
