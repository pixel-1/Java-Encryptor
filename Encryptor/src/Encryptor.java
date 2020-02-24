import java.util.ArrayList;

public class Encryptor {
    public ArrayList<String> input = new ArrayList<String>();
    private int n=10;
    private int s = 1;
    private int t;
    
    public Encryptor() {
    }
    
    public Encryptor(String x, int n, int s) {
        setN(n);
        this.s = s;
        setInput(x);
    }

    public void setN(int n) {
        this.n = n < 26 ? n : this.n;
    }

    public int getN() {
        return this.n;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getS() {
        return this.s;
    }

    public String getInput() {
        return String.join("", input);
    }

    public void setInput(String x) {
        input.clear();
        String[] s = x.split("");
        for(int i=0; i<s.length; i++) {
            input.add(s[i]);
        }
    }

    public String encrypt() {
        this.t = this.s;
        String[] str = new String[input.size()];
        int[] r = new int[input.size()];
        char[] c = new char[input.size()];

        for(int i=0; i<input.size(); i++) {
            c[i] = input.get(i).charAt(0);
            r[i] = (int)c[i];

            if(this.t>this.n) this.t=this.s;
            if(r[i] == 32) {
                str[i] = Character.toString((char)r[i]);
                continue;
            }

            r[i] += t;
            r[i] = (r[i] > 122) ? r[i]-26 : r[i];

            str[i] = Character.toString((char)r[i]);
            this.t+=this.s;
        }
        return String.join("", str);
    }

    public String decrypt() {
        this.t= s;
        String[] str = new String[input.size()];
        int[] r = new int[input.size()];
        char[] c = new char[input.size()];

        for(int i=0; i<input.size(); i++) {
            c[i] = input.get(i).charAt(0);
            r[i] = (int)c[i];

            if(this.t>this.n) this.t=this.s;
            if(r[i] == 32) {
                str[i] = Character.toString((char)r[i]);
                continue;
            }

            r[i] -= t;
            r[i] = (r[i] < 97) ? r[i]+26 : r[i];

            str[i] = Character.toString((char)r[i]);
            this.t+=this.s;
        }
        return String.join("", str);
    }
}