class Consts
{
    public static final RandomAccessFile fileToSend;

    public Consts(){
        try {
            this.fileToSend = new RandomAccessFile("t", "rw");
            this.fileToSend.setLength(10 * 1024 * 1024);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}