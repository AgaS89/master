import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMail {

    public void checkIdfMailIsCorrect(List<String> emails){

        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(regex);

        for (String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " : " + matcher.matches() + "\n");
        }


    }

    public boolean checkEmail2(String mail){

        String subText;

        if(mail.indexOf("@") > 0) {
            subText = mail.substring(mail.indexOf("@")+1); //xyz.com

           // if (subText.indexOf(".") > 0 && subText.indexOf(".")  < subText.length()-1){
            if (subText.indexOf(".") > 0 && !subText.endsWith(".")){
                System.out.println(subText.indexOf("."));
                System.out.println(subText.length());
                return true;
            }else {
                return false;
            }

        } else {
            return false;
        }
    }


}

