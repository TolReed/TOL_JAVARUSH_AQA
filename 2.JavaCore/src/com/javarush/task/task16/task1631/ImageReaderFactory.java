package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
        if (imageTypes == ImageTypes.BMP) {
            return new BmpReader();
        }
        if (imageTypes == ImageTypes.PNG) {
            return new PngReader();
        }
        if (imageTypes == ImageTypes.JPG) {
            return new JpgReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
/*
Ksenia Volkova
Если объект, который ты проверяешь - null, то проверка equals(null) кинет ошибку - потому что у null нельзя вызвать метод.
А == null вернет true, как и положено.
*/
