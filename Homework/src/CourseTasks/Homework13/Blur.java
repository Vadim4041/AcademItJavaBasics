package CourseTasks.Homework13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur {
    public static void main(String[] args) throws IOException {
        // читаем картинку из файлу image.jpg в объект класса BufferedImage
        BufferedImage imageIn = ImageIO.read(new File("Homework/src/CourseTasks/Homework13/image.jpg"));
        BufferedImage imageOut = ImageIO.read(new File("Homework/src/CourseTasks/Homework13/out.png"));

        // получаем растр - объект, внутри которого содержится двумерный массив пикселей
        WritableRaster rasterIn = imageIn.getRaster();
        WritableRaster rasterOut = imageOut.getRaster();

        // получаем ширину и высоту картинки
        int width = rasterIn.getWidth();
        int height = rasterIn.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;

        // создаем массив, в котором будет содержаться текущий пиксель
        // это массив из 3 элементов, в нем по очереди лежат числа R, G, B
        // т.е. по индексу 0 будет лежать красная компонента, по индексу 1 - зеленая, по индексу 2 - синяя
        int[] pixel = new int[COLORS_COUNT_IN_RGB];

        double[][] pixelMatrix = {
                {1.0 / 9, 1.0 / 9, 1.0 / 9},
                {1.0 / 9, 1.0 / 9, 1.0 / 9},
                {1.0 / 9, 1.0 / 9, 1.0 / 9}
        };

        final int RESOLUTION = 3;
        int offset = (RESOLUTION - 1) / 2;
        // цикл по строкам картинки
        for (int y = offset; y < height - offset; ++y) {
            // цикл по пикселям строки
            for (int x = offset; x < width - offset; ++x) {
                // делаем размытие
                int redColorAltered = 0;
                int greedColorAltered = 0;
                int blueColorAltered = 0;

                for (int y1 = y - offset; y1 <= y + offset; y1++) {
                    for (int x1 = x - offset; x1 <= x + offset; x1++) {
                        rasterIn.getPixel(x1, y1, pixel);
                        redColorAltered += pixel[0] * pixelMatrix[y1 - y + offset][x1 - x + offset];
                        greedColorAltered += pixel[1] * pixelMatrix[y1 - y + offset][x1 - x + offset];
                        blueColorAltered += pixel[2] * pixelMatrix[y1 - y + offset][x1 - x + offset];
                    }
                }

                pixel[0] = saturate(redColorAltered);
                pixel[1] = saturate(greedColorAltered);
                pixel[2] = saturate(blueColorAltered);
                // записываем значения цветов для пикселя в картинку
                rasterOut.setPixel(x, y, pixel);
            }
        }

        // сохраняем картинку в файл
        ImageIO.write(imageOut, "png", new File("Homework/src/CourseTasks/Homework13/out.png"));
    }

    public static int saturate(int color) {
        return Math.min(Math.max(color, 0), 255);
    }
}
