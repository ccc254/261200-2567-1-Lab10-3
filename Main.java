public class Main {
    public static void main(String[] args) {
        Handler tfh = new TextFileHandler("1st handler");
        Handler ifh = new ImageFileHandler("3rd handler");
        Handler dfh = new DocFileHandler("2st handler");
        tfh.setHandler(dfh);
        dfh.setHandler(ifh);

        tfh.process(new File("demo.txt","text","C:/OOP")); //ไม่ต้องส่ง
        tfh.process(new File("demo.txt","image","C:/OOP")); //ต้องส่งจาก text>doc>image
        tfh.process(new File("demo.txt","doc","C:/OOP")); //ส่งจาก text>doc
    }
}