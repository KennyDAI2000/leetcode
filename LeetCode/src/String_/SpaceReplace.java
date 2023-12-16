package String_;

public class SpaceReplace {
    public String pathEncryption(String path) {
        char[] res = new char[path.length()];
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='.'){
                res[i] = '\s';
            }else {
                res[i] = path.charAt(i);
            }
        }

        return new String(res);
    }
}
