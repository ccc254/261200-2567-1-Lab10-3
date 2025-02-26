public class ImageFileHandler implements Handler {
    private Handler handler; //next one to pass on
    private String handlerName;

    public ImageFileHandler(String handlerName){

        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {

        this.handler = handler;
    }

    @Override
    public void process(File file) {
        if(file.getFileType().equals("image")){
            System.out.println("Processing: "+ file.getFilePath()
                    + "/" + file.getFileName()
                    +" by " + handlerName);
        }else if (handler!=null) { // next handler exists
            System.out.println(handlerName + " forwards request to "
                    + handler.getHandlerName());
            handler.process(file);
        }
        else{
            System.out.println("File not supported");
        }
    }

    @Override
    public String getHandlerName() {
        return this.handlerName;
    }
}