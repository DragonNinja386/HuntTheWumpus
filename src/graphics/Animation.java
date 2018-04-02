package graphics;

import java.awt.image.BufferedImage;

/**
 * Created by sn317602 on 11/18/2016.
 */
public class Animation {
    private BufferedImage spriteSheet;
    private BufferedImage frame;
    private int currentFrame;
    private int frameHeight;
    private int frameWidth;
    private int frameColumn;
    public int numberOfFrames;
    public int time;

    //Initializing Animation
    public Animation(BufferedImage s, int w, int h, int num, int column) {
        spriteSheet = s;
        frameHeight = h;
        frameWidth = w;
        numberOfFrames = num;
        frameColumn = column;
        setFrame(0);
    }

    //Temporary Background Creator - MAKE SURE TO MAKE BACKGROUND CLASS
    public Animation(int t,BufferedImage s, int w, int h, int num, int column) {
        spriteSheet = s;
        time = t;
        frameHeight = h;
        frameWidth = w;
        numberOfFrames = num;
        frameColumn = column;
        setFrame(0);
    }

    //Changing Animation Frames
    public void setFrame(int frameNumber) {
        if(frameNumber < numberOfFrames) {
            currentFrame = frameNumber;
            int row = (frameNumber) % frameColumn;
            int column = (frameNumber) / frameColumn;
            frame = spriteSheet.getSubimage(row * frameWidth, column * frameHeight, frameWidth, frameHeight);
        } else {
            System.out.println("Error: Can't change Frames");
        }
    }

    public void nextFrame(){
        if(currentFrame + 1 < numberOfFrames) {
            setFrame(currentFrame + 1);
        }else{
            setFrame(0);
        }
    }

    //Returning Frame
    public BufferedImage getFrame() {
        return frame;
    }
}
