package com.wl.structure.flyweight;

import com.wl.structure.flyweight.framework.DataAbstract;
import com.wl.structure.flyweight.framework.TextExternal;
import com.wl.structure.flyweight.framework.factory.SimpleFactory;

public class Main {
    public static void main(String [] args) {
        // 模仿md5码
        String textnd501 = "Text-01", textmd502 = "Text-02";
        String imagemd501 = "image-01", imagemd502 = "image=02";
        String videomd501 = "video-01", videomd502 = "video-02";
        String animationmd501 = "animation-01", animationmd502 = "animation-02";

        DataAbstract image = SimpleFactory.createImage(imagemd501);
        DataAbstract image1 = SimpleFactory.createImage(imagemd502);

        DataAbstract text = SimpleFactory.createText(textnd501);
        DataAbstract text1 = SimpleFactory.createText(textmd502);

        DataAbstract video = SimpleFactory.createVideo(videomd501);
        DataAbstract video1 = SimpleFactory.createVideo(videomd502);

        DataAbstract animation = SimpleFactory.createAnimation(animationmd501);
        DataAbstract animation1 = SimpleFactory.createAnimation(animationmd502);

        image.show(new TextExternal(1, 2, 100, 300));
        image1.show(new TextExternal(1, 5, 100, 300));

        DataAbstract image03 = SimpleFactory.createImage(imagemd501);
        System.out.println(image == image03);
        image03.show(new TextExternal(1, 2, 500, 300));
    }
}
