public class Value {

    private boolean modified = false;
    private int val;

    public Value(int val) {
        this.val = val;
    }

    public Value(){
    }

    public int getVal() {
        if (modified) {
            return val;
        } else {
            return 0;
        }
    }

    public void setVal(int val) {
        this.val = val;
        modified = true;
    }

    public boolean wasModified() {
        return modified;
    }

}