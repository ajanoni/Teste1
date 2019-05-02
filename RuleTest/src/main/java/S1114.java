public class S1114 {
    protected void finalize() throws Throwable {
        try {
            // no method
        } catch (Throwable t) {
            releaseSomeResources();
            super.finalize(); // non-compliant- Super is at the end of the
            // method but in a catch block
        }

    }

    public void releaseSomeResources() {

    }
}

