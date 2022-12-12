package CourseTasks.Homework13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur {
    public static void main(String[] args) throws IOException {
        // читаем картинку из файла image.jpg в объект класса BufferedImage
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
                double redColor = 0;
                double greedColor = 0;
                double blueColor = 0;

                int xOffset = x - offset;
                int yOffset = y - offset;

                for (int adjacentPixelY = yOffset, i = 0; i < matrix.length; adjacentPixelY++, i++) {
                    for (int adjacentPixelX = xOffset, j = 0; j < matrix.length; adjacentPixelX++, j++) {
                        inputRaster.getPixel(adjacentPixelX, adjacentPixelY, pixel);
                        redColor += pixel[0] * matrix[i][j];
                        greedColor += pixel[1] * matrix[i][j];
                        blueColor += pixel[2] * matrix[i][j];
                    }
                }

                pixel[0] = saturate(redColor);
                pixel[1] = saturate(greedColor);
                pixel[2] = saturate(blueColor);

                // записываем значения цветов для пикселя в картинку
                outputRaster.setPixel(x, y, pixel);
            }
        }

        // сохраняем картинку в файл
        ImageIO.write(outputImage, "png", new File("Homework/src/CourseTasks/Homework13/out.png"));
    }

    public static int saturate(double color) {
        if (color > 255) {
            return 255;
        }

        return (int) Math.round(Math.max(color, 0));
    }
}
