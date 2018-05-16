package com.wl.structure.flyweight.framework.factory;

import com.wl.structure.flyweight.framework.DataAbstract;
import com.wl.structure.flyweight.framework.concrete.Animation;
import com.wl.structure.flyweight.framework.concrete.Image;
import com.wl.structure.flyweight.framework.concrete.Text;

import java.util.HashMap;
import java.util.Map;

public class SimpleFactory {
    private SimpleFactory() {}

    private static final SimpleFactory SIMPLE_FACTORY = null;

    // 文本
    private static Map<String, DataAbstract> dataText = new HashMap<>();

    // 动画
    private static Map<String, DataAbstract> dataAnimation = new HashMap<>();

    // 图片
    private static Map<String, DataAbstract> dataImage = new HashMap<>();

    // 视频
    private static Map<String, DataAbstract> dataVideo = new HashMap<>();

    private static class Init{
        private static final SimpleFactory SIMPLE_FACTORY = new SimpleFactory();
    }

    public static DataAbstract createText(String md5) {
        DataAbstract dataAbstract = null;
        synchronized (dataText) {
            dataAbstract = dataText.get(md5);
        }
        if (dataAbstract == null) {
            synchronized (dataText) {
                dataAbstract = dataText.get(md5);
                if (dataAbstract == null) {
                    dataAbstract = new Text(md5);
                    dataText.put(md5, dataAbstract);
                }
            }
        }
        return dataAbstract;
    }

    public static DataAbstract createAnimation(String md5) {
        DataAbstract dataAbstract = null;
        synchronized (dataAnimation) {
            dataAbstract = dataAnimation.get(md5);
        }
        if (dataAbstract == null) {
            synchronized (dataAnimation) {
                dataAbstract = dataAnimation.get(md5);
                if (dataAbstract == null) {
                    dataAbstract = new Animation(md5);
                    dataAnimation.put(md5, dataAbstract);
                }
            }
        }
        return dataAbstract;
    }

    public static DataAbstract createImage(String md5) {
        DataAbstract dataAbstract = null;
        synchronized (dataImage) {
            dataAbstract = dataImage.get(md5);
        }
        if (dataAbstract == null) {
            synchronized (dataImage) {
                dataAbstract = dataImage.get(md5);
                if (dataAbstract == null) {
                    dataAbstract = new Image(md5);
                    dataImage.put(md5, dataAbstract);
                }
            }
        }
        return dataAbstract;
    }

    public static DataAbstract createVideo(String md5) {
        DataAbstract dataAbstract = null;
        synchronized (dataVideo) {
            dataAbstract = dataVideo.get(md5);
        }
        if (dataAbstract == null) {
            synchronized (dataVideo) {
                dataAbstract = dataVideo.get(md5);
                if (dataAbstract == null) {
                    dataAbstract = new Animation(md5);
                    dataVideo.put(md5, dataAbstract);
                }
            }
        }
        return dataAbstract;
    }
}
