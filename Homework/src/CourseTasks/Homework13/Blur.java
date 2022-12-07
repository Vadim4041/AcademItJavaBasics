package CourseTasks.Homework13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur {
    public static void main(String[] args) throws IOException {
        // читаем картинку из файлу image.jpg в объект класса BufferedImage
        BufferedImage inputImage = ImageIO.read(new File("Homework/src/CourseTasks/Homework13/image.jpg"));
        BufferedImage outputImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), inputImage.getType());

        // получаем растр - объект, внутри которого содержится двумерный массив пикселей
        WritableRaster inputRaster = inputImage.getRaster();
        WritableRaster outputRaster = outputImage.getRaster();

        // получаем ширину и высоту картинки
        int width = inputRaster.getWidth();
        int height = inputRaster.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;

        // создаем массив, в котором будет содержаться текущий пиксель
        // это массив из 3 элементов, в нем по очереди лежат числа R, G, B
        // т.е. по индексу 0 будет лежать красная компонента, по индексу 1 - зеленая, по индексу 2 - синяя
        int[] pixel = new int[COLORS_COUNT_IN_RGB];

        double[][] matrix = {
                {1.0 / 9, 1.0 / 9, 1.0 / 9},
                {1.0 / 9, 1.0 / 9, 1.0 / 9},
                {1.0 / 9, 1.0 / 9, 1.0 / 9}
        };

        int offset = matrix.length / 2;

        // цикл по строкам картинки
        for (int y = offset; y < height - offset; ++y) {
            // цикл по пикселям строки
            for (int x = offset; x < width - offset; ++x) {
                // делаем размытие
                double redColorAltered = 0;
                double greedColorAltered = 0;
                double blueColorAltered = 0;

                int offsetY = y - offset;
                int offsetX = x - offset;
                for (int adjacentPixelY = offsetY; adjacentPixelY <= y + offset; adjacentPixelY++) {
                    for (int adjacentPixelX = offsetX; adjacentPixelX <= x + offset; adjacentPixelX++) {
                        inputRaster.getPixel(adjacentPixelX, adjacentPixelY, pixel);
                        redColorAltered += pixel[0] * matrix[adjacentPixelY - offsetY][adjacentPixelX - offsetX];
                        greedColorAltered += pixel[1] * matrix[adjacentPixelY - offsetY][adjacentPixelX - offsetX];
                        blueColorAltered += pixel[2] * matrix[adjacentPixelY - offsetY][adjacentPixelX - offsetX];
                    }
                }

                pixel[0] = saturate((int) Math.round(redColorAltered));
                pixel[1] = saturate((int) Math.round(greedColorAltered));
                pixel[2] = saturate((int) Math.round(blueColorAltered));
                // записываем значения цветов для пикселя в картинку
                outputRaster.setPixel(x, y, pixel);
            }
        }

        // сохраняем картинку в файл
        ImageIO.write(outputImage, "png", new File("Homework/src/CourseTasks/Homework13/out.png"));
    }

    public static int saturate(int color) {
        if (color > 255) {
            return 255;
        } else return Math.max(color, 0);
    }
}
