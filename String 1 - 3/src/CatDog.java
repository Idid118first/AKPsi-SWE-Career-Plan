public class CatDog {
    public boolean catDog(String str) {

        int amt = 0;
        for(int i = 0; i < str.length() - 2; i++)
        {
            if(str.charAt(i) == 'c')
            {
                if(str.charAt(i+1) == 'a' && str.charAt(i+2) == 't')
                    amt++;
            }
            else if(str.charAt(i) == 'd')
            {
                if(str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g')
                    amt--;
            }
        }
        return (amt == 0);

    }
}
